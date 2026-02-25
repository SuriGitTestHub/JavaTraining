package SecondTraining;

import java.util.Scanner;

public class Swap_teo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the value of B");
        int b = Integer.parseInt(sc.nextLine());
        //if(a>b) {
            a = b + a;
            b = a - b;
            a = a -b;
      //  }
//        else {
//            b = a + b;
//            a = b - a;
//            b = b - a;
//        }
        System.out.println("a="+a+" B="+b);

    }
}
