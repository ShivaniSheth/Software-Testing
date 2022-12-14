package org.example.math;

import java.util.*;

public class PrimeFactorization {

    public List<Integer> primeFactorization(int n){

        System.out.print(("printing factors of " + n + " : "));

        List<Integer> res = new ArrayList<>();
        int flag=0;

        while (n % 2 == 0) {
            if(flag==0){
                res.add(2);
                flag=1;
            }
            n /= 2;
        }

        flag=0;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                if(flag==0){
                    res.add(i);
                }
                n /= i;
            }
        }

        if (n > 2) {
            res.add(n);
        }

        System.out.println("Result: ");
        for (int v : res) {
            System.out.print(v+" ");
        }

        return res;

    }

}
