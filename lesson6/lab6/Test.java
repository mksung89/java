
public class Test
{
    
     static public void main(String args[])
    {
        /*
         Circle c1 = new Circle();
         System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
   
         Circle c2 = new Circle(2.0);
         System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        */
       /*
       Employee e1 = new Employee(8, "Peter", "Tan", 2500);
       System.out.println(e1); // toString();
       e1.setSalary(999);
       System.out.println(e1); // toString();
       System.out.println("id is: " + e1.getId());
       System.out.println("firstname is: " + e1.getFirstName());

       System.out.println("lastname is: " + e1.getLastName());
       System.out.println("salary is: " + e1.getSalary());

       System.out.println("name is: " + e1.getName());
       System.out.println("annual salary is: " + e1.getAnnualSalary()); 
       System.out.println(e1.raiseSalary(10)); 
       System.out.println(e1);
       */
       InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
       System.out.println(inv1);  // toString();

       inv1.setQty(999);
       inv1.setUnitPrice(0.99);
       System.out.println(inv1);  // toString();
       System.out.println("id is: " + inv1.getId());
       System.out.println("desc is: " + inv1.getDesc());
       System.out.println("qty is: " + inv1.getQty());
       System.out.println("unitPrice is: " + inv1.getUnitPrice());

       System.out.println("The total is: " + inv1.getTotal());
      
    }
}
