/*
    name - Ranjan Bej
    registration number - 2241002132
    problem link - https://cses.fi/problemset/task/1068
 */

import java.util.Scanner;
public class Q2_1068 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        while(n>=1){
            System.out.print(n+" ");
            if(n==1){
                break;
            }
            if(n%2==0){
                n=n/2;
            }
            else{
                n=(n*3)+1;
            }
        }
        sc.close();
    }
}