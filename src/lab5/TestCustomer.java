package lab5;

import java.util.Scanner;

public class TestCustomer {

    public static void main(String [] args){
        
        int id, discount;
        String name;
        
        Scanner sc = new Scanner(System.in);
        Customer mycustomer = new Customer();
        
        System.out.println("Input ID: ");
        id = sc.nextInt();
        mycustomer.setID(id);
        
        System.out.println("Input name: ");
        name = sc.nextLine();
        mycustomer.setName(name);
        
        System.out.println("Input Discount: ");
        discount = sc.nextInt();
        mycustomer.setDiscount(discount);
        
        System.out.println(mycustomer.toString());
        
    }
    
}
