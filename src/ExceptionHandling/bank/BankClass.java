package ExceptionHandling.bank;
/*Create multiple classes to imitate a bank structure with proper Exception Handling. For eg., if the user tries to withdraw more than the balance, throw "InsufficientBalanceException" (created customly)*/
public class BankClass {
    int balance=1000;
    void deposit(int amount){
        this.balance+=amount;
    }
    void withdraw(int amount) throws InsufficientBalanceException{
        if(balance<amount){
             throw new InsufficientBalanceException("No enough money to withdraw");
        }else{
            System.out.println("Your balance is "+balance);
        }
    }
    public static void main(String[] args) {
        try{
            BankClass b=new BankClass();
            b.deposit(2000);
            b.withdraw(3500);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
