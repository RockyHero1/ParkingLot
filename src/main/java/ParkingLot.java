import org.parkingLot.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ParkingLot {

    int MAX_CAPACITY;
    int occupied = 0;
    ArrayList<Car> parkedCarList;

    public ParkingLot(int capacity) {
        this.MAX_CAPACITY = capacity;
        this.occupied = 0;
        this.parkedCarList = new ArrayList<>(MAX_CAPACITY);
    }

    public boolean park(Car car) {
        if(MAX_CAPACITY-occupied>0){
            occupied += 1;
            parkedCarList.add(car);
        }
        else {
            return false;
        }
        return true;
    }


}
