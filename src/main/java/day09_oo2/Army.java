package day09_oo2;

import java.util.stream.Stream;

public class Army {
    public static void main(String[] args) {
        Car Car1 = new Benz(200);
        Car Car2 = new Tank(5000);
        
        Weapon w1 = new T91();
        Weapon w2 = (Weapon)Car2;
        Weapon w3 = new Tank(6000);
        
        Car[] cars = {Car1, Car2, (Car)w3};
        // 總共馬力是多少
        int sumPower = Stream.of(cars).mapToInt(car -> car.getPower()).sum();
        System.out.println(sumPower);
        Weapon[] weapons = {w1, w2, w3};
        // 統一發射武器
        Stream.of(weapons).forEach(Weapon::shoot);
        Object[] objects = {Car1, Car2, w1, w2, w3};
        // 總共馬力是多少
        int sum = Stream.of(objects)
                .filter(object -> object instanceof Car)
                .map(object -> (Car)object)
                .mapToInt(Car::getPower)
                .sum();
        System.out.println(sum);
        
    }
}
