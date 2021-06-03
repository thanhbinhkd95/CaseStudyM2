package commons.FuncWriteAndRead;

import models.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FuncWriteServicesFileCSV {
    public static final String FILE_HEADER_CUSTOMER ="src/data/Customer.CSV" ;
    static final String FILE_PATH_VILLA = "src/data/Villa.CSV";
    static final String FILE_PATH_HOUSE = "src/data/House.CSV";
    static final String FILE_PATH_ROOM = "src/data/Room.CSV";
    static final String COMMA_DELIMITER = ",";
    static final String NEW_LINE_SEPARATOR = "\n";
    public static final String FILE_HEADER_SERVICE = "ID,Service Name,Area Use,Rental Fee,Max Occ,Type of Rent,";
    static final String FILE_HEADER_VILLA = FILE_HEADER_SERVICE + "Room Standard,Facilities,Swimming Pool,Number of Floor,";
    static final String FILE_HEADER_HOUSE = FILE_HEADER_SERVICE + "Room Standard,Facilities,Number of Floor,";
    static final String FILE_HEADER_ROOM = FILE_HEADER_SERVICE + "Complimentary,";


    public static void writeFileCSVVilla(List<Villa> villaList) {
        FileWriter fileWriter = null;
        BufferedWriter bf = null;
        try {
            fileWriter = new FileWriter(FILE_PATH_VILLA);
            bf = new BufferedWriter(fileWriter);
            for (Villa element : villaList) {
                bf.write(element.getId());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getServiceName());
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getAreaUsing()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getrentalFee()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getmaxOccupancy()));
                bf.write(COMMA_DELIMITER);
                bf.write(element.getTypeRental());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getRoomStandard());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getFacilites());
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getAreaSwimmingPool()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getnumberOfFloor()));
                bf.write(NEW_LINE_SEPARATOR);
                bf.flush();
            }
            System.out.println("Saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in CSV File Record");
        } finally {
            try {
                bf.close();
                fileWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error while flushing or closing");
            }
        }
    }

    public static void writeFileCSVHouse(List<House> houseList) {
        FileWriter fileWriter = null;
        BufferedWriter bf = null;
        try {
//            fileWriter = new FileWriter(FILE_PATH_HOUSE,true);
            fileWriter = new FileWriter(FILE_PATH_HOUSE);
            bf = new BufferedWriter(fileWriter);
            bf.write(FILE_HEADER_HOUSE);
            bf.write(NEW_LINE_SEPARATOR);
            for (House element : houseList) {
                bf.write(element.getId());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getServiceName());
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getAreaUsing()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getrentalFee()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getmaxOccupancy()));
                bf.write(COMMA_DELIMITER);
                bf.write(element.getTypeRental());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getRoomStandard());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getFacilites());
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getnumberOfFloor()));
                bf.write(NEW_LINE_SEPARATOR);
                bf.flush();
            }
            System.out.println("Saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in CSV File Record");
        } finally {
            try {
                bf.close();
                fileWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error while flushing or closing");
            }
        }
    }

    public static void writeFileCSVRoom(List<Room> roomList) {
        FileWriter fileWriter = null;
        BufferedWriter bf = null;
        try {
            fileWriter = new FileWriter(FILE_PATH_ROOM);
            bf = new BufferedWriter(fileWriter);
            bf.write(FILE_HEADER_ROOM);
            bf.write(NEW_LINE_SEPARATOR);
            for (Room element : roomList) {
                bf.write(element.getId());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getServiceName());
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getAreaUsing()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getrentalFee()));
                bf.write(COMMA_DELIMITER);
                bf.write(String.valueOf(element.getmaxOccupancy()));
                bf.write(COMMA_DELIMITER);
                bf.write(element.getTypeRental());
                bf.write(COMMA_DELIMITER);
                bf.write(element.getComplimentary());
                bf.write(NEW_LINE_SEPARATOR);
                bf.flush();
            }
            System.out.println("Saved successfully!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                bf.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }
}
