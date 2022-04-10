

import java.util.Scanner;

class intputinjava {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter a name : ");
    String name = myObj.nextLine();
    System.out.println("Entered name : " + name);

    System.out.print("Enter a double value : ");
    double value = myObj.nextDouble();
    System.out.println("Entered double value : "+value);    

    System.out.print("Enter a number : ");
    int age = myObj.nextInt();
    System.out.println("Entered number : " + age);
  }
}