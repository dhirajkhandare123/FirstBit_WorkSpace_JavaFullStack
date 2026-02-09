class BankAccount{
long accountNumber;
int currentBalance, interestRate;
String holderName;
}

class Test{
public static void main(String[] args){
BankAccount obj = new BankAccount();

System.out.println("Name: "+obj.holderName);
System.out.println("Account Number: "+obj.accountNumber);
System.out.println("Current Balance: "+obj.currentBalance);
System.out.println("interestRate: "+obj.interestRate);

obj.holderName="Om";
obj.accountNumber=115875602;
obj.currentBalance=100000;
obj.interestRate=10;

System.out.println("Name: "+obj.holderName);
System.out.println("Account Number: "+obj.accountNumber);
System.out.println("Current Balance: "+obj.currentBalance);
System.out.println("interestRate: "+obj.interestRate);

}
}