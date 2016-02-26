public class Countable {
    private static int totalCount = 0;

    public Countable() {
        totalCount += 1;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    protected void finalize() throws Throwable {
        totalCount -= 1;
    }
}
