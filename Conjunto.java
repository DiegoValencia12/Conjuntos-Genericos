/*
PROYECTO: Conjuntos
NOMBRE: Diego Valencia Figueroa
DESCRIPCIÓN: Implementar las operaciones de conjuntos.
 */
import java.util.*;
public class Conjunto<T> implements Interface<T>{
    private LinkedHashSet<T> elementos = new LinkedHashSet<>();
    //private final LinkedHashSet<T> UNIVERSO = new LinkedHashSet<>();
    /*
    @SafeVarargs
    public Conjunto(T... elementos){this.elementos = new LinkedHashSet<>(Arrays.asList(elementos));}
    */
    public Conjunto(Collection<T> elementos){
        this.elementos = new LinkedHashSet<>(elementos);}


    public Conjunto(){this.elementos = new LinkedHashSet<>();}

    @Override
    public void agregar(T elemento){elementos.add(elemento);}

    //1. Vacio
    @Override
    public boolean vacio(){return this.elementos.isEmpty();}

    //2. Pertenencia
    @Override
    public boolean pertenencia(T elemento){return this.elementos.contains(elemento);}

    //3. Subconjunto
    @Override
    public boolean subconjunto(Conjunto<T> c2){return this.elementos.containsAll(c2.elementos);}

    //4. Subconjunto propio
    @Override
    public boolean subconjuntoPropio(Conjunto<T> c2)
    {return this.subconjunto(c2) && this.elementos.size()>c2.elementos.size();}

    //5. Unión
    @Override
    public Conjunto<T> union(Conjunto<T> c2){
        LinkedHashSet<T> c3 = new LinkedHashSet<>(this.elementos);
        c3.addAll(c2.elementos);
        //@SuppressWarnings("unchecked")
        //T[] arreglo = (T[]) c3.toArray((T[]) new Object[0]);
        return new Conjunto<>(c3);
    }

    //6. Intersección
    @Override
    public Conjunto<T> interseccion(Conjunto<T> c2){
        LinkedHashSet<T> c3 = new LinkedHashSet<>(this.elementos);
        c3.retainAll(c2.elementos);
        return new Conjunto<>(c3);
    }

    //7. Diferencia y complemeto.
    @Override
    public Conjunto<T> diferencia(Conjunto<T> c2){
        LinkedHashSet<T> c3 = new LinkedHashSet<>(this.elementos);
        c3.removeAll(c2.elementos);
        return new Conjunto<>(c3);
    }

    //9. Clonación
    @Override
    public Conjunto<T> clonacion(){
        LinkedHashSet<T> c2 = new LinkedHashSet<>();
        for(T e:this.elementos){c2.add(e);}
        return new Conjunto<>(c2);
    }

    //10. toString
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for(T e:elementos){sb.append(e).append(", ");}
        sb.deleteCharAt(sb.length()-2);
        sb.append("}");
        return sb.toString();
    }

    //11. Igualdad
    public boolean ingualdad(Conjunto<T> c2){return this.elementos.equals(c2.elementos);}

    //12. Producto cartesiano
    @SuppressWarnings("unchecked")
    @Override
    public Conjunto<T> productoCartesiano(Conjunto<T> c2){
        LinkedHashSet<T> c3 = new LinkedHashSet<>();
        for(T a:this.elementos){
            for(T b:c2.elementos){
                c3.add((T) new Par<>(a,b));
            }
        }
        return new Conjunto<>(c3);
    }

    //13. Potencia
    @Override
    public Conjunto<Conjunto<T>> pow(){
        Conjunto<Conjunto<T>> potencia = new Conjunto<>();//Lista de conjuntos vacia para resultado
        //Convertir conjunto original (elementos) en una lista, para poder acceder a los elementos por índice
        List<T> lista = new ArrayList<>(elementos);
        int n = lista.size();//Total de elementos
        int total = 1 << n; //2^n subconjuntos

        for (int i = 0; i < total; i++){//Recorre todos los subconjuntos posibles 0 - 2^n-1
            LinkedHashSet<T> subconjunto = new LinkedHashSet<>();//HashSet vacio que representa el subconjunto actual
            for (int j = 0; j < n; j++){//Revisa cada elemento del conjunto
                //Operación AND entre bits i(posición conjunto) y bits j(posición elemento)
                if ((i & (1 << j)) != 0)
                {subconjunto.add(lista.get(j));}
            }
            potencia.agregar(new Conjunto<>(subconjunto));
        }
        return potencia;
    }

}
