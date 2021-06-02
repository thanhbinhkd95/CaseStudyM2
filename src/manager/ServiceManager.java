package manager;

import java.util.Scanner;

import commons.FuncWriteAndRead;
import model.Service;
import model.Villa;
import model.Room;
import model.House;

import java.util.Set;
import java.util.TreeSet;

public class ServiceManager {
    //them
    /*xoa
     * sua
     * hien thi
     * Room House Villa cac the loai*/
    static Scanner scanner = new Scanner(System.in);
    static VillaManager villaManager;
    static RoomManager roomManager;
    static HouseManager houseManager;

    public ServiceManager() {
        villaManager = new VillaManager();
        roomManager = new RoomManager();
        houseManager = new HouseManager();
    }

    public static void addNewServices() {
        int chosse;
        do {
            System.out.println("-------------ADD NEW SERVICE MENU------------");
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            System.out.print("Enter your choose: ");
            chosse = Integer.parseInt(scanner.nextLine());
            switch (chosse) {
                case 1:
                    Villa newVilla = villaManager.addNewVilla();
                    newVilla.showInfo();
                    break;
                case 2:
                    House newHouse = houseManager.addNewHouse();
                    newHouse.showInfo();
                    break;
                case 3:
                    Room newRoom = roomManager.addNewRoom();
                    newRoom.showInfo();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (chosse != 5);

    }


    public void showService() {
        int choose;
        FuncWriteAndRead<Service> funcWriteAndRead = new FuncWriteAndRead<>();
        do {
            System.out.println("-----------SHOW SERVICE MENU----------");
            System.out.println("1. Show all Villa");
            System.out.println("2. Show all House");
            System.out.println("3. Show all Room");
            System.out.println("4. Show All Name Villa Not Duplicate");
            System.out.println("5. Show All Name House Not Duplicate");
            System.out.println("6. Show All Name Name Not Duplicate");
            System.out.println("7. Back to menu");
            System.out.println("8. Exit");
            System.out.print("Enter your choose: ");
            choose = scanner.nextInt();
            int i;
            switch (choose) {
                case 1:
                    System.out.println("---------VILLA LIST---------");
                    villaManager.showVilla();
                    break;
                case 2:
                    System.out.println("----------HOUSE LIST---------");
                    houseManager.showHouse();
                    break;
                case 3:
                    System.out.println("----------ROOM LIST---------");
                    roomManager.showRoom();
                    break;
            }
        } while (choose != 8);
    }

    public void showServiceNotDup() {
        Set<String> nameSet = new TreeSet<>();

    }
}

