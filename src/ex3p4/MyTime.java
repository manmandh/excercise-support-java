package ex3p4;
public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute, second);
    }

    public MyTime nextSecond() {
        if (hour==23 && minute==59 && second==59) {
            hour=0;
            minute=0;
            second=0;
        }
        else if (minute==59 && second ==59) {
            hour++;
            minute=0;
            second=0;
        }
        else if (second==59) {
            minute++;
            second =0;
        }
        else second++;
        return this;
    }

    public MyTime nextMinute() {
        if (hour==23 && minute==59) {
            hour=0;
            minute=0;
        }
        else if (minute==59) {
            hour++;
            minute=0;
        }
        else minute++;
        return this;
    }

    public MyTime nextHour() {
        if (hour==23) {
            hour=0;
        }
        else hour++;
        return this;
    }

    public MyTime previousSecond() {
        if (hour==0 && minute==0 && second==0) {
            hour=23;
            minute=59;
            second=59;
        }
        else if (minute==0&& second==0) {
            minute=59;
            second=59;
            hour--;
        }
        else if (second==0) {
            second=59;
            minute--;
        }else
            second--;
        return this;
    }

    public MyTime previousMinute() {
        if (hour==0 && minute==0) {
            hour=23;
            minute=59;
        }
        else if (minute==0) {
            hour--;
            minute=0;
        }
        else minute--;
        return this;
    }

    public MyTime previousHour() {
        if (hour==0) {
            hour=23;
        }
        else hour--;
        return this;
    }
}

