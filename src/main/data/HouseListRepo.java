package main.data;

import main.model.abstracts.House;
import main.model.concretes.StandardHouse;
import main.model.concretes.SummerHouse;
import main.model.concretes.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseListRepo {

    private List<House> standardHouses;

    private List<House> villas;

    private List<House> summerHouses;

    private static HouseListRepo houseListRepo;

    private HouseListRepo() {
        loadDefaultLists();
    }

    public static HouseListRepo getSingleInstance() {
        if (houseListRepo == null) {
            houseListRepo = new HouseListRepo();
        }
        return houseListRepo;
    }

    public List<House> getStandardHouses() {
        return standardHouses;
    }

    public void setStandardHouses(List<House> standardHouses) {
        this.standardHouses = standardHouses;
    }

    public List<House> getVillas() {
        return villas;
    }

    public void setVillas(List<House> villas) {
        this.villas = villas;
    }

    public List<House> getSummerHouses() {
        return summerHouses;
    }

    public void setSummerHouses(List<House> summerHouses) {
        this.summerHouses = summerHouses;
    }

    private void loadDefaultLists(){
        standardHouses = createStandardHouses();
        villas = createVillas();
        summerHouses = createSummerHouses();
    }

    private List<House> createStandardHouses() {
        House standardHouse = new StandardHouse(
                155000.0, 150.0, 3, 1
        );
        House standardHouse2 = new StandardHouse(
                62000.0, 60.0, 2, 0
        );
        House standardHouse3 = new StandardHouse(
                525000.0, 270.0, 5, 1
        );

        List<House> standardHouseList = new ArrayList<>();
        standardHouseList.add(standardHouse);
        standardHouseList.add(standardHouse2);
        standardHouseList.add(standardHouse3);

        return standardHouseList;
    }

    private List<House> createVillas() {
        House standardHouse = new Villa(
                350000.0, 1450, 3, 1
        );
        House standardHouse2 = new Villa(
                385000.0, 350.0, 4, 1
        );
        House standardHouse3 = new Villa(
                950000.0, 495.0, 6, 2
        );

        List<House> villaList = new ArrayList<>();
        villaList.add(standardHouse);
        villaList.add(standardHouse2);
        villaList.add(standardHouse3);

        return villaList;
    }

    private List<House> createSummerHouses() {
        House standardHouse = new SummerHouse(
                89500.0, 88.0, 2, 1
        );
        House standardHouse2 = new SummerHouse(
                225000.0, 210.0, 4, 1
        );
        House standardHouse3 = new SummerHouse(
                194999.9, 205.0, 5, 1
        );

        List<House> summerHouseList = new ArrayList<>();
        summerHouseList.add(standardHouse);
        summerHouseList.add(standardHouse2);
        summerHouseList.add(standardHouse3);

        return summerHouseList;
    }
}
