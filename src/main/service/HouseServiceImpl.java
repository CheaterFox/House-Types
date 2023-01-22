package main.service;

import main.data.HouseListRepo;
import main.model.abstracts.House;

import java.util.ArrayList;
import java.util.List;

public class HouseServiceImpl implements HouseService{

    private static HouseServiceImpl houseService;
    private final List<House> standardHouses;
    private final List<House> villas;
    private final List<House> summerHouses;

    // used singleton pattern
    private HouseServiceImpl() {
        HouseListRepo houseListRepo = HouseListRepo.getSingleInstance(); // getting single instance for calling & using Lists in the methods
        this.standardHouses = houseListRepo.getStandardHouses();
        this.villas = houseListRepo.getVillas();
        this.summerHouses = houseListRepo.getSummerHouses();
    }

    public static HouseServiceImpl getSingleInstance() {
        if (houseService == null) {
            houseService = new HouseServiceImpl();
        }
        return houseService;
    }

    @Override
    public double getStandardHousesTotalPrice() {
        return calculateTotalPrice(standardHouses);
    }

    @Override
    public double getVillasTotalPrice() {
        return calculateTotalPrice(villas);
    }

    @Override
    public double getSummerHousesTotalPrice() {
        return calculateTotalPrice(summerHouses);
    }

    @Override
    public double getAllHousesTotalPrice() {
        double standardHousesTotalPrice = getStandardHousesTotalPrice();
        double villasTotalPrice = getVillasTotalPrice();
        double summerHousesTotalPrice = getSummerHousesTotalPrice();
        return standardHousesTotalPrice + villasTotalPrice + summerHousesTotalPrice;
    }

    // private because user does not need to see the calculate method
    /* If user want to price he will just call get...Price method and
     behind scene this method will calculate price and return it to the other methods
     */
    private double calculateTotalPrice(List<House> houseList) {
        double totalPrice = 0;
        for (House house : houseList) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    @Override
    public double getStandardHousesAverageSquareMeters() {
        return calculateAverageSquareMeters(standardHouses);
    }

    @Override
    public double getVillasAverageSquareMeters() {
        return calculateAverageSquareMeters(villas);
    }

    @Override
    public double getSummerHousesAverageSquareMeters() {
        return calculateAverageSquareMeters(summerHouses);
    }

    @Override
    public double getAllHousesAverageSquareMeters() {
        double standardHousesAverageSquareMeters = getStandardHousesAverageSquareMeters();
        double villasAverageSquareMeters = getVillasAverageSquareMeters();
        double summerHousesAverageSquareMeters = getSummerHousesAverageSquareMeters();
        return (standardHousesAverageSquareMeters + villasAverageSquareMeters + summerHousesAverageSquareMeters)/3;
    }

    // private because user does not need to see the calculate method
    /* If user want to average square meters he will just call get...AverageSquareMeters method and
    behind scene this method will calculate average square meters and return it to the other methods
     */
    private double calculateAverageSquareMeters(List<House> houseList) {
        double totalSquareMeters = 0;
        double averageSquareMeters;
        for (House house : houseList) {
            totalSquareMeters += house.getSquareMeters();
        }
        averageSquareMeters = totalSquareMeters/houseList.size();
        return averageSquareMeters;
    }

    @Override
    public List<House> getFilteredStandardHousesByRoomAndLivingRoom(int room, int livingRoom) {
        return filterHousesByRoomAndLivingRoom(standardHouses, room, livingRoom);
    }

    @Override
    public List<House> getFilteredVillasByRoomAndLivingRoom(int room, int livingRoom) {
        return filterHousesByRoomAndLivingRoom(villas, room, livingRoom);
    }

    @Override
    public List<House> getFilteredSummerHousesByRoomAndLivingRoom(int room, int livingRoom) {
        return filterHousesByRoomAndLivingRoom(summerHouses, room, livingRoom);
    }

    // private because user does not need to see the filter method
    /* If user want to filtered houses he will just call getFiltered... method and
    behind scene this method will filter and return it to the other methods
     */
    private List<House> filterHousesByRoomAndLivingRoom(List<House> houseList, int room, int livingRoom) {
        List<House> filteredHouseList = new ArrayList<>();
        for (House house : houseList) {
            if(house.getRoom() == room && house.getLivingRoom() == livingRoom) {
                filteredHouseList.add(house);
            }
        }
        return filteredHouseList;
    }

    @Override
    public List<House> getAllFilteredHousesByRoomAndLivingRoom(int room, int livingRoom) {
        List<House> filteredStandardHouses = getFilteredStandardHousesByRoomAndLivingRoom(room, livingRoom);
        List<House> filteredVillas = getFilteredVillasByRoomAndLivingRoom(room, livingRoom);
        List<House> filteredSummerHouses = getFilteredSummerHousesByRoomAndLivingRoom(room, livingRoom);
        List<House> allFilteredHouses = new ArrayList<>();
        allFilteredHouses.addAll(filteredStandardHouses);
        allFilteredHouses.addAll(filteredSummerHouses);
        allFilteredHouses.addAll(filteredVillas);

        return allFilteredHouses;
    }

}
