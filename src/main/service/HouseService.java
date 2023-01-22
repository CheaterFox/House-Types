package main.service;

import main.model.abstracts.House;
import java.util.List;

public interface HouseService {
     double getStandardHousesTotalPrice();

     double getVillasTotalPrice();

     double getSummerHousesTotalPrice();

     double getAllHousesTotalPrice();


     double getStandardHousesAverageSquareMeters();
     double getVillasAverageSquareMeters();
     double getSummerHousesAverageSquareMeters();
     double getAllHousesAverageSquareMeters();


     List<House> getFilteredStandardHousesByRoomAndLivingRoom(int room, int livingRoom);

     List<House> getFilteredVillasByRoomAndLivingRoom(int room, int livingRoom);

     List<House> getFilteredSummerHousesByRoomAndLivingRoom(int room, int livingRoom);

     List<House> getAllFilteredHousesByRoomAndLivingRoom(int room, int livingRoom);
}
