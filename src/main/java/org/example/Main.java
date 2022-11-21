package org.example;

import java.util.Scanner;
import java.util.Stack;
import org.example.Stack.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean flag=true;
        while(flag)
        {
            System.out.println("enter 1 for stack operations 2 for sorting 3 for  exit::");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter choice: 1 for maxDepth \n enter 2 for removeDuplicate \n enter 3 for valid parenthesis::");
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
                            System.out.println("entered wrong input");
                    }



                case 2:
//

                case 3:
                    flag=false;
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("wrong input entered");
            }



        }
    }
}