public class PassportMain {
    public static void main(String[] args) throws InvalidDateException, InvalidSeriesException, OutOfSeriesException {
        Passport a = new Passport("Ruslana", "Nescheret", 05, 01, 1991);

        System.out.println(a);

        a.setSeries('B', 'K', 958789);

        System.out.println(a);
    }
}
