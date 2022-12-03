package OOPandCollections.Lesson7.Task5;

public class Goalie extends SoccerPlayer{
    int goalsAllowed;
    double averageGoalsAllowed;

    @Override
    double goalsPerGame() {
        return (minutes/90)/goals;
    }
}
