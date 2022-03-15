package day01;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入半徑: ");
        double r = scanner.nextDouble();
        double area  = Math.PI * Math.pow(r, 2);
        System.out.printf("area: %.1f\n",area);
    }
}
