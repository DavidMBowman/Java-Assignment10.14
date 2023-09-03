import java.util.GregorianCalendar;

public class Assignment10_14 {

    static class MyDate {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        private int year;
        private int month;
        private int day;

        public MyDate() {
            this(System.currentTimeMillis());
        }

        public MyDate(long elapsedTime) {
            setDate(elapsedTime);
        }

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public void setDate(long elapsedTime) {
            gregorianCalendar.setTimeInMillis(elapsedTime);
            this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
            this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
            this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        }

        public int getYear() {
            return year;
        }

        public MyDate setYear(int year) {
            this.year = year;
            return this;
        }

        public int getMonth() {
            return month;
        }

        public MyDate setMonth(int month) {
            this.month = month;
            return this;
        }

        public int getDay() {
            return day;
        }

        public MyDate setDay(int day) {
            this.day = day;
            return this;
        }
    }

    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);
        MyDate myDate3 = new MyDate(561555550000L);

        System.out.println("MyDate1: " + myDate1.getMonth() + "/" + myDate1.getDay() + "/" + myDate1.getYear());
        System.out.println("MyDate2: " + myDate2.getMonth() + "/" + myDate2.getDay() + "/" + myDate2.getYear());
        System.out.println("MyDate3: " + myDate3.getMonth() + "/" + myDate3.getDay() + "/" + myDate3.getYear());
    }
}