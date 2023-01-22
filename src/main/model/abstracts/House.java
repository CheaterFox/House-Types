package main.model.abstracts;

public abstract class House {

    private double price;

    private double squareMeters;

    private int room;

    private int livingRoom;

    public House() {
    }

    public House(double price, double squareMeters, int room, int livingRoom) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.room = room;
        this.livingRoom = livingRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(byte room) {
        this.room = room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(byte livingRoom) {
        this.livingRoom = livingRoom;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", squareMeters=" + squareMeters +
                ", room=" + room +
                ", livingRoom=" + livingRoom +
                '}';
    }
}
