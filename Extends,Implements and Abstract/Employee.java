public abstract class Employee {

    public String name;
    public int id;

    public Employee (String name, int id){
        this.name = name;
        this.id = id;
    }
    // An abstract method work()
    public abstract void work();

    public void displayInfo(){
        System.out.println("Employee name:" + name);
        System.out.println("Id" + id);
    }
}