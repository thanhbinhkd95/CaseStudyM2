package manager;
import commons.FuncWriteAndRead;
import model.House;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseManager {
    public static final String PATH_HOUSE_CSV ="F:\\CaseStudyM2\\src\\data\\House.CSV";

    public static House addNewHouse() {
        List<House> houseList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id house (SVHO-1234) : ");
        String idHouse = scanner.nextLine();
        System.out.print("Nhập tên house (House): ");
        String nameHouse = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
        double usableAreaHouse = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double rentalCostHouse = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số người tối đa: ");
        int maxNumberOfPeopleHouse = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
        String rentalTypeHouse = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng (1*-5*): ");
        String roomStandardHouse = scanner.nextLine();
        System.out.println("Nhập tiện nghi khác: ");
        String amenitieHouse = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        int numberOfFloorsHouse = Integer.parseInt(scanner.nextLine());
        House house = new House(idHouse, nameHouse, usableAreaHouse, rentalCostHouse, maxNumberOfPeopleHouse,
                rentalTypeHouse, roomStandardHouse, amenitieHouse, numberOfFloorsHouse);
        house.showInfo();
        houseList.add(house);
        houseList.add(house);
        FuncWriteAndRead<House> funcWriteAndReadHouse = new FuncWriteAndRead<>();
        funcWriteAndReadHouse.writeToFile(true,PATH_HOUSE_CSV, houseList);
        return null;
    }
    public void showHouse() {
    }

}
