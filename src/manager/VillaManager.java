package manager;

import commons.FuncWriteAndRead;
import model.Villa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaManager {
    public static final String PATH_VILLA_CSV = "F:\\CaseStudyM2\\src\\data\\Villa.CSV";
    public static final String PATH_SERVICES_CSV = "F:\\CaseStudyM2\\src\\data\\Services.CSV";

    public static Villa addNewVilla() {
        List<Villa> villaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id villa (SVVL-1234) : ");
        String idVilla = scanner.nextLine();
        System.out.print("Nhập tên villa (Villa): ");
        String nameVilla = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng (>30) mét vuông: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số người tối đa: ");
        int maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê (Gio, Ngay, Thang, Nam): ");
        String rentalType = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng (1*-5*): ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập tiện nghi khác: ");
        String amenitie = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi (>30): ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idVilla , nameVilla , usableArea , rentalCost , maxNumberOfPeople ,
                rentalType , roomStandard , amenitie , poolArea , numberOfFloors);
        villa.showInfo();
        villaList.add(villa);
        villaList.add(villa);
        FuncWriteAndRead<Villa> funcWriteAndReadVilla = new FuncWriteAndRead<>();
        funcWriteAndReadVilla.writeToFile(true,PATH_VILLA_CSV , villaList);
        funcWriteAndReadVilla.writeToFile(true,PATH_SERVICES_CSV , villaList);
        return villa;
    }



    public static void showVilla() {
        FuncWriteAndRead<Villa> funcWriteAndRead = new FuncWriteAndRead<>();
        List<Villa> servicesListVilla = funcWriteAndRead.readDataFromFile(PATH_VILLA_CSV);
        for (Villa services : servicesListVilla) {
            System.out.println(services);
        }
    }


}