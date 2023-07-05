public class ParkingLot {
    final static int CAPACITY = 10;
    int occupied = 0;

    public ParkingLot(int occupied) {
        this.occupied = occupied;
    }

    public boolean park() {
        if(CAPACITY-occupied>0){
            occupied += 1;
        }
        else {
            return false;
        }
        return true;
    }


}
