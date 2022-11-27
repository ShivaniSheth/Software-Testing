package org.example;

import org.example.math.*;

import java.sql.SQLOutput;
import java.util.Scanner;
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
            System.out.println(" Enter 1:Stack operations \n Enter 2:Sorting operations \n Enter 3:Math operations \n Enter 4:Exit");
            System.out.println(" Enter your choice::");
            choice= sc.nextInt();
            switch (choice) {
                case 1://Stack Operations
                    System.out.println("Stack Operations::");
                    System.out.println(" Enter 1:Max Depth Function \n Enter 2:Remove Duplicate Function \n Enter 3:Check for valid parenthesis Function");
                    System.out.println(" Enter your choice::");
                    int ch=sc.nextInt();
                    switch (ch){
                        case 1:
                            System.out.println(" Enter a string:");
                            String s=sc.next();
                            new maxDepth().maxdepth(s);
                            break;
                        case 2:
                            System.out.println(" Enter a string:");
                            String s1=sc.next();
                            new removeDuplicate().removeduplicates(s1);
                            break;
                        case 3:
                            System.out.println("Enter a string:");
                            String s2=sc.next();
                            new validParenthesis().isValid(s2);
                            break;
                        default:
                            System.out.println("Entered wrong choice!!");
                    }
                    break;



                case 2://Sorting Operations
                    System.out.println("Sorting Operations::");
                    System.out.println(" Enter 1:Find Difference Function  \n Enter 2:Sort Array by parity Function \n enter 3:Squares of Sorted Array \n Enter 4:Bubble Sort Function \n Enter 5:Counting Sort \n Enter 6:Insertion Sort");
                    System.out.println(" Enter your choice::");
                    int ch1=sc.nextInt();
                    switch (ch1){
                        case 1:
                            System.out.println(" Enter string 1 :");
                            String s1=sc.next();
                            System.out.println(" Enter string 2 :");
                            String s2=sc.next();
                            new findDifference().finddifference(s1,s2);
                            break;
                        case 2:
                            System.out.println(" Enter array length: ");
                            int len = sc.nextInt();
                            int arr[] = new int[len];
                            System.out.println(" Enter numbers: ");
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
                        case 4:
                            System.out.println("Enter array length: ");
                            int len2 = sc.nextInt();
                            int arr2[] = new int[len2];
                            System.out.println("Enter numbers: ");
                            for(int u=0;u<len2;u++){
                                arr2[u] = sc.nextInt();
                            }
                            new BubbleSort().bubblesort(arr2);
                            break;
                        case 5:
                            System.out.println("Enter array length: ");
                            int len3 = sc.nextInt();
                            int arr3[] = new int[len3];
                            System.out.println("Enter numbers: ");
                            for(int u=0;u<len3;u++){
                                arr3[u] = sc.nextInt();
                            }
                            new CountingSort().countingsort(arr3);
                            break;
                        case 6:
                            System.out.println("Enter array length: ");
                            int len4 = sc.nextInt();
                            int arr4[] = new int[len4];
                            System.out.println(" Enter numbers: ");
                            for(int u=0;u<len4;u++){
                                arr4[u] = sc.nextInt();
                            }
                            new InsertionSort().insertionsort(arr4);
                            break;
                        default:
                            System.out.println(" Entered wrong choice!!");
                            break;

                    }
                    break;
                case 3://Math operations
                    System.out.println("Math Operations::");
                    System.out.println(" Enter 1:Count Primes Function  \n Enter 2:Integer to Roman Function \n Enter 3:Missing Number Function \n Enter 4:Max no of Point on the straight line Function \n Enter 5:Magic Number Function \n Enter 6:Prime Factorization \n Enter 7:Pythagorean Triple Function");
                    System.out.println(" Enter your choice::");
                    int ch2=sc.nextInt();
                    switch (ch2){
                        case 1:
                            System.out.println(" Enter a number:");
                            int x=sc.nextInt();
                            new CountPrimes().countPrimes(x);
                            break;
                        case 2:
                            System.out.println(" Enter a number:");
                            int y=sc.nextInt();
                            new IntegerToRoman().intToRoman(y);
                            break;
                        case 3:
                            System.out.println(" Enter array length: ");
                            int len1 = sc.nextInt();
                            int arr1[] = new int[len1];
                            System.out.println(" Enter numbers: ");
                            for(int u=0;u<len1;u++){
                                arr1[u] = sc.nextInt();
                            }
                            new MissingNo().missingNumber(arr1);
                            break;
                        case 4:
                            System.out.println(" Enter no of points: ");
                            int row = sc.nextInt();

                            System.out.println(" Enter points coordinates: ");
                            int arr[][] = new int[row][2];
                            for( int i=0;i<row;i++ ){
                                for ( int j=0;j<2;j++ ){
                                    int temp = sc.nextInt();
                                    arr[i][j] = temp;
                                }
                            }
                            new MaxPoint().maxPoints(arr);
                            break;
                        case 5:
                            System.out.println(" Enter number :");
                            int ans= sc.nextInt();;
                            new MagicSquare().magicsquare(ans);
                            break;

                        case 6:
                            System.out.println(" Enter no: ");
                            int no=sc.nextInt();
                            new PrimeFactorization().primeFactorization(no);
                            break;

                        case 7:
                            System.out.println(" Enter no 1 :");
                            int x1= sc.nextInt();
                            System.out.println(" Enter no 2 :");
                            int y1=sc.nextInt();
                            System.out.println(" Enter no 3 :");
                            int z1=sc.nextInt();
                            new PythagoreanTriple().pythagoreantriple(x1,y1,z1);
                            break;
                        default:
                            System.out.println(" Entered wrong choice!!");
                            break;


                    }
                    break;



                case 4:
                    flag=false;
                    System.out.println("Exiting!!");
                    break;
                default:
                    System.out.println("Wrong input entered");
            }



        }
    }
}