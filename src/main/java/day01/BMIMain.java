package day01;

public class BMIMain {
    public static void main(String[] args) {
        BMI b1 = new BMI(); // 建立一個BMI物件
        BMI b2 = new BMI();
        
        b1.name = "John";
        b1.height = 170;
        b1.weight = 60;
        b1.bmiValue = 60.0/ Math.pow(170, 2); // Not good
        b2.name = "Mary";
        b2.height = 160;
        b2.weight = 45;
        b2.bmiValue = b2.weight / Math.pow(b2.height, 2); // Good
        System.out.printf("%s %.1f %.1f %.1f\n",b1.name,b1.height,b1.weight,b1.bmiValue);
        System.out.printf("%s %.1f %.1f %.1f\n",b2.name,b2.height,b2.weight,b2.bmiValue);
    }
}
