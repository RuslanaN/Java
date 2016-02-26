public class Date {
    private int day;
    private int month;
    private int year;

    private void validate(int day, int month, int year) throws InvalidDateException {
        if ( day < 1 || day > 31 ) {
            throw new InvalidDateException("Invalid Day!");
        }
        if ( month < 1 || month > 12 ) {
            throw new InvalidDateException("Invalid Month!");
        }
        if ( year < 0 ) {
            throw new InvalidDateException("Invalid Year!");
        }
        if ( month == 2 || month == 4 || month == 6 || month == 9 || month == 11 ) {
            if ( day == 31) {
                throw new InvalidDateException("Invalid Month!");
            }
        }
        if ( day == 30 && month == 2 ) {
            throw new InvalidDateException("Invalid Month!");
        }
        if ( year % 4 != 0 ) {
            if ( day == 29 && month == 2 ) {
                throw new InvalidDateException("Error, February has 28 days!");
            }
        }
    }

    public Date(int day, int month, int year) throws InvalidDateException {
        validate(day, month, year);

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() throws InvalidDateException {
        this(1, 1, 1970);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        StringBuffer out = new StringBuffer();

        if ( day < 10 ) {
            out.append("0");
        }
        out.append(day + ".");
        if ( month < 10 ) {
            out.append("0");
        }
        out.append(month + "." + year);

        return out.toString();
    }
}
