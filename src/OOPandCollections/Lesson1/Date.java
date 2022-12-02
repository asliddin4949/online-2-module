package OOPandCollections.Lesson1;

public class Date {

    public String year;
    public String month;
    public String date;

    public void setDate(int date, int month, int year) {
        if (date > 0 && date < 31) {
            if (date < 10) {
                this.date=""+0+date;
            } else {
                this.date = ""+date;
            }
        }
        if (month > 0 && month < 13) {
            if (month < 10) {
                this.month=""+0+month;
            } else {
                this.month = ""+month;
            }
        }
        this.year =""+ year;
    }

    public void printDate() {
        System.out.println(this.date + "." + this.month + "." + this.year);
    }

    public static void main(String[] args) {
        Date today = new Date();
        today.setDate(1,2,2022);
        today.printDate();
    }


}
