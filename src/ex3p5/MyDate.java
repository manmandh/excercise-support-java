package ex3p5;
public class MyDate {
    private int year;
    private int month;
    private int day;

    public String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public String[] DAYS = {"Sunday","Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"};
    public int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

    public boolean isLeapYear(int year) {
        if (year %400 ==0 || year %100!=0 && year%4==0) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (isLeapYear(year)==true && month==2) {
            if(day<1 && day>29)
                return false;
        }

        if (month==2) {
            if(day<1&&day>28)
                return false;
        }

        int days = DAYS_IN_MONTHS[month-1];	// nhap vao bien days gia tri DAYS_IN_MONTHS.
        //EX:month=1--> DAYS_IN_MONTHS[0]=31

        if (year<1 && year>9999)
            return false;
        if(month<1 &&month>12)
            return false;
        if (day>days || day<1)
            return false;
        return true;
    }

    public int getNumberOfWeek(int year, int month, int day) { // chi ap dung cho nam 2000-2099
        if (!isValidDate(year, month, day))
            return -1;

        int buoc3 = (year%100)/4;
        int so;

        if (isLeapYear(year)==true) {
            int[] buoc4 = {6,2,3,6,1,4,6,2,5,0,3,5};
            return (6+ year%100 + buoc3 +buoc4[month-1] +day)%7;
        }
        else {
            int[] buoc4 = {0,3,3,6,1,4,6,2,5,0,3,5};
            return (6+ year%100 + buoc3 +buoc4[month-1] +day)%7;
        }
    }

    public String getDayOfWeek(int year, int month, int day) {
        return DAYS[getNumberOfWeek(year, month, day)];
    }

    public  int getMonthLastDay(int year, int month) {
        return DAYS_IN_MONTHS[month-1] + (isLeapYear(year) && month == 2 ? 1 : 0 );
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return getDayOfWeek(this.year, this.month, this.day)+" "+day+" "+MONTHS[month-1]+" "+year;
    }

    public MyDate nextYear() {
        if (isValidDate(this.year+1, this.month, this.day)==true){
            year++;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month==12) {
            month=1;
            year++;
            return this;
        }
        setDate(year, month+1, day);
        return this;
    }

    public MyDate nextDay() {
        int maxDay = getMonthLastDay(year, month);
        if (maxDay == day &&day==12&& year==999) {
            return this;
        }
        if (day==31 && month ==12) {
            day=1;
            month=1;
            year++;
            return this;
        }
        if (this.day ==DAYS_IN_MONTHS[month-1]) {
            day=1;
            month++;
            return this;
        }
        setDate(year, month, day+1);
        return this;
    }


    public MyDate previousDay() {
        if (this.day==1 && this.month==1) {
            setDate(year-1, 12, 31);
            return this;
        }
        if (this.day==1) {
            this.day=DAYS_IN_MONTHS[month-2];
            month--;
        }
        setDate(year, month, day-1);
        return this;
    }

    public MyDate previousMonth() {
        if (month==1) {
            month=12;
            year--;
            return this;
        }
        month--;
        return this;
    }

    public MyDate previousYear() {
        if (isValidDate(this.year-1, this.month, this.day)) {
            year--;
        }
        return this;
    }
}