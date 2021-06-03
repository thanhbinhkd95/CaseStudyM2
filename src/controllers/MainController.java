package controllers;

import manager.BookingManager;
import manager.EmployeeManager;
import manager.CustomerManager;
import views.*;

import java.util.Scanner;

public class MainController {
    public static void processMain(){
        try{
            Menu.displayMainMenu();
            processMainMenu();
        }catch (Exception e){
            //getBackMainMenu();
            processMain();
            System.out.println("Error");
        }
    }

    public static void processMainMenu(){
        Scanner input = new Scanner(System.in);
        switch (input.nextLine()){
            case "1":
                Menu.menuAddNewServices();
                break;
            case "2":
                Menu.menuShowServices();
                break;
            case "3":
                CustomerManager.addNewCustomer();
                break;
            case "4":
                CustomerManager.showInformationCustomers();
                break;
            case "5":
                BookingManager.addnewBooking();
                break;
            case "6":
                EmployeeManager.showEmployeesInfo();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Fail. Please choose number of menu exactly !");
                processMain();
                break;
        }
    }

    public static void main(String[] args) {
        MainController.processMain();
    }
}
