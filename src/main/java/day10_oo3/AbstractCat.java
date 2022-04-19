package day10_oo3;


public abstract class AbstractCat {
    // 抽象類別中的方法一定要加 abstract 修飾字
    // 另外存取全縣可以是: public protected 與 預設 default權限(不寫)
    public abstract void skill();
    
    public void eat() {
        System.out.println("魚");
    }
}
