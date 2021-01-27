package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private final List<Passenger> passengerList = new ArrayList<>();

    public boolean addPassenger(Passenger passenger) {
        if(passenger.haveTicket()) {
            passengerList.add(passenger);
            return true;
        }else {
            return false;
        }
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}
