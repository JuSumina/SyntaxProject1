package homework25;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put ("Joe Doe", 150000);
        employeeMap.put ("Jane Allen", 132000);
        employeeMap.put ("Jessica Parker", 220000);
        employeeMap.put ("John Smith", 95000);

        String highestSalaryEmployee = "";
        int highestSalary = 0;

        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestSalaryEmployee = entry.getKey();
            }
        }

        System.out.println(highestSalaryEmployee+"=$"+highestSalary);
    }

}

