package day09_oo;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Bird();
        System.out.println(animal.legs);
        System.out.println(animal.getLegs());
        animal.move();
    }
}
