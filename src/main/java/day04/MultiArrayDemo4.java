package day04;

import java.util.Arrays;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        double[][] values = {
            {170.0, 60},
            {180.0, 75},
            {160.0, 55},
        };
        // 請個別求出 bmi
        double[] bmis = new double[values.length];
        for(int i=0;i<values.length;i++){
           double h = values[i][0];
           double w = values[i][1];
           double bmi = getBMI(h,w);
           bmis[i] = bmi;
        }
        System.out.println(Arrays.toString(bmis));
        Arrays.sort(bmis);
        System.out.println(Arrays.toString(bmis));
    }
    public static double getBMI(double h, double w){
        double bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
}
