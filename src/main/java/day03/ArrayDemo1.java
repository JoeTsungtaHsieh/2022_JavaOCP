package day03;

public class ArrayDemo1 {

    public static void main(String[] args) {
        double[] heights = {150, 165, 170, 180}; //cm
        double[] weights = {55, 65, 77, 85};  // kg
        // 求 heights 平均 
        double heightAvg = Uti1.getAvg(heights);
        double weightAvg = Uti1.getAvg(weights);
        System.out.printf("身高平均:%.1f 體重平均:%.1f\n", heightAvg, weightAvg);
        // 求 height 標準差 SD
        double heightSD = Uti1.getSD(heights);
        // 求 weight 標準差 SD 
        double weightSD = Uti1.getSD(weights);
        System.out.printf("身高標準差:%.1f 體重標準差:%.1f\n", heightSD, weightSD);
        // 求 heights 變異係數 CV
        double heightCV = Uti1.getCV(heights);
        // 求 weights 變異係數 CV
        double weightCV = Uti1.getCV(weights);
        System.out.printf("身高變異係數:%.1f 體重變異係數:%.1f\n",heightCV,weightCV);
    }
}    
