/*
PROYECTO: Conjuntos
NOMBRE: Diego Valencia Figueroa
DESCRIPCIÓN: Implementar las operaciones de conjuntos.
 */
import java.util.*;

public class Main{
    public static void main(String[] args){
        Conjunto <String> a = new Conjunto<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes"));
        Conjunto <String> b = new Conjunto<>(Arrays.asList("Viernes", "Sabado", "Domingo"));
        Conjunto <String> u = new Conjunto<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
        //Conjunto <String> c = new Conjunto<>();
        System.out.println("a vacio: "+a.vacio());
        System.out.println("1 pertenece al conjunto a: "+a.pertenencia("Lunes")+"\n");
        System.out.println("¿b es subconjunto de a?: "+b.subconjunto(a)+"\n");
        System.out.println("¿b es subconjunto propio de a?: "+b.subconjuntoPropio(a)+"\n");
        System.out.println("Unión de a con b: "+a.union(b)+"\n");
        System.out.println("Intersección de a con b: "+a.interseccion(b)+"\n");
        System.out.println("Diferencia de a con b: "+a.diferencia(b)+"\n");
        System.out.println("Complemento de a para llegar al universo: "+u.diferencia(a)+"\n");
        System.out.println("¿Conjunto a es igual al conjunto b?: "+a.ingualdad(b)+"\n");
        System.out.println("Producto cartésiano de axb: "+a.productoCartesiano(b)+"\n");
    }
}