import org.parkingLot.Parkable;

import java.util.ArrayList;

public class ParkingLot {

    int MAX_CAPACITY;
    int occupied = 0;
    ArrayList<Parkable> parkedVehicleList; // = new ArrayList<>(MAX_CAPACITY);

    public ParkingLot(int capacity) {
        this.MAX_CAPACITY = capacity;
        this.occupied = 0;
        this.parkedVehicleList = new ArrayList<>(MAX_CAPACITY);
    }

//

    public boolean park(Parkable parkable) {
        if(parkedVehicleList.contains(parkable)){
            return false; // add msg.
        }
        if(MAX_CAPACITY-this.occupied>0){
            this.occupied += 1;
            parkedVehicleList.add(parkable);
        }
        else {
            return false;
        }
        return true;
    }

    public boolean unpark(Parkable parkable){
        if(parkedVehicleList.contains(parkable)){
            parkedVehicleList.remove(parkable);
            this.occupied -= 1;
            return true;
        }

        return false;
    }


}
