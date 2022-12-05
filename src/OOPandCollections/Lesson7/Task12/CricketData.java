package OOPandCollections.Lesson7.Task12;

public class CricketData implements Subject{

    int runs;
    int wickets;
    float overs;
    Observer observer[];

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void unregisterObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
    int getLatestRuns(){
        return runs;
    }

    int getLatestWickets(){
        return wickets;
    }
    int getLatestOvers(){
        return (int) overs;
    }
}
