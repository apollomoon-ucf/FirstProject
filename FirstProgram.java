

public class FirstProgram
{
  public static void main(String[] args)
  {

    // declaring vars
    int age = 13;
    double weight = 123.345678;

    // testing prints
    // printf allows you to print out vars
    System.out.printf("Hello everyone! I am %d years old! I weigh %.2f\n", age, weight);
    // println automatically prints a new line after the statement
    System.out.println("Hello everyone!");
    // print requires a new line char at the end just like C
    System.out.print("Hello again everyone!\n");

    // testing new output for github
    System.out.println("Testing new changes for github\n");

    // basic arithmetic
    System.out.println(10 + 12);
    System.out.println(10 / 12);
    System.out.println(10.0 / 12.0);

    int x = 12;
    int y = 10;
    double u = 10.0;
    System.out.println(x / 0.001);
    System.out.println(y / u);
    System.out.println(x % u);
    System.out.println(10.0 % 12.0); // you can use mod arith on floating point in java even though you really shouldnt

  }
}
