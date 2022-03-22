package day03;

public class ArrayDemo1 {

    public static void main(String[] args) {
        double[] heights = {150, 165, 170, 180}; //cm
        double[] weights = {55, 65, 77, 85};  // kg
        // 求 heights 平均 
        double heightAvg = getAvg(heights);
        double weightAvg = getAvg(weights);
        System.out.printf("身高平均:%.1f 體重平均:%.1f\n", heightAvg, weightAvg);
        // 求 height 標準差 SD
        double heightSD = getSD(heights);
        // 求 weight 標準差 SD 
        double weightSD = getSD(weights);
        System.out.printf("身高標準差:%.1f 體重標準差:%.1f\n", heightSD, weightSD);
        // 求 heights 變異係數 CV
        double heightCV = getCV(heights);
        // 求 weights 變異係數 CV
        double weightCV = getCV(weights);
        System.out.printf("身高變異係數:%.1f 體重變異係數:%.1f\n",heightCV,weightCV);
    }

    // 計算 CV 的方法
    public static double getCV(double[] values) {
        double sd = getSD(values);
        double avg = getAvg(values);
        double cv = sd / avg;
        return cv;
    }

    // 計算 SD 的方法
    public static double getSD(double[] values) {
        double avg = getAvg(values);
        int sum = 0;
        for (double value : values) {
            sum += Math.pow(value - avg, 2);
        }
        double sd = Math.sqrt(sum / values.length);  //開根號
        return sd;
    }

    // 計算平均的方法
    public static double getAvg(double[] values) {
        double sum = getSum(values);
        double avg = sum / values.length;
        return avg;
    }
    
    // 計算總和的方法
    public static double getSum(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

}
