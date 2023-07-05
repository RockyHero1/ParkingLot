import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {

    @Test
    @DisplayName("Vacancy should be 9 out of 10 after 1 cars parked")
    public void checkParked1CarTest(){
        ParkingLot parkingLot = new ParkingLot(0);
        boolean vacancy = parkingLot.park();
        Assertions.assertEquals(true,vacancy);
    }


}
