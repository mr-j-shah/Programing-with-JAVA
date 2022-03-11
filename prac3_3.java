public class prac3_3 {
    public static void main(String[] args) {
        Employee e = new Employee("jinay", 10000);
        e.print();
    }
}
class Employee{
    String name;
    int salary,DA;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
        this.DA=(salary*75)/100;
    }
    void print(){
        System.out.println("Name : "+name+"\nSalary : "+salary+"\nDearness Allowance : "+DA);
    }
}