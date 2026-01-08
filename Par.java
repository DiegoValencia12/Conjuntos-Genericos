public class Par<T>{
    private final T A;
    private final T B;

    public Par(T a, T b){
        this.A = a;
        this.B = b;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();//String en vez de StringBuilder?
        sb.append("{ ").append(A).append(", ").append(B).append(" }");
        return sb.toString();
    }
}
