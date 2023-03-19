public class Details
{
    public static void main(String[] args)
    {
        System.out.println("Name\t\t Year of joining \t\t Address \t\t\t Salary");
        EmpDetails e1 = new EmpDetails();
        e1.emp_det("Robert",1994,"64C - WallsStreet",32000);
        EmpDetails e2 = new EmpDetails();
        e2.emp_det("Sam   ",2000,"68D - WallsStreet",18500);
        EmpDetails e3 = new EmpDetails();
        e3.emp_det("John",1999,"26B - WallsStreet",25000);
    }
}
