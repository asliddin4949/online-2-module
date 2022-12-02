package OOPandCollections.Lesson2.Time;

public class Time {

    private int hour;
    private int minutes;
    private int seconds;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > -1 && hour < 24) {
            this.hour = hour;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > -1 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > -1 && seconds < 60) {
            this.seconds = seconds;
        }
    }

    public void printTime() {
        System.out.println(((this.hour < 10)?""+0+this.hour:this.hour)+":"
        +((this.minutes < 10)?""+0+this.minutes:this.minutes)+":"
        +((this.seconds < 10)?""+0+this.seconds:this.seconds));
    }
}
