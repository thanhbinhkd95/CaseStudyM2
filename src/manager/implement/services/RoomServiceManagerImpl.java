package manager.implement.services;

import commons.FuncWriteAndRead.libraryofregex.Library;
import models.Services;
import models.Room;
import service.ServiceInterface;

import java.util.Scanner;

public class RoomServiceManagerImpl extends CommonServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Scanner input = new Scanner(System.in);
        Services room = new Room();

        super.addCommonServiceInfo(room);

        System.out.println("Complimentary of Room: ");
        String complimentary = input.nextLine();
        while (!Library.validateAccompanied(complimentary)) {
            System.err.println("Dịch vụ không đúng quy định");
        }
        ( (Room) room ).setComplimentary(complimentary);

        return room;
    }
}
