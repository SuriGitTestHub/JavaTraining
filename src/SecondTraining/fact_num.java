package SecondTraining;
import java.util.*;

public class fact_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int fact =sc.nextInt();
        int result =1;
        if (fact <= 0)
        {
            System.out.println("Please enter above 0");
        }
        else
        {
            for (int i=fact;i>0;i--)
            {
                result = result*i;
            }
            System.out.println("The value is" +result);
        }
    }

    /*
    i=5
    5*5
    i=4
    5*4


     */

}
