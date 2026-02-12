package SecondTraining;
import java.util.*;
public class Test2 {
   public static void main(String[] args)
   {
       String name;
       String name2="";
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your name");
       name=sc.nextLine().toLowerCase();
       String na=new StringBuilder(name).reverse().toString();
       System.out.println(na);

   }


}