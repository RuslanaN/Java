public class Mohican {
    private static Mohican last;
    private Mohican prev;
    private Mohican next;
    private int id;
    
    public Mohican (int id) {
        this.id = id;

        if ( last == null ) {
            last = this;
            prev = null;
            next = null;
        } else {
            prev = last;
            last.next = this;
            last = this;
            next = null;
        }
    }

    public static Mohican getLast() {
        return last;
    }

    public int getId() {
        return id;
    }

    protected void finalize() throws Throwable {
        if ( next == null ) {
            last = prev;
            prev.next = null;
        } else {
            prev.next = next;
            next.prev = prev;
        }
    }
}
