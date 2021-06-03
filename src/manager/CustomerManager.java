package manager;

import commons.FuncWriteAndRead.FuncCustomerFileCSV;
import controllers.MainController;
import models.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
    public static Customer addNewCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many rooms customers do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Customer> customersList = new ArrayList<>();
        for ( int i = 0; i < length; i++){
            Customer customer = CustomerManager.addNewCustomer();
            customersList.add(customer);
        }
        FuncCustomerFileCSV.writeFileCSV(customersList,true);
        MainController.processMain();

        input = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.println("Customer Name: ");
        customer.setName(input.nextLine());

        System.out.println("Birthday: ");
        customer.setBirthday(input.nextLine());

        System.out.println("Gender: ");
        customer.setGender(input.nextLine());

        System.out.println("ID Card: ");
        customer.setIdCard(input.nextLine());

        System.out.println("Phone Number: ");
        customer.setPhoneNumber(input.nextLine());

        System.out.println("Email: ");
        customer.setEmail(input.nextLine());

        System.out.println("Type of Customer: ");
        customer.setCustomerType(input.nextLine());

        System.out.println("Address: ");
        customer.setAddress(input.nextLine());
        return customer;
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
