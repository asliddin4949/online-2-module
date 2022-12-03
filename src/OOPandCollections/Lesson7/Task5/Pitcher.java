package OOPandCollections.Lesson7.Task5;

public class Pitcher extends BaseballPlayer{
    double innings;
    int earnedRuns;
    double earnedRunAverage(){
        return innings/earnedRuns;
    }
    @Override
    double battingAverage() {
        return atBats/hits;
    }
}
