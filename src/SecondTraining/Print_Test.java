package SecondTraining;
import java.util.*;

public class Print_Test
{
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter you name");
        String name=s.nextLine();
        System.out.println("Enter your age");
        int age=Integer.parseInt(s.nextLine().trim());
        //int age = s.nextInt();
        System.out.println("Enter your marks");
        float marks = Float.parseFloat(s.nextLine().trim());
        System.out.println("Enter your Gender");
        char gender =s.nextLine().charAt(0);
        System.out.println("Completed higher school");
        boolean school=s.nextBoolean();
        System.out.printf("Your name is%s",name);

    }
}
