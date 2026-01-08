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
    boolean igualdad(Conjunto<T> c2);
    Conjunto<Conjunto<T>> pow();
    <U>Conjunto<Par<T, U>> productoCartesiano(Conjunto<U> c2);
}
