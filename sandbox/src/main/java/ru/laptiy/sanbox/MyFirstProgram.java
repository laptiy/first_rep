package ru.laptiy.sanbox;

import javax.swing.*;

public class MyFirstProgram {

   public static void main(String[] args) {
      hello("Me");
      hello("You");
      hello("We");
      hello("Us");

      Square s = new Square(4);

      System.out.println("Площадь квадрата со стороной " + s.l + " равно " + s.area());

      Rectangle a = new Rectangle(44, 22);


      System.out.println("Площадь прямоугльника со сторонами " + a.a + " и " + a.b + " равно " + a.area());
   }

   public static void hello(String smb) {
      System.out.println("Hello " + smb + "!");
   }

   }
