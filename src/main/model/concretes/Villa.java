package main.model.concretes;

import main.model.abstracts.House;

public class Villa extends House {
    public Villa() {
    }

    public Villa(double price, double squareMeters, int room, int livingRoom) {
        super(price, squareMeters, room, livingRoom);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "price=" + super.getPrice() +
                ", squareMeters=" + super.getSquareMeters() +
                ", room=" + super.getRoom() +
                ", livingRoom=" + super.getLivingRoom() +
                '}';
    }
}
