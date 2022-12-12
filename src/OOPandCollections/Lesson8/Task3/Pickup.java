package OOPandCollections.Lesson8.Task3;

public class Pickup implements CargoAuto, PassengersAuto {
    @Override
    public void transportPassengers() {
        PassengersAuto.super.transportPassengers();
    }

    {
        CargoAuto.transportCargo();
    }
}
