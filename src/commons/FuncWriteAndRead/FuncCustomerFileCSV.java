package commons.FuncWriteAndRead;

import models.Customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncCustomerFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    static final String FILE_HEADER_CUSTOMER = "Name,Birthday,Gender,ID Card,Phone Number,Email,Type of Customer,Address,";
    static final String FILE_PATH_CUSTOMER = "src/data/Customer.CSV";

    public static void writeFileCSV(ArrayList<Customer> list,boolean status){
        FileWriter fileWriter = null;
        BufferedWriter bf = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_CUSTOMER,status);
            bf = new BufferedWriter(fileWriter);
            bf.write(FILE_HEADER_CUSTOMER);
            bf.write(NEW_LINE_SEPARATOR);
            for(Customer element : list){
                bf.write(element.getName());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getBirthday());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getGender());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getIdCard());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getPhoneNumber());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getEmail());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getCustomerType());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getAddress());
                bf.write(NEW_LINE_SEPARATOR);
                bf.flush();
            }
            System.out.println("Saved successfully!");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in CSV File Record");
        } finally {
            try{
                bf.close();
                fileWriter.close();
            }catch (Exception ex){
                ex.printStackTrace();
                System.err.println();
            }
        }
    }

    public static ArrayList<Customer> readFileCSV() {
        BufferedReader br = null;
        ArrayList<Customer> list = new ArrayList<Customer>();
        try {
            br = new BufferedReader(new FileReader(FILE_PATH_CUSTOMER));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(COMMA_DELIMITER);
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setIdCard(splitData[3]);
                customer.setPhoneNumber(splitData[4]);
                customer.setEmail(splitData[5]);
                customer.setCustomerType(splitData[6]);
                customer.setAddress(splitData[7]);
                list.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }


}
