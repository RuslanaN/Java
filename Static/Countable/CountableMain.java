public class CountableMain {
    public static void main(String[] args) throws Throwable {
        Countable c = new Countable();
        Countable c1 = new Countable();
        Countable c2 = new Countable();
        Countable c3 = new Countable();

        System.out.println("Total count: " + Countable.getTotalCount());

        c2.finalize();

        System.out.println("Total count: " + Countable.getTotalCount());
    }
}
