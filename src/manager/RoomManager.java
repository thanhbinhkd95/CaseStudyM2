package manager;

import commons.FuncWriteAndRead;
import model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManager {
    public static final String PATH_ROOM_CSV = "F:\\CaseStudyM2\\src\\data\\Room.CSV";

    public static Room addNewRoom() {
        List<Room> roomList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id room (SVRO-1234) : ");
        String idRoom = scanner.nextLine();
        System.out.print("Nhập tên room (Room): ");
        String nameRoom = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
        double usableAreaRoom = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double rentalCostRoom = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số người tối đa: ");
        int maxNumberOfPeopleRoom = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
        String rentalTypeRoom = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí đi kèm: ");
        String freeServiceRoom = scanner.nextLine();
        Room room = new Room(idRoom , nameRoom , usableAreaRoom , rentalCostRoom , maxNumberOfPeopleRoom ,
                rentalTypeRoom , freeServiceRoom);
        room.showInfo();
        roomList.add(room);
        roomList.add(room);
        FuncWriteAndRead<Room> funcWriteAndReadRoom = new FuncWriteAndRead<>();
        return room;
    }

    public void showRoom() {
    }
}
