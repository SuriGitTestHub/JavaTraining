package SecondTraining;

    class suri extends overide_check {

        // This OVERRIDES the test(int a) method from method_check
      //  @Override
        public int test(int a) {
            System.out.println("This is the overridden version in class Suri!");
            return a * 2; // Changing the behavior to return double the value
        }

        public static void main(String[] args) {
            // Create an instance of the child class
            suri myObj = new suri();

            // This will call the OVERRIDDEN version in suri
          //  System.out.println("Result from suri: " + myObj.test(10));

            // This will still call the OVERLOADED version from the parent
            // because we didn't override the two-parameter version
            System.out.println("Result from parent logic: " + myObj.test(10, 20));
        }
    }

