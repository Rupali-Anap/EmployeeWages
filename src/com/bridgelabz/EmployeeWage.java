package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("**********WELCOME TO EMPLOYEE WAGES*************");
        int WAGEPERHOUR = 20;
        int FULLTIMEHOUR = 8;
        int PARTTIMEHOUR = 4;
        int DAILYWAGE = 0;

        int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));

        switch (employeeCheck) {
            case 2:
                DAILYWAGE = FULLTIMEHOUR * WAGEPERHOUR;
                System.out.println("Employee is present full time");
                break;
            case 1:
                DAILYWAGE = PARTTIMEHOUR * WAGEPERHOUR;
                System.out.println("Employee is present half time");
                break;
            default:
                System.out.println("Employee is absent");
        }
        System.out.println("Employee total wage is: " +DAILYWAGE);

    }
}

