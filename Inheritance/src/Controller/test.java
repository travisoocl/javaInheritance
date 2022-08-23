package Controller;

import Model.Animal;
import Model.Tiger;

public class test {

    public static void main(String[] args)
    {
        Tiger tiger = new Tiger(12, 120, "fast", "meat");

        System.out.println("Age of tiger is: " + tiger.getAge());
        System.out.println("Weight of tiger is: " + tiger.getWeight());
        System.out.println("Speed of tiger is: " + tiger.getRunning());
        System.out.println("Diet of tiger is: " + tiger.getEating());
        tiger.meow();
    }

}
