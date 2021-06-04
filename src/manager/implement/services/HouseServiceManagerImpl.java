package manager.implement.services;

import library.Library;
import manager.implement.services.CommonServiceImpl;
import models.Services;
import models.House;
import service.ServiceInterface;

import java.util.Scanner;

public class HouseServiceManagerImpl extends CommonServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Scanner input = new Scanner(System.in);
        Services house = new House();

        super.addCommonServiceInfo(house);

        System.out.println("Standard of Room: ");
        String standard = input.nextLine();
        while (!Library.validateRoomStandard(standard)) {
            System.out.println("Nhập lại tiêu chuẩn phòng:");
            standard = input.nextLine();
        }
        ( (House) house ).setRoomStandard(standard);

        System.out.println("Facilites: ");
        ( (House) house ).setFacilites(input.nextLine());

        System.out.println("Number Of Floor: ");
        String houseFloor = input.nextLine();
        while (!Library.validateNumberOfFloors(houseFloor)) {
            System.err.println("Số tầng không đúng quy định");
        }
        ( (House) house ).setnumberOfFloor(Integer.parseInt(houseFloor));

        return house;
    }
}
