package com.HarshSaxena;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int average = 0;

        while(true){
            //System.out.println("Enter the number");
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
                average = (int)Math.round((double) sum / count);

            }else{
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
