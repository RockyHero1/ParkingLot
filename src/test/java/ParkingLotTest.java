import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.parkingLot.Parkable;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {



//    public void dummyParkedCars(int noOfCars){
//        ParkingLot parkingLot = new ParkingLot();
//        this.occupied = noOfCars;
//        this.parkedCarList = new ArrayList<>(noOfCars);
//        for(int i=0; i<noOfCars; i++){
//            parkedCarList.add(new Car("xyz"+ Integer.toString(i)));
//        }
//    }

    @Test
    @DisplayName("Should not be able to park if capacity is 1 and occupied is 1")
    public void checkIfCanParkWhenCapcityIsFull(){
        Parkable parkable = new FakeCar("DL3458");
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(parkable);

        Parkable parkable2 = new FakeCar("RL3456");
//        parkingLot.parkedCars(0);
        boolean parked = parkingLot.park(parkable2);
        assertFalse(parked);
    }

    @Test
    @DisplayName("Should not be able to park if same registered car comes")
    public void checkIfCanParkWhenRegNoExist(){
        Parkable parkable = new FakeCar("DL3458");
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(parkable);

        Parkable parkable2 = new FakeCar("DL3458");
//        parkingLot.parkedCars(0);
        boolean parked = parkingLot.park(parkable2);
        assertFalse(parked);
    }

    @Test
    @DisplayName("Should be able to park if capacity is 10 and occupied is 9")
    public void checkIfCanParkWhenOccupied9(){
        Parkable parkable = new FakeCar("DL3458");
        ParkingLot parkingLot = new ParkingLot(10); //capacity
//        parkingLot.parkedCars(9);
        boolean parked = parkingLot.park(parkable);
        assertTrue(parked); //assertTrue/False
    }
    @Test
    @DisplayName("Should not be able to park if capacity is 0 occupied is 0")
    public void checkIfCanParkWhenOccupied10(){
        Parkable parkable = new FakeCar("DL3458");
        ParkingLot parkingLot = new ParkingLot(0);
//        parkingLot.parkedCars(10);
        boolean parked = parkingLot.park(parkable);
        assertFalse(parked);
    }

    @Test
    @DisplayName("Should not be able to park if capacity is 10 occupied is 10")
    public void checkIfCarIsPresentToUnpark(){
        Parkable parkable = new FakeCar("xyz3");
        Parkable parkable2 = new FakeCar("xyz4");

        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.park(parkable);
        parkingLot.park(parkable2);

//        parkingLot.parkedCars(5);
        boolean isUnparked = parkingLot.unpark(parkable);
        assertTrue(isUnparked);
    }


}
