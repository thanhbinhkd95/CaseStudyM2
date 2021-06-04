package manager;

import commons.FuncWriteAndRead.FuncCustomerFileCSV;
import controllers.MainController;
import library.Library;
import models.Customer;

import java.sql.SQLOutput;
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
        String name = input.nextLine();
        while (!Library.validateNameCustomer(name)){}
        System.err.println("Tên quý khách không đúng định dạng");
        customer.setName(name);

        System.out.println("Birthday: ");
        String birthday = input.nextLine();
        while (!Library.validateBirthday(birthday)){
            System.err.println("Ngày sinh không đúng kiểu cách");
        }
        customer.setBirthday(birthday);

        System.out.println("Gender: ");
        String gender = input.nextLine();
        while (!Library.validateGender(gender)){
            System.err.println("Vui long nhap lai");
            gender=input.nextLine();
        }
        customer.setGender(gender);


        System.out.println("ID Card: ");
        String id = input.nextLine();
        while (!Library.validateIdCard(id) && !isIdCustomerExsit(id)){
            System.out.println("id không hợp lệ hoặc đã tồn tại");
            id=input.nextLine();
        }
        customer.setIdCard(id);

        System.out.println("Phone Number: ");
        String number = input.nextLine();
        customer.setPhoneNumber(number);

        System.out.println("Email: ");
        String email = input.nextLine();
        while (!Library.validateEmail(email)){
            System.err.println("Email không đúng định dạng");
        }
        customer.setEmail(email);

        System.out.println("Type of Customer: ");
        String typeOfCustomer = input.nextLine();
        while (!Library.validateTypeCustomer(typeOfCustomer)){
            System.err.println("Không đúng định dạng lo mà nhập lại");
        }
        customer.setCustomerType(typeOfCustomer);

        System.out.println("Address: ");
        String address = input.nextLine();
        customer.setAddress(address);
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
    public static boolean isIdCustomerExsit(String id){
        ArrayList<Customer> list = FuncCustomerFileCSV.readFileCSV();
        for (Customer customer: list){
            if(customer.getIdCard().equals(id)){
                return false;
            }
        }
        return true;
    }
}
