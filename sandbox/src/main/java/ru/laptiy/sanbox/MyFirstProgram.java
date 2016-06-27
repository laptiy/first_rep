package ru.laptiy.sanbox;

public class MyFirstProgram {

   public static void main(String[] args) {
      hello("Me");
      hello("You");
      hello("We");
      hello("Us");

      double l = 5;
      System.out.println("Площадь квадрата со стороной " + l + " равно " + area(l));
      double a = 2;
      double b = 3;
      System.out.println("Площадь прямоугльника  со сторонами " + a + "и" + b + " равно " + area(a,b));
   }

   public static void hello(String smb) {
      System.out.println("Hello " + smb + "!");
   }

   public static double area(double len) {
      return len * len;
   }
   public static double area(double a, double b){
      return a * b;
   }
}