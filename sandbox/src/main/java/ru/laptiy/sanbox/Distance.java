package ru.laptiy.sanbox;

/**
 * Created by lapti on 28.06.2016.
 */
public class Distance {

   public static void main(String[] args) {
      Point p1 = new Point(33, 22);
      Point p2 = new Point(11, 12);

      System.out.println(distance(p1, p2));
   }

   public static double distance(Point p1, Point p2) {
      return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));

   }

}
