package day12_equals;

public enum Postion {
    總經理(100000), 經理(80000), 員工(50000);
    private int salary;
    
    // enum 的建構子權限一定是 private
    // 不寫的預設就是 private
    private Postion(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

   
}
