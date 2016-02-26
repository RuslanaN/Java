public class MohicanMain {
    public static void main(String[] args) throws Throwable {
        Mohican m1 = new Mohican(1111);
        Mohican m2 = new Mohican(1112);
        Mohican m3 = new Mohican(1113);
        Mohican m4 = new Mohican(1114);

        System.out.println("Last Mohican id: " + Mohican.getLast().getId());

        m3.finalize();
        m2.finalize();
        m4.finalize();

        System.out.println("Last Mohican id: " + Mohican.getLast().getId());
    }
}
