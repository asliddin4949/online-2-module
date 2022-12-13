package OOPandCollections.Lesson12.Task1;

public class Fruit {
    String name;
    String type;
    int sale;

    public Fruit(String name, String type, int sale) {
        this.name = name;
        this.type = type;
        this.sale = sale;

    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSale() {
        return sale;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sale=" + sale +'%'+
                '}';
    }
}
