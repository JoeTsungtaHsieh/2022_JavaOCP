package day02;

public class Rect {
    private int weight;
    private int high;
    private int area;
    
    void setWeightAndHigh(int w, int h){
        weight = w;
        high = h;
        area = w * h;
    }
    
    int getArea() {
        return  area;
    }
}
