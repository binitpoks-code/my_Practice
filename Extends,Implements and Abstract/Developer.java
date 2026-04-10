public class Developer extends Employee implements Payable{

    public double hourlyRate;
    public double hoursWorked;

    public Developer (String name, int id, double hourlyRate, double hoursWorked){
        super(name,id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    //Methods
    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public void work(){
        System.out.println("Yaee We implement our abstract method");
    }
    


}