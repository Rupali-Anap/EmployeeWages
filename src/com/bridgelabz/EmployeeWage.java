package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("**********WELCOME TO EMPLOYEE WAGES*************");
        int WAGEPERHOUR = 20;
        int FULLDAYHOUR = 8;
        int DAILYWAGE = 0;
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;

        if (employeeCheck == 1) {
            DAILYWAGE = FULLDAYHOUR * WAGEPERHOUR;
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Employee total wage is: " +DAILYWAGE)
       }
   
}


