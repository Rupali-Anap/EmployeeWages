package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("**********WELCOME TO EMPLOYEE WAGES*************");
        int WAGEPERHOUR = 20;
        int FULLTIMEHOUR = 8;
        int PARTTIMEHOUR = 4;
        int TOTALWORKINGDAYS = 0;
        int TOTALHOUR = 0;
        int TOTALDAILYWAGE = 0;


        while (TOTALHOUR < 80 && TOTALWORKINGDAYS < 20) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
            TOTALWORKINGDAYS ++;

            switch (employeeCheck) {
                case 2:
                    TOTALDAILYWAGE = FULLTIMEHOUR * WAGEPERHOUR;
                    System.out.println("Employee is present full time");
                    break;
                case 1:
                    TOTALDAILYWAGE = PARTTIMEHOUR * WAGEPERHOUR;
                    System.out.println("Employee is present half time");
                    break;
                default:
                    System.out.println("Employee is absent" +TOTALDAILYWAGE);
            }
            System.out.println("Working Days is: " +TOTALDAILYWAGE+ " Hours: " +TOTALHOUR);
        }
        System.out.println("Employee total wage for month is: " +TOTALDAILYWAGE);

        }
    }
