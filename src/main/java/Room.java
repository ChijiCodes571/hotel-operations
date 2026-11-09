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

}
