package day05_oo;

public class Beef {
    private String name; //牛肉名稱
    private Integer price; // 牛肉價格
    
    // 建構子封裝
    public Beef(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    
    // 方法封裝
    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
    // 印出物件字串訊息
    @Override
    public String toString() {
        return "Beef{" + "name=" + name + ", price=" + price + '}';
    }
    
}
