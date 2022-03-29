package day05_oo;

public class Hamburger {
    private String name; // 漢堡名稱
    private Bread bread;  // 內容物-麵包
    private Cheese cheese; // 內容物-起司
    private Beef beef;   // 內容物-牛肉
    private Integer price; // 漢堡基礎價

    public Hamburger(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Hamburger(String name, Bread bread, Cheese cheese, Beef beef, Integer price) {
        this.name = name;
        this.bread = bread;
        this.cheese = cheese;
        this.beef = beef;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Beef getBeef() {
        return beef;
    }

    public void setBeef(Beef beef) {
        this.beef = beef;
    }

    public Integer getPrice() {
        int sum = price + bread.getPrice() + 
                beef.getPrice() + cheese.getPrice();
        return sum;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hambuger{" + "name=" + name + ", bread=" + bread + ", cheese=" + cheese + ", beef=" + beef + ", price=" + price + '}';
    }

   
    
}
