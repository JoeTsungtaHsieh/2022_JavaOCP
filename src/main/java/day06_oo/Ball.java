/*
 * 建構子的操作
 */
package day06_oo;

public class Ball {
    private String color;
    private Integer price;
    
    public Ball(int price) {
        System.out.println("A");
    }
    
    public Ball() {
        System.out.println("B");
    }
    
    public Ball(String color) {
        System.out.println("C");
    }
    
    public Ball(String color, Integer price) {
        System.out.println("D");
    }
    
    // 方法封裝
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }
    
}