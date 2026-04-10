public class Manager extends Employee implements Payable{

    public double salary;

    public Manager(String name, int id, double salary){
        super(name,id);
        this.salary = salary;
    }

    @Override
    public double calculatePay(){
        return salary;
    }
    @Override
    public void work(){
        System.out.println("Next payday for management team is 27th August");
    }
}