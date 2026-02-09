class BankAccount{
long accountNumber;
int currentBalance, interestRate;
String holderName;


void setAccountNumber(int n){
this.accountNumber=n;
}

void setCurrentBalance(int balance){
this.currentBalance=balance;
}

void setInterestRate(int interest){
this.interestRate=interest;
}

void setHolderName(String name){
this.holderName=name;
}

void getData(){
System.out.println("Account Number: "+this.accountNumber);
System.out.println("Balance: "+this.currentBalance);
System.out.println("Interest Rate: "+this.interestRate);
System.out.println("Name: "+this.holderName);
}
}

class Test{
public static void main(String[] args){
BankAccount obj = new BankAccount();

obj.getData();

obj.setAccountNumber(115875602);
obj.setCurrentBalance(100000);
obj.setInterestRate(10);
obj.setHolderName("Om");



obj.getData();

}
}