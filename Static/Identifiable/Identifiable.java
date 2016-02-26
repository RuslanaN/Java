public class Identifiable {
    private static int lastId = 1;
    private int id;
        
    public Identifiable() {
        this.id = lastId;
        lastId += 1;
    }

    public int getId() {
        return id;
    }
}
