package com.alin;


import java.util.ArrayList;
import java.util.Scanner;

public class Demo01 {


    //This ArrayList use to save the student's name
    ArrayList<String> alName = new ArrayList<>();

    //This ArrayList use to save the student's id
    ArrayList<Integer> alId = new ArrayList<>();

    //This ArrayList use to save the student's class
    ArrayList<String> alClass = new ArrayList<>();

    //The ArrayList use to save the student's major
    ArrayList<String> alMajor = new ArrayList<>();

    public void menu(){


        try{
            while(true){
                System.out.println("Student Manger System");
                System.out.println("Welcome!");
                System.out.println("1.Add the students ");
                System.out.println("2.Delete the students");
                System.out.println("3.Query the students");
                System.out.println("4.Alter the students");
                System.out.println("5.Exit");

                System.out.println("Please input the numbers:1~5");
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();

                if (input == 1){
                    System.out.println("You come in the Add Module");
                    addModule();
                } else if (input == 2){
                    System.out.println("You come in the Delete Module");
                    deleteModule();
                } else if (input == 3){
                    System.out.println("You come in the Query Module");
                    queryModule();
                } else if(input == 4){
                    System.out.println("You come in the Alter Module");
                    alterModule();
                } else if(input == 5){
                    System.out.println("Byte");
                    break;
                } else {
                    System.out.println("Your input is error!");
                    System.out.println("Please re input");
                }

            }
        }catch (Exception e){
            System.out.println("Your input is error");
            System.out.println("Please re input");
            menu();
        }


    }

    private void alterModule() {
    }

    private void queryModule() {
    }

    private void deleteModule() {
    }

    private void addModule() {

        //add name
        System.out.println("Please input you want to add student's name:");
        Scanner scanName = new Scanner(System.in);
        String setName = scanName.next();
        alName.add(setName);

        //add id
        System.out.println("Please input you want to add student's id");
        Scanner scanId = new Scanner(System.in);
        int setId = scanId.nextInt();
        alId.add(setId);

        //add major
        System.out.println("Please input you want to add student's major");
        Scanner scanMajor = new Scanner(System.in);
        String setMajor = scanMajor.next();
        alMajor.add(setMajor);

        //add class
        System.out.println("Please input you want to add student's class");
        Scanner scanClass = new Scanner(System.in);
        String setClass = scanClass.next();
        alClass.add(setClass);


        while(true){
            System.out.println("Do you continue to add students' information? Y/N");
            Scanner answer = new Scanner(System.in);
            String ans = answer.next();
            if (ans.equals("Y")){
                System.out.println("Please later 1s time");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                addModule();
            } else if (ans.equals("N")){
                System.out.println("Returning to the previous directory");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            } else {
                System.out.println("You input is error!");
                System.out.println("Please re input!");
            }
        }


    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.menu();
    }



}
