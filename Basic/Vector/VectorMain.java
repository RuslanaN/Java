public class VectorMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vector a = new Vector(2, 7);
        Vector b = new Vector(6, 8);
        Vector c = b.clone();
        Vector d = new Vector();

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("d:" + d);

        if ( a.equals(b) ) {
            System.out.println("vectors are equals");
        } else {
            System.out.println("vectors are not equals");
        }

        System.out.println("len a: " + a.len());
        System.out.println("sum(a, b): " + a.sum(b));
        System.out.println("diff(a, b): " + a.diff(b));
    }
}
