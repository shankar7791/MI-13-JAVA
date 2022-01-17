// java Program to impliment Multilevel Inheritance using Bank Customer example. 

class Customer
{
    private String name;
    Customer(String s) 
    {   
        setName(s);
          
    } 
    public void setName(String s) 
    { 
      name = s; 
    } 
    public String getName() 
    { 
      return name; 
    } 
    public void display() 
    { 
      System.out.println("Name of Customer = " + name); 
    } 
}
class Deposit extends Customer
{
    private int accno;
    private double balance; 
    Deposit(String name,int accno,double balance) 
    { 
      super(name); 
      setAccountNo(accno); 
      setBalance(balance);
    } 
    private void setAccountNo(int accno2) {
      this.accno = accno2;
    }
    public int getAccountNo() {
        return accno;
    }
    private void setBalance(double balance) {
      this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    
    public void display() 
    { 
      super.display(); 
      System.out.println("Customer Account no  is  = " + accno); 
      System.out.println("Customer Account Balance  is  = " + balance); 
    } 
}
class Borrow extends Deposit
{
    private int loan_no; 
    private int loan_amt; 
    Borrow(String cname,int accno,double balance,int days,int hoursWorked) 
    {      
       super(cname,accno,balance); 
       this.loan_no  = days; 
       this.loan_amt = hoursWorked; 
    } 
    
    public void display() 
    { 
      super.display(); 
      System.out.println("Customer Lone Number = " + loan_no); 
      System.out.println("Lone Amount = " + loan_amt); 
     
    } 
}
public class MultilevelInheritance
{ 
    public static void main(String args[])
    {

        Borrow b = new Borrow("Rushikesh",999,5000.00,5871,40000);
        b.display();
    }
}