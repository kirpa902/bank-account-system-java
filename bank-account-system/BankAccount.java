class BankAccount{
private String accountNumber;
private String accountHolder;
private double balance;

BankAccount(String accountNumber,String accountHolder ,double balance){
this.accountNumber=accountNumber;
this.accountHolder=accountHolder;
if(balance >= 0){
    this.balance = balance;
} else {
    this.balance = 0;
}}
public void deposit(double amount){
if(amount>0){balance+=amount;
System.out.println("Deposit successful : "+amount);}
else{
System.out.println("Invalid Deposit");}
}
public void withdraw(double amount){
if(amount<=0 || amount >balance){
System.out.println("Invalid withdrawal : Insufficient balance or wrong amount");}
else{
balance-=amount;
System.out.println("withdraw successful : "+amount);}
}
public void transfer(BankAccount target, double amount){
    if(amount > 0 && amount <= balance){
        this.balance -= amount;
        target.balance += amount;
        System.out.println("Transfer successful: " + amount);
    } else {
        System.out.println("Transfer failed");
    }
}
public double getBalance(){
return balance;}

public void printStatement(){
System.out.println("AccountNumber is : "+accountNumber);
System.out.println("Accountholder is : "+accountHolder);
System.out.println("Balance is : "+balance);
}
public static void main(String args[]){
BankAccount b1=new BankAccount("343444","Kirpa",20000);
BankAccount b2 = new BankAccount("76876", "Amma", 34000);
b1.printStatement();
b1.deposit(1000);
b1.printStatement();
b1.withdraw(300);
b1.transfer(b2, 2000);

b1.printStatement();
}

}
