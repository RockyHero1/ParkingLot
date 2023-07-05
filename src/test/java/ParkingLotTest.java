import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {

    @Test
    @DisplayName("Should be able to park if occupied is 0")
    public void checkParked1CarTest(){
        ParkingLot parkingLot = new ParkingLot(0);
        boolean parked = parkingLot.park();

        Assertions.assertEquals(true,parked);
    }

    @Test
    @DisplayName("Should be able to park if occupied is 9")
    public void checkParked9CarTest(){
        ParkingLot parkingLot = new ParkingLot(9);
        boolean parked = parkingLot.park();
        Assertions.assertEquals(true, parked);
    }
    @Test
    @DisplayName("Should not be able to park if occupied is 10")
    public void checkParked10CarTest(){
        ParkingLot parkingLot = new ParkingLot(10);
        boolean parked = parkingLot.park();
        Assertions.assertEquals(false,parked);
    }


}
