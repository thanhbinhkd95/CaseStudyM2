package manager.implement.services;

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
        ((House) house).setRoomStandard(input.nextLine());

        System.out.println("Facilites: ");
        ((House) house).setFacilites(input.nextLine());

        System.out.println("Number Of Floor: ");
        ((House) house).setnumberOfFloor(Integer.parseInt(input.nextLine()));

        return house;
    }
}
