package controllers.booking_customer;

import controllers.MainController;
import models.Customer;
import manager.implement.customer.CustomerImpl;
import commons.FuncWriteAndRead.FuncCustomerFileCSV;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    public static void addNewCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many rooms customers do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Customer> customersList = new ArrayList<>();
        for ( int i = 0; i < length; i++){
            Customer customer = CustomerImpl.addNewCustomer();
            customersList.add(customer);
        }
        FuncCustomerFileCSV.writeFileCSV(customersList,true);
        MainController.processMain();
    }

    public static void showInformationCustomers(){
        ArrayList<Customer> list = FuncCustomerFileCSV.readFileCSV();
        int numericalOrder = 1;
        for(Customer element : list){
            System.out.println(numericalOrder + " " + element.showInfor());
            numericalOrder++;
        }
    }
}
