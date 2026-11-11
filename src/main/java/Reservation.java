public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNight;
    private boolean weekend;


    public Reservation(String roomType, double price, int numberOfNight, boolean weekend){
        this.roomType = roomType;
        this.price = price;
        this.numberOfNight = numberOfNight;
        this.weekend = weekend;
    }
    public String getRoomType(){
        return roomType;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    public double getPrice(){
        double price = 0;
        if(roomType.equals("King")){
            System.out.print("The price of this room is: $" + 139.00);
        }
        else if (roomType.equals("Double")) {
            System.out.println("The price of this room is: $" + 124.00);
        }

        if (weekend){
            price = price * 1.10;
        }

        return price;
    }
    public int getNumberOfNight(){
        return numberOfNight;
    }
    public void setNumberOfNight(int numberOfNight){
        this.numberOfNight = numberOfNight;
    }
    public boolean isWeekend(){
        return weekend;
    }
    public void setWeekend (boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationalTotal(){
         return price * numberOfNight;
    }


}
