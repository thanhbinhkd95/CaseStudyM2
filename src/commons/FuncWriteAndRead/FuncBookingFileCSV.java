package commons.FuncWriteAndRead;

import models.Customer;
import commons.FuncWriteAndRead.FuncWriteServicesFileCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncBookingFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_BOOKING = FuncWriteServicesFileCSV.FILE_HEADER_CUSTOMER + FuncWriteServicesFileCSV.FILE_HEADER_SERVICE;
    static final String FILE_PATH_BOOKING = "src/data/Bookings.CSV";

    public static void writeFileCSV(ArrayList<Customer> bookingList) {
        FileWriter fileWriter = null;
        BufferedWriter bf = new BufferedWriter(fileWriter);


        try {
//          fileWriter = new FileWriter(FILE_PATH_BOOKING, true);
            fileWriter = new FileWriter(FILE_PATH_BOOKING);
            bf.write(FILE_HEADER_BOOKING);
            bf.write(NEW_LINE_SEPARATOR);
            for (Customer element : bookingList) {
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
                bf.write(COMMA_DELIMITER);
                bf.write(element.getService().getId());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getService().getServiceName());
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getService().getAreaUsing()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getService().getrentalFee()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getService().getmaxOccupancy()));
                bf.write(COMMA_DELIMITER);
                bf.write(element.getService().getTypeRental());
                bf.write(NEW_LINE_SEPARATOR);
                bf.flush();
            }
            System.out.println("Saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in CSV File Record");
        } finally {
            try {
                bf.flush();
                fileWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error while flushing or closing");
            }
        }
    }

    public static ArrayList<Customer> readFileCSV() {
        BufferedReader br = null;
        String line = "";
        ArrayList<Customer> list = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(FILE_PATH_BOOKING));

            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(COMMA_DELIMITER);
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Customer customer = new Customer(splitData[0] , splitData[1] , splitData[2] , splitData[3] , splitData[4] , splitData[5] , splitData[6] , splitData[7] , splitData[8] , splitData[9] , splitData[10] , splitData[11] , splitData[12] , splitData[13]);
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
