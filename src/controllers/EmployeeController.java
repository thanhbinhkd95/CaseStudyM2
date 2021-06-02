package controllers;

import models.Employee;
import manager.implement.FuncEmployeeFileCSV;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeController {
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
