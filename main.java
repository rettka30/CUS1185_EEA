import java.util.*;
import java.lang.*;
import java.io.*;

public class main {

   public static void gcd(int b, int a) {
      if(a == 0) {
         System.out.println(b);
      } else if(b == 0) {
         System.out.println(a);
      } else {
         gcd(a, (b % a));
      }
   }
   
   public static void ea(int n, int a) {
      if(n > 1 && a >= 1) {
         gcd(n,a);
      } else {
         System.out.println("Inputs invalid");
      }
   }
   
   public static void eea(int n, int a) {
      int x = 0;
      int y = 1;
      int endx = 1;
      int endy = 0;
      int temp = 0;
      while (a != 0) {
         int q = n / a;
         int r = n % a;
         n = a;
         a = r;
         temp = x;
         x = endx - q * x;
         endx = temp;
         temp = y;
         y = endy - q * y;
         endy = temp;
      }
      if(endx > 0 && endy > 0) {
         System.out.println(endx + ", " + endy);
      } else if(endx > 0 && endy <= 0) {
         System.out.println(endx);
      } else if(endy > 0 && endx <= 0) {
         System.out.println(endy);
      } else {
         System.out.println("Inverse does not exist");
      }
   }

   public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
      boolean c = true;
      while(c) {
         System.out.println("EA=>1, EEA=>2, Quit=>-1");
         int input = myObj.nextInt();
         if(input == -1) {
            c =  false;
         } else if(input == 1) {
            System.out.println("Euclidean Algorithm");
            System.out.println("N is modulus and a should be an integer");
            System.out.println("N must be greater than 1; a must be greater or equal to 1");
            System.out.println("Input N first, then enter, then a, enter again");
            int n = myObj.nextInt();
            int a = myObj.nextInt();
            ea(n,a);
         } else {
            System.out.println("Extended Euclidean Algorithm");
            System.out.println("N is modulus and a should be an integer");
            System.out.println("N must be greater than 1; a must be greater or equal to 1");
            System.out.println("Input N first, then enter, then a, enter again");
            int n = myObj.nextInt();
            int a = myObj.nextInt();
            eea(n,a);
         } 
      }
   }
}