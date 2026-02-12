package SecondTraining;

public class OverLoad_test {

   static int test1(int s,int u)
    {
        return s+u;
    }
    static float test1(float a , float b, float c)
    {
        return a + b+c;
    }

    public static void main(String[] args) {
        System.out.println("The value integer is: " +test1(5,6) +"\n" +"The float value is :"+ test1(25.2f,36.89f,67.8f));
      System.out.println("""
              Float value is: 
              When i need my text: +test1(5,6);
              """);
    }

}
