import org.parkingLot.Parkable;

public class FakeCar implements Parkable {

    private final String regNo;

    public FakeCar(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }
}
