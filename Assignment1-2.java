/*Create a Bank account class with attributes acc_no, acc_holder_name and balance. Bank
account class has setter and getter methods for all the attributes. Implement methods to
deposit and withdraw money as well as a method to display the account details.*/
class Bank{
    long acc_no;
    float balance;
    String acc_holder_name;

    public void setAcc(long acc_no, float balance, String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    public String getAcc_Holder_Name() {
        return acc_holder_name;
    }
    public long getAcc_No() {
        return acc_no;
    }
    public float balance() {
        return balance;
    }
    public void display(){
            System.out.println("Account No: " + acc_no);
            System.out.println("Account Holder Name: " + acc_holder_name);
            System.out.println("Balance: $" + balance);
    }
    public void deposit(float amount){
        if (amount > 0){
            balance = balance + amount;
            System.out.println("Given amount successfully deposited.");
        }else{
            System.out.println("Invalid amount.");
        }
    }
    public void withdraw(float amount){
        if (amount > 0 || balance >= amount){
            balance = balance - amount;
            System.out.println("Given amount successfully withdrawn.");
        }else if(balance < amount) {
            System.out.println("Insufficient funds.");
        }else if(balance == 0){
            System.out.println("Zero balance.");
        }else{
            System.out.println("Invalid Amount.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Bank account = new Bank();
        account.setAcc(413579001, 1500000, "Mohandev");
        account.display();
        account.deposit(500);
        account.display();
        account.withdraw(300);
        account.display();
    }
}
