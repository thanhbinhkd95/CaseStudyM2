package controllers.services;

import commons.FuncWriteAndRead.FuncReadServicesFileCSV;
import commons.FuncWriteAndRead.FuncWriteServicesFileCSV;
import controllers.MainController;
import manager.implement.services.HouseServiceManagerImpl;
import manager.implement.services.RoomServiceManagerImpl;
import manager.implement.services.VillaServiceManagerImpl;
import models.*;
import service.ServiceInterface;

import java.util.*;

public class ServiceController {
    private static ServiceInterface villaService = new VillaServiceManagerImpl();
    private static ServiceInterface houseService = new HouseServiceManagerImpl();
    private static ServiceInterface roomService = new RoomServiceManagerImpl();

    //=============================== ADD NEW SERVICE ===============================
    public static void addVillaService(){
        Scanner input = new Scanner(System.in);

        System.out.println(">>>>>>>>>>>>>>>> How many villa services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        List<Villa> villaList = FuncReadServicesFileCSV.readFileCSVVilla();
        for ( int i = 0; i < length; i++){
            Villa villa = (Villa) villaService.addNewService();
            villaList.add(villa);
        }
        FuncWriteServicesFileCSV.writeFileCSVVilla(villaList);
        MainController.processMain();
    }

    public static void addHouseService(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many houses services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        List<House> houseList = FuncReadServicesFileCSV.readFileCSVHouse();

        for ( int i = 0; i < length; i++){
            House house = (House) houseService.addNewService();
            houseList.add(house);
        }
        FuncWriteServicesFileCSV.writeFileCSVHouse(houseList);
        MainController.processMain();
    }

    public static void addRoomService(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many rooms services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        List<Room> roomList = FuncReadServicesFileCSV.readFileCSVRoom();

        for ( int i = 0; i < length; i++){
            Room room = (Room) roomService.addNewService();
            roomList.add(room);
        }
        FuncWriteServicesFileCSV.writeFileCSVRoom(roomList);
        MainController.processMain();
    }
    //=============================== SHOW SERVICE ===============================
    public static void showAllVillaServices(){
        List<Villa> villaList = FuncReadServicesFileCSV.readFileCSVVilla();
        for(Villa element : villaList){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllHouseServices(){
        List<House> list = FuncReadServicesFileCSV.readFileCSVHouse();
        for(House element : list){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllRoomServices(){
        List<Room> list = FuncReadServicesFileCSV.readFileCSVRoom();
        for(Room element : list){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllServicesNotDuplicate(String path){
        TreeSet<String> nameList = FuncReadServicesFileCSV.getAllNameServiceFromFileCSV(path);
        for(String element: nameList){
            System.out.println(element);
            System.out.println("====================");
        }
    }
}
