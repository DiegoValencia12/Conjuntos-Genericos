/*
NOMBRE: Diego Valencia Figueroa
PROYECTO: Conjuntos Genericos
FECHA: 30 de octubre del 2025
FUNCIÓN:Implementar con métodos las operaciones entre conjuntos.
 */

import java.util.Objects;

public class Par<A, B>{
    private final A PRIMERO;
    private final B SEGUNDO;

    public Par(A primero, B segundo){
        this.PRIMERO = primero;
        this.SEGUNDO = segundo;
    }

    @Override
    public boolean equals(Object o){//Dos pares son iguales si su primer elemento y su segundo elemento son iguales.
        if (this == o) return true;//Decidir si dos objetos son “iguales en contenido”, no en memoria.
        if (o == null || getClass() != o.getClass()) return false;

        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(PRIMERO, par.PRIMERO)
        && Objects.equals(SEGUNDO, par.SEGUNDO);
    }

    @Override
    public int hashCode()
        {return Objects.hash(PRIMERO, SEGUNDO);}//Si dos objetos son iguales según equals(), DEBEN tener el mismo hashCode()

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{ ").append(PRIMERO).append(", ").append(SEGUNDO).append(" }");
        return sb.toString();
    }
}
