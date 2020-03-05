package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

       // char sim1 = 'Z';
       // double doub1=1.0/3.0;
       // String str1 = "Zmicerby";

        //double num1, num2, res;
        //Scanner num = new Scanner(System.in);

        //  System.out.println("Введите значение числителя");

        //System.out.println(num.nextDouble());

        //num1 = num.nextDouble();

        //  System.out.println("Введите значение знаменателя");
        //num2 = num.nextDouble();

        // res = num1/num2;

        //System.out.println(res);

//        System.out.println("Введите количество матчей до 5-ти");
        int game1;

//        Scanner num = new Scanner(System.in);
//        game1 = num.nextInt();

        game1 = 5;
        int [] goals  = new int[game1];

        goals[0] = 2;
        goals[1] = 1;
        goals[2] = 0;
        goals[3] = 5;
        goals[4] = 3;

        System.out.println("Демонстрация цикла  for:");

        for (int i = 0; i < goals.length; i++) {

            System.out.println("Забил в " + (i + 1) + "-м матче -> " + goals[i]);}

        System.out.println("-----------");


        System.out.println("Демонстрация цикла  while:");

        int counter = 0;
        while (counter < goals.length){

            System.out.println("Забил в " + (counter + 1) + "-м матче -> " + goals[counter]);
            counter++;
        }

        System.out.println("-----------");

        System.out.println("Демонстрация switch:");

        for (int i = 0; i < goals.length; i++){

            System.out.print("В " + (i +1) + "-м матче ");
            switch (goals[i]){
                case 0:
                    System.out.println("не забил ни одного гола");
                    break;
                case 1:
                    System.out.println("забил гол");
                    break;
                case 2:
                    System.out.println("оформил дубль");
                    break;
                case 3:
                    System.out.println("оформил хет-трик");
                    break;
                default:
                    System.out.println("играл как Боженька");
            }
        }




    }









    }

