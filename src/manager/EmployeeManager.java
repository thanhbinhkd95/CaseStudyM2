package manager;

import controllers.MainController;
import models.Employee;
import commons.FuncWriteAndRead.FuncEmployeeFileCSV;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {
    public static void showEmployeesInfo(){
        List<Employee> employeeList = FuncEmployeeFileCSV.readFileCSV();
        Map<String,Employee> map = new HashMap<>();
        for(Employee element : employeeList){
            map.put(element.getId(),element);
        }
        for( Map.Entry m : map.entrySet()){
            System.out.println("***********\nKey: "+ m.getKey() +"\nValue: "+m.getValue().toString());
        }
        MainController.processMain();
    }
}
