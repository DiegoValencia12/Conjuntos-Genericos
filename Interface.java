/*
NOMBRE: Diego Valencia Figueroa
PROYECTO: Conjuntos
FECHA: 30 de octubre del 2025
FUNCIÓN:Implementar con métodos las operaciones entre conjuntos.
 */
public interface Interface<T>{
    void agregar(T elemento);
    boolean vacio();
    boolean pertenencia(T elemento);
    Conjunto<T> union(Conjunto<T> c2);
    Conjunto<T> interseccion(Conjunto<T> c2);
    Conjunto<T> diferencia(Conjunto<T> c2);
    Conjunto<T> clonacion();
    boolean subconjunto(Conjunto<T> c2);
    boolean subconjuntoPropio(Conjunto<T> c2);
    Conjunto<Conjunto<T>> pow();
    Conjunto<T> productoCartesiano(Conjunto<T> c2);
}
