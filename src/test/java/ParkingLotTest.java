import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.parkingLot.Car;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    @Test
    @DisplayName("Should be able to park if occupied is 0")
    public void checkIfCanParkWhenOccupied0(){
        Car car = new Car("DL3458");
        ParkingLot parkingLot = new ParkingLot(0);
        boolean parked = parkingLot.park(car);
        assertTrue(parked);
    }

    @Test
    @DisplayName("Should be able to park if occupied is 9")
    public void checkIfCanParkWhenOccupied9(){
        Car car = new Car("DL3458");
        ParkingLot parkingLot = new ParkingLot(9); //capacity
        boolean parked = parkingLot.park(car);
        assertTrue(parked); //assertTrue/False
    }
    @Test
    @DisplayName("Should not be able to park if occupied is 10")
    public void checkIfCanParkWhenOccupied10(){
        Car car = new Car("DL3458");
        ParkingLot parkingLot = new ParkingLot(10);
        boolean parked = parkingLot.park(car);
        assertFalse(parked);
    }


}
