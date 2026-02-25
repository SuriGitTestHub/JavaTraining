package SecondTraining;

public class suri {
    public int test(int a)
    {
       // System.out.println("Z is "+a);
        return a;
    }
     float test(float x)
    {
        return x;
    }
    int test(int a, int b)
    {
        int c= a+b;
        return c;
    }
    public static void main(String[] args) {
        float b=678.6f;
        int a=56;
        int x=5;
        suri s =new suri();

        System.out.println("the value is " +s.test(b));
        System.out.println("the value is " +s.test(a,x));

    }
}
