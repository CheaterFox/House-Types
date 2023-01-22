package main.model.concretes;

import main.model.abstracts.House;

public class StandardHouse extends House {
    public StandardHouse() {
    }

    public StandardHouse(double price, double squareMeters, int room, int livingRoom) {
        super(price, squareMeters, room, livingRoom);
    }
    @Override
    public String toString() {
        return "Standard House{" +
                "price=" + super.getPrice() +
                ", squareMeters=" + super.getSquareMeters() +
                ", room=" + super.getRoom() +
                ", livingRoom=" + super.getLivingRoom() +
                '}';
    }
}
