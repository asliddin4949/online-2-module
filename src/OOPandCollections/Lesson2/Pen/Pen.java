package OOPandCollections.Lesson2.Pen;

public class Pen {

    private boolean button;
    private double inq;
    private String inqColor;
    private double inqConsumption;

    public void write(String word) {
        if (this.button) {
            if (this.inq > 0) {
                String forprint = "";
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != ' ' && Character.isUpperCase(word.charAt(i)) && (this.inq - this.inqConsumption * 2) >= 0) {
                        forprint = forprint + word.charAt(i);
                        this.inq = this.inq - this.inqConsumption * 2;
                        //    System.out.println(forprint);
                        //     System.out.println(this.inq);
                    } else if (word.charAt(i) != ' ' && (this.inq - this.inqConsumption) >= 0) {
                        forprint = forprint + word.charAt(i);
                        this.inq = this.inq - this.inqConsumption;
                        //     System.out.println(forprint);
                        //     System.out.println(this.inq);
                    } else if (word.charAt(i) == ' ') {
                        forprint = forprint + word.charAt(i);
                    } else {
                        break;
                    }
                }

                if (forprint.equals(word)) {
                    System.out.println(forprint);
                } else {
                    System.out.println(forprint);
                    System.err.println("Inq is not enough to write completely!");
                    System.err.println("Left inq: "+inq);
                }
            } else {
                System.err.println("The Pen is out of Inq!");
            }


        } else {
            System.err.println("Please! Click the button!");
        }


    }

    public void clickButton() {
        this.button = !this.button;
    }

    public double getInq() {
        return inq;
    }

    public void setInq(double inq) {
        this.inq = inq;
    }

    public String getInqColor() {
        return inqColor;
    }

    public void setInqColor(String inqColor) {
        this.inqColor = inqColor;
    }

    public void setInqConsumption(double inqConsumption) {
        this.inqConsumption = inqConsumption;
    }
}
