/*
PROYECTO: Conjuntos Genericos
NOMBRE: Diego Valencia Figueroa
FECHA: 30 de octubre del 2025
DESCRIPCIÓN: Implementar las operaciones de conjuntos.
 */
import java.util.*;

public class Main{
    public static void main(String[] args){
        Conjunto <String> a = new Conjunto<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes"));
        //Conjunto <String> a = new Conjunto<>();
        Conjunto <Integer> b = new Conjunto<>(Arrays.asList(1, 2, 3, 4, 5));
        //Conjunto <String> b = new Conjunto<>();
        Conjunto <String> u = new Conjunto<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
        //Conjunto <String> c = new Conjunto<>();
        System.out.println("1. a vacio: "+a.vacio());
        System.out.println("2. Lunes pertenece al conjunto a: "+a.pertenencia("Lunes")+"\n");
        //System.out.println("3. ¿b es subconjunto de a?: "+b.subconjunto(a)+"\n");
        //System.out.println("4. ¿b es subconjunto propio de a?: "+b.subconjuntoPropio(a)+"\n");
        //System.out.println("5. Unión de a con b: "+a.union(b)+"\n");
        //System.out.println("6. Intersección de a con b: "+a.interseccion(b)+"\n");
        //System.out.println("7. Diferencia de a con b: "+a.diferencia(b)+"\n");
        System.out.println("8. Complemento de a para llegar al universo: "+u.diferencia(a)+"\n");
        System.out.println("9. Clonación del conjunto a: "+a.clonacion()+"\n");
        //System.out.println("11. ¿Conjunto a es igual al conjunto b?: "+a.igualdad(b)+"\n");
        System.out.println("12. Producto cartésiano de axb: "+a.productoCartesiano(b)+"\n");
        System.out.println("13. Potencia del conjunto a: "+a.pow()+"\n");
    }
}