package org.example;

import java.util.ArrayList;
import java.util.List;

// CommissionEmployee class test program.
public class CommissionEmployeeTest {
    public static void main(String[] args) {




        // instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, 0.06);
        CommissionEmployee employee1 = new CommissionEmployee(
                "John", "Smith", "333-33-3333", 15000, 0.08);
        CommissionEmployee employee2 = new CommissionEmployee(
                "Mary", "Brown", "444-44-4444", 12000, 0.07);
        CommissionEmployee employee3 = new CommissionEmployee(
                "Jack", "Brown", "444-44-4444", 12000, 0.07);
        CommissionEmployee employee4 = new CommissionEmployee(
                "Josh", "Brown", "444-44-4444", 12000, 0.07);
        CommissionEmployee employee5 = new CommissionEmployee(
                "Jessica", "Kramer", "222-22-2227", 1_930_000, .07);

        //create ArrayList of employees
        CommissionEmployee[] empArray = {employee1,employee2,employee3,employee4,employee5};

        ArrayList<CommissionEmployee> empList = new ArrayList<CommissionEmployee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);



        for(CommissionEmployee emp : empList)
        {
            System.out.println(emp.toString()+ "\n\n");
        }
        employee.setGrossSales(1_500_000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString", employee);

    }
}