package main.model.concretes;

import main.model.abstracts.House;

public class SummerHouse extends House {
    public SummerHouse() {
    }

    public SummerHouse(double price, double squareMeters, int room, int livingRoom) {
        super(price, squareMeters, room, livingRoom);
    }

    @Override
    public String toString() {
        return "Summer House{" +
                "price=" + super.getPrice() +
                ", squareMeters=" + super.getSquareMeters() +
                ", room=" + super.getRoom() +
                ", livingRoom=" + super.getLivingRoom() +
                '}';
    }
}
