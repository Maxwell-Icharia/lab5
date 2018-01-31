package lab5;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary = 0;
    private final int annualSalary = (salary * 12);

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public int getSalary() {
        return salary;
    }

    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getAnnualSalary() {
        return annualSalary;
    }
    
    public int raiseSalary(int percent) {
        this.salary = this.salary * (percent/100);
        return this.salary;
    }
    
    @Override
    public String toString(){
        
        return ("ID is: " + getId() + "\nFirst Name: " + getFirstName() + "\n"
                + "Last Name: " + getLastName() + "\n Salary: " + getSalary());
        
    }
    
    public Employee(){
        
    }
    
    
}
