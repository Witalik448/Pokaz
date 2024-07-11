package Lesson4;

public class Car {
    String collor = "Red";
    String engine = "V6";
}
 class CarTest{
     public static void main(String[] args) {
         int a;
         Car car1 = new Car();
         car1.collor="Black";
         car1.engine="V8";

         System.out.println("Collor: " + car1.collor + "\n" + "Engine: " + car1.engine);
     }
 }
