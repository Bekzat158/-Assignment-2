public class Employee extends Person{
    public String position;
    private double salary;

    public Employee(){
        super();
    }
    public Employee(String name,String surname,String position,double salary){
        super(name,surname);
        setPosition(position);
        setSalary(salary);
    }
    public String getPosition(){
        return position;
    }
    @Override
    public double getPaymentAmount() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee: "+super.toString();
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}
