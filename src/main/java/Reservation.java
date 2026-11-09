public class Reservation {
    private String roomType;

    public Reservation(String roomType, double price, int numberOfNight, boolean weekend){
        this.roomType = roomType;
    }
    public String getRoomType(){
        return roomType;
    }
}
