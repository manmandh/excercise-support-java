package ex1p7;
public class Date {
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
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

        public void setDay(int day) {
            if (day>=1 && day<=31) {
                this.day=day;
            }
            else this.day=0;
        }

        public void setMonth(int month) {
            if(month>=1 && month<=12)
                this.month=month;
            else this.month=0;
        }

        public void setYear(int year) {
            if (year>=1900 && year <=9999)
                this.year=year;
            else this.year=0;
        }

        public void setDate(int day, int month, int year) {
            if (day>=1 && day<=31)
                this.day=day;
            else this.day=0;

            if(month>=1 && month<=12)
                this.month=month;
            else this.month=0;

            if (year>=1900 && year <=9999)
                this.year=year;
            else this.year=0;
        }

        @Override
        public String toString() {
            return String.format("%02d/%02d/%04d",day, month, year);
        }


}
