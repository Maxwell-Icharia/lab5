package lab5;
import java.util.Scanner;

public class TestEmployee {
    
    public static void main(String [] args)
    {
        int id, salary, raise;
        String fname, lname;
        Scanner sc = new Scanner(System.in);
        Employee employee1 = new Employee();
        
        System.out.println("Input your ID: ");
        id = sc.nextInt();
        employee1.setId(id);
        
        System.out.println("Input your First Name: ");
        fname = sc.nextLine();
        employee1.setFirstName(fname);
        
        System.out.println("Input your Last Name: ");
        lname = sc.nextLine();
        employee1.setLastName(lname);
        
        System.out.println("Input your Salary: ");
        salary = sc.nextInt();
        employee1.setSalary(salary);
        
        System.out.println("Input Salary Raise: ");
        raise = sc.nextInt();
        employee1.raiseSalary(raise);
        
        employee1.getId();
        employee1.getFirstName();
        employee1.getLastName();
        employee1.getSalary();
        employee1.getAnnualSalary();
        System.out.println(employee1.toString());
        
                
    }
    
}
