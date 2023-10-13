/*
    name - Ranjan Bej
    registration number - 2241002132
    problem link - https://cses.fi/problemset/task/1083 
 */

import java.util.Scanner;

public class Q1_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long length =sc.nextInt();
        long arrSum = 0;
        for(int i =1;i<=length-1;i++){
            int num =sc.nextInt();
            arrSum += num;
        }
        long sum = (long)(length*(length+1))/2;
        long missNum = (long)(sum - arrSum);
        System.out.println(missNum);
        sc.close();
    }
}
