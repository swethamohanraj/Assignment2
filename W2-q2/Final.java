public class Final
{
    public static void main(String[] args)
    {
        System.out.println("Employee Details: ");
        employee emp = new employee();
        emp.name="Ani";
        emp.age=19;
        emp.mobileno="9563282341";
        emp.address="12th Street,chennai";
        emp.printSalary(70000);
        emp.specialization("Back end");
        System.out.println("Name: "+emp.name+"\nAge: "+emp.age+"\nPhone number: "+emp.mobileno+"\nAddress: "+emp.address);

        manager man=new manager();
        System.out.println("\nManager Details: ");
        man.name="Vish";
        man.age=21;
        man.mobileno="9873389945";
        man.address="5th Street,chennai";
        man.specialization("Backend");
        man.Department("Software");
        man.printSalary(60000);

        System.out.println("Name: "+man.name+"\nAge: "+man.age+"\nPhone number: "+man.mobileno+"\nAddress: "+man.address);
    }
}