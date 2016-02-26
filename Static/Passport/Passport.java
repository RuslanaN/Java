public class Passport {
    private int id;
    private char series1, series2; 
    private String name;
    private String surname;
    private Date date;
    private static char lastSeries1 = 'A';
    private static char lastSeries2 = 'A';
    private static int lastId = 0;

    private void validate() throws OutOfSeriesException {
        if ( lastId < 1000000 ) {
            lastId += 1;
            id = lastId;
            series1 = lastSeries1;
            series2 = lastSeries2;
        } else if ( lastId == 1000000 ) {
            lastId = 0;
            lastSeries2 += 1;
        } else if ( lastId == 1000000 && lastSeries2 > 'Z' ) {
            lastId = 0;
            lastSeries1 += 1;
            lastSeries2 = 'A';
        } else {
            throw new OutOfSeriesException();
        }
    }

    public Passport(String name, String surname, int day, int month, int year) throws OutOfSeriesException, InvalidDateException {
        validate();

        this.name = name;
        this.surname = surname;
        this.id = id;
        date = new Date(day, month, year);
    }

    public int getId() {
        return id;
    }

    public char getSeries1() {
        return series1;
    }

    public char getSeries2() {
        return series2;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDate() {
        return date;
    }

    public void setSeries(char series1, char series2, int id) throws InvalidSeriesException {
        if ( series1 < 'A' || series1 > 'Z' ) {
            throw new InvalidSeriesException();
        }
        if ( series2 < 'A' || series2 > 'Z' ) {
            throw new InvalidSeriesException();
        }

        this.series1 = series1;
        this.series2 = series2;
        this.id = id;
}
    
    public String toString() {
        StringBuffer out = new StringBuffer();

         out.append("Passport No: " + series1 + series2);
         for ( int i = 100000; i > id; i /= 10 ) {
            out.append("0");
        }
        out.append(id + "\n");
        out.append("Surname: " + surname + "\n");
        out.append("Name: " + name + "\n");
        out.append("Date of Birth: " + date + "\n");

        return out.toString();
    }
}
