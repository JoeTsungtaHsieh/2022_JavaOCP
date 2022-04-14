package day09_oo;

public class VarargDemo {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        int[] values = {10, 20, 30, 40};
        System.out.println(add(values));
    }
    
     public static int add (int... values) { //計算 int 物件陣列的結果
        int sum = 0;
        for(int value : values){
            sum += value;
            
        }
        return sum;
    }
    
    /*
    public static int add(int x, int y) { //二數加總的方法
        return x + y;
    }
    
    public static int add(int x, int y, int z) { //三數加總的方法
        return x + y + z;
    }
    
    public static int add (int [] values) { //計算 int 物件陣列的結果
        int sum = 0;
        for(int value : values){
            sum += value;
            
        }
        return sum;
    }
*/
}
