public class IdentifiableMain {
    public static void main(String[] args) {
        Identifiable id1 = new Identifiable();
        Identifiable id2 = new Identifiable();
        Identifiable id3 = new Identifiable();

        System.out.println("Id 1: " + id1.getId());
        System.out.println("Id 2: " + id2.getId());
        System.out.println("Id 3: " + id3.getId());
    }
}
