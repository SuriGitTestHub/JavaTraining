package SecondTraining;

import java.util.*;

public class Calc {
    public Calc() {
        System.out.println("Test Constructor");
        int test=10;
        System.out.println(test);// test

    }

    void test(int no, String name) {
        System.out.println("Name is: " + name + "Number is: " + no);
    }

    public static void main(String[] args) {
        Calc t1=new Calc();
        Calc t2=new Calc();
        Calc t3=new Calc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int no =Integer.parseInt(sc.nextLine());
        System.out.println("Enter your number: ");
        String name =sc.nextLine();
        t1.test(no,name);

    }
}
