package manager.implement.services;

import library.Library;
import models.*;
import service.ServiceInterface;

import java.util.Scanner;

public class VillaServiceManagerImpl extends CommonServiceImpl implements ServiceInterface {

    @Override
    public Services addNewService() {


        Scanner input = new Scanner(System.in);
        Services villa = new Villa();

        super.addCommonServiceInfo(villa);

        System.out.println("Standard of Room: ");
        String roomStandard = input.nextLine();
        while (!Library.validateRoomStandard(roomStandard)) {
            System.out.println("Nhập lại tiêu chuẩn phòng:");
            roomStandard = input.nextLine();
        }
        ( (Villa) villa ).setRoomStandard(roomStandard);

        System.out.println("Facilites: ");
        ( (Villa) villa ).setFacilites(input.nextLine());

        System.out.println("Area of SwimmingPool: ");
        String areaPool = input.nextLine();
        while (!Library.validateUsablePool(areaPool)) {
            System.err.println("Hồ bơi sai kích thước");
        }
        ( (Villa) villa ).setAreaSwimmingPool(Float.parseFloat(areaPool));

        System.out.println("Number Of Floor: ");
        String floor = input.nextLine();
        while (!Library.validateNumberOfFloors(floor)) {
            System.err.println("Số tầng không đúng quy định");
        }
        ( (Villa) villa ).setnumberOfFloor(Integer.parseInt(floor));

        return villa;
    }
}
