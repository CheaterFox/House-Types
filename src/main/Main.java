package main;

import main.model.abstracts.House;
import main.service.HouseService;
import main.service.HouseServiceImpl;
import main.utils.constants.Constant;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = HouseServiceImpl.getSingleInstance();
        String turkishCurrency = Constant.turkishCurrency;
        String squareMetersSymbol = Constant.squareMetersSymbol;

        // House List Prices
        double totalPriceForStandardHouses = houseService.getStandardHousesTotalPrice();
        double totalPriceForVillas = houseService.getVillasTotalPrice();
        double totalPriceForSummerHouses = houseService.getSummerHousesTotalPrice();
        double totalPriceForAllHouses = houseService.getAllHousesTotalPrice();

        System.out.println("#####################################################");
        System.out.println("TOTAL PRICE");
        System.out.println("#####################################################");
        System.out.println();
        System.out.println("Total Price (Standard Houses) : " + totalPriceForStandardHouses + " " + turkishCurrency);
        System.out.println("Total Price (Villas) : " + totalPriceForVillas + " " + turkishCurrency);
        System.out.println("Total Price (Summer Houses) : " + totalPriceForSummerHouses + " " + turkishCurrency);
        System.out.println("--------------------------------------------");
        System.out.println("Total Price (All Houses) : " + totalPriceForAllHouses + " " + turkishCurrency);
        System.out.println();
        System.out.println("#####################################################");

        // House List Average Square Meters
        double averageSquareMetersForStandardHouses = houseService.getStandardHousesAverageSquareMeters();
        double averageSquareMetersForVillas = houseService.getVillasAverageSquareMeters();
        double averageSquareMetersForSummerHouses = houseService.getSummerHousesAverageSquareMeters();
        double averageSquareMetersForAllHouses = houseService.getAllHousesAverageSquareMeters();

        System.out.println("AVERAGE SQUARE METERS");
        System.out.println("#####################################################");
        System.out.println();
        System.out.println("Average Square Meters (Standard Houses) : " + averageSquareMetersForStandardHouses + " " + squareMetersSymbol);
        System.out.println("Average Square Meters (Villas) : " + averageSquareMetersForVillas + " " + squareMetersSymbol);
        System.out.println("Average Square Meters (Summer Houses) : " + averageSquareMetersForSummerHouses + " " + squareMetersSymbol);
        System.out.println("--------------------------------------------");
        System.out.println("Average Square Meters (All Houses) : " + averageSquareMetersForAllHouses + " " + squareMetersSymbol);
        System.out.println();
        System.out.println("#####################################################");

        //  All Filtered Houses By Room & Living Room
        List<House> filteredHouseList = houseService.getAllFilteredHousesByRoomAndLivingRoom(3,1);
        List<House> filteredHouseList2 = houseService.getAllFilteredHousesByRoomAndLivingRoom(6,2);
        List<House> filteredHouseList3 = houseService.getAllFilteredHousesByRoomAndLivingRoom(5,1);


        System.out.println("FILTERED HOUSES (BY ROOM & LIVING ROOM)");
        System.out.println("#####################################################");
        System.out.println();
        System.out.println("** Filtered Houses With 3 Room & 1 Living Room **");
        System.out.println("--------------------------------------------------");
        System.out.println(filteredHouseList);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("** Filtered Houses With 6 Room & 2 Living Room **");
        System.out.println("--------------------------------------------------");
        System.out.println(filteredHouseList2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        System.out.println("** Filtered Houses With 5 Room & 1 Living Room **");
        System.out.println("--------------------------------------------------");
        System.out.println(filteredHouseList3);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("#####################################################");

    }
}
