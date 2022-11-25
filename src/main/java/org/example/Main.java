package org.example;

import org.example.math.*;
import java.util.Scanner;
import java.util.Stack;
import org.example.Stack.*;
import org.example.Sorting.*;
import org.example.math.*;

public class    Main {
    public static void main(String[] args) {

//        System.out.println(new CountPrimes().countPrimes(45));
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean flag=true;
        while(flag)
        {
            System.out.println(" enter 1:stack operations \n enter 2:for sorting operations \n enter 3:math operations \n enter 4:exit");
            System.out.println("enter your choice::");
            choice= sc.nextInt();
            switch (choice) {
                case 1://Stack Operations
                    System.out.println("enter 1:MaxDepth of  \n enter 2:RemoveDuplicate from string \n enter 3:Check for valid parenthesis");
                    System.out.println("Enter your choice::");
                    int ch=sc.nextInt();
                    switch (ch){
                        case 1:
                            System.out.println("enter a string:");
                            String s=sc.next();
                            new maxDepth().maxdepth(s);
                            break;
                        case 2:
                            System.out.println("enter a string:");
                            String s1=sc.next();
                            new removeDuplicate().removeduplicates(s1);
                            break;
                        case 3:
                            System.out.println("enter a string:");
                            String s2=sc.next();
                            new validParenthesis().isValid(s2);
                            break;
                        default:
                            System.out.println("entered wrong choice!!");
                    }
                    break;



                case 2://Sorting Operations
                    System.out.println("enter 1:Find Difference of Strings  \n enter 2:Sort Array by parity \n enter 3:Squares of Sorted Array");
                    System.out.println("Enter your choice::");
                    int ch1=sc.nextInt();
                    switch (ch1){
                        case 1:
                            System.out.println("enter string1 :");
                            String s1=sc.next();
                            System.out.println("enter string2 :");
                            String s2=sc.next();
                            new findDifference().finddifference(s1,s2);
                            break;
                        case 2:
                            System.out.println("Enter array length: ");
                            int len = sc.nextInt();
                            int arr[] = new int[len];
                            System.out.println("Enter numbers: ");
                            for(int u=0;u<len;u++){
                                arr[u] = sc.nextInt();
                            }
                            new sortArraybyParity().sortarrayByparity(arr);
                            break;
                        case 3:
                            System.out.println("Enter array length: ");
                            int len1 = sc.nextInt();
                            int arr1[] = new int[len1];
                            System.out.println("Enter numbers: ");
                            for(int u=0;u<len1;u++){
                                arr1[u] = sc.nextInt();
                            }
                            new squaresofSortedArray().sortedSquares(arr1);
                            break;
                    }
                    break;
                case 3://Math operations
                    System.out.println("enter 1:Count Primes  \nenter 2:Integer to Roman \nenter 3:Missing Number \nenter 34: Max no of Point on the straight line");
                    System.out.println("Enter your choice::");
                    int ch2=sc.nextInt();
                    switch (ch2){
                        case 1:
                            System.out.println("enter a number:");
                            int x=sc.nextInt();
                            new CountPrimes().countPrimes(x);
                            break;
                        case 2:
                            System.out.println("enter a number:");
                            int y=sc.nextInt();
                            new IntegerToRoman().intToRoman(y);
                            break;
                        case 3:
                            System.out.println("Enter array length: ");
                            int len1 = sc.nextInt();
                            int arr1[] = new int[len1];
                            System.out.println("Enter numbers: ");
                            for(int u=0;u<len1;u++){
                                arr1[u] = sc.nextInt();
                            }
                            new MissingNo().missingNumber(arr1);
                            break;
                        case 4:
                            System.out.println("Enter no of points: ");
                            int row = sc.nextInt();

                            System.out.println("Enter points coordinates: ");
                            int arr[][] = new int[row][2];
                            for( int i=0;i<row;i++ ){
                                for ( int j=0;j<2;j++ ){
                                    int temp = sc.nextInt();
                                    arr[i][j] = temp;
                                }
                            }
                            new MaxPoint().maxPoints(arr);
                            break;
                        default:
                            System.out.println("entered wrong choice!!");
                            break;


                    }
                    break;



                case 4:
                    flag=false;
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("wrong input entered");
            }



        }
    }
}