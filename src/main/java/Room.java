public class Room {
    private boolean occupied;
    private int numberOfBeds;
    private double price;
    private boolean dirty;

    public boolean isOccupied(){
        return occupied;
    }
    public int numberOfBeds(){
        return numberOfBeds;
    }
    public double getPrice(){
        return price;
    }
    public boolean isDirty(){
        return dirty;
    }
    public boolean isAvailable(){
        return !occupied && !dirty;
    }
    public void checkIn(){
        if(isAvailable()){
            occupied = true;
            dirty = true;
        }
    }
    public void checkOut(){
            occupied = false;
            dirty = true;

    }
    public void cleanRoom(){
           dirty = false;

    }

}
