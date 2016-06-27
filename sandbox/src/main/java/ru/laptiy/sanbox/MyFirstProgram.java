package ru.laptiy.sanbox;

public class MyFirstProgram {

   public static void main(String[] args) {
      hello("Me");
      hello("You");
      hello("We");
      hello("Us");

      Square s = new Square(4);

      System.out.println("Площадь квадрата со стороной " + s.l + " равно " + area(s));

      Rectangle a = new Rectangle(44, 22);


      System.out.println("Площадь прямоугльника со сторонами " + a.a + " и " + a.b + " равно " + area(a));
   }

   public static void hello(String smb) {
      System.out.println("Hello " + smb + "!");
   }

   public static double area(Square s) {
      return s.l * s.l;
   }

   public static double area(Rectangle a) {
      return a.a * a.b;
   }
}