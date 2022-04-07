package day06_oo;

public class Teacher extends Person {
    private Integer salary;
    
    public Teacher() {
        
    }
    
    public Teacher(String name, Integer age, Integer salary) {
        super(name, age);
        //super.setName(name);
        //super.setAge(age);
        this.setSalary(salary);
    }
    
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + "} " + super.toString();
    }
    
}
