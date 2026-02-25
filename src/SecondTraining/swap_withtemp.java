package SecondTraining;
import java.util.*;

public class swap_withtemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the value of B");
        int b = Integer.parseInt(sc.nextLine());
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a= "+a+" b="+b);

    }
}
