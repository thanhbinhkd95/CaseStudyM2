package manager.implement.services;

import library.Library;
import models.Services;

import java.util.Scanner;

public class CommonServiceImpl {

    void addCommonServiceInfo(Services services) {

        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        services.setId(input.nextLine());

        System.out.println("Service Name: ");
        String serviceName = input.nextLine();
        while (!Library.validateNameService(serviceName)){
            System.err.println("Nhập lại đi bạn");
        }
        services.setServiceName(serviceName);

        System.out.println("Area of Use ");
        String area = input.nextLine();
        services.setAreaUsing(Float.parseFloat(area));

        System.out.println("Rental Fee ");
        float fee = Float.parseFloat(input.nextLine());
        while (!Library.validatePrice(fee)){
            System.err.println("Giá tiền không hợp ní");
        }
        services.setrentalFee(Float.parseFloat(String.valueOf(fee)));

        System.out.println("Max Occupancy: ");
        String max = input.nextLine();
        while (!Library.validateMaxOfPeople(max)){
            System.err.println("Không đúng số người quy định");
        }
        services.setmaxOccupancy(Integer.parseInt(max));

        System.out.println("Type of Rent: ");
        String type = input.nextLine();
        while (!Library.validateRentalType(type)){
            System.err.println("Sai định dạng");
        }
        services.setTypeRental(type);
    }

}

