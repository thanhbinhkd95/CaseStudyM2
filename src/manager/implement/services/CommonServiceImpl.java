package manager.implement.services;

import com.sun.xml.internal.bind.v2.model.core.ID;
import commons.ValidateService;
import models.Services;

import java.util.Scanner;

public class CommonServiceImpl {
    ValidateService validate = new ValidateService();

    void addCommonServiceInfo(Services services) {

        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        services.setId(input.nextLine());

        System.out.println("Service Name: ");
        services.setServiceName(input.nextLine());

        System.out.println("Area of Use ");
        services.setAreaUsing(Float.parseFloat(input.nextLine()));

        System.out.println("Rental Fee ");
        services.setrentalFee(Double.parseDouble(input.nextLine()));

        System.out.println("Max Occupancy: ");
        services.setmaxOccupancy(Integer.parseInt(input.nextLine()));

        System.out.println("Type of Rent: ");
        services.setTypeRental(input.nextLine());
    }

}
