// abstract class Payment started

abstract class Payment{
	int paymentId;
	double amount;
	String payerName;
	String status; // (possible values: "PENDING", "SUCCESS", "FAILED")
	Payment() {
	
		this.paymentId = 0;
		this.amount = 0;
		this.payerName = "NA";
		this.status = "Pending";
	}
	
	Payment(int paymentId, double amount, String payerName) {
		
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status = "Pending";
	}

	int getPaymentId() {
		return paymentId;
	}

	void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	String getPayerName() {
		return payerName;
	}

	void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	String getStatus() {
		return status;
	}

	void setStatus(String status) {
		this.status = status;
	}

	
	void printSummary() {
		System.out.println("ID: " + this.paymentId);
		System.out.println("Amount: " + this.amount);
		System.out.println("Payer Name: " + this.payerName);
		System.out.println("Status: " + this.status);
		
	}
	
	final void process() {
		if(validate()) {
			deductAmount();
			sendNotification();
			status = "Success";
		}
		else {
			status = "Failed";
			System.out.println("Payment Failed");
		}
	}
	
	abstract boolean validate();
	abstract void deductAmount(); 
	abstract void sendNotification();
	
}

// abstract class Payment end

// class CardPayment start

class CardPayment extends Payment{
	String cardNumber;
	String cvv;
	
	CardPayment() {
		super();
		this.cardNumber = "NA";
		this.cvv = "NA";
	}
	
	CardPayment(int paymentId, double amount, String payerName, String cardNumber, String cvv) {
		super(paymentId, amount, payerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	String getCardNumber() {
		return cardNumber;
	}

	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	String getCvv() {
		return cvv;
	}

	void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	@Override
	boolean validate() {
		if(cardNumber.length() == 16 && cvv.length() == 3 && amount > 0) {
			return true;
		}
		return false;
	}
	
	@Override
	void deductAmount() {
		System.out.println("Amount " + amount + "deducted using card.");
	}
	
	@Override
	void sendNotification() {
		System.out.println("Notification: card payment successful.");
	}
	
} // class CardPayment end

class UPIPayment extends Payment{
	String upiId;
	
	UPIPayment() {
		super();
		this.upiId = "NA";
	}

	UPIPayment(int paymentId, double amount, String payerName, String upiId) {
		super(paymentId, amount, payerName );
		this.upiId = upiId;
	}

	String getUpiId() {
		return upiId;
	}

	void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	
	@Override
	boolean validate() {
		if(upiId.contains("@") && (amount >= 1 && amount <= 100000)) {
			return true;
		}
		return false;
	}
	
	@Override
	void deductAmount() {
		System.out.println("Amount: " + amount +"deducted using UPI payment");
		
	}
	
	@Override
	void sendNotification() {
		System.out.println("Notification: UPI Payment Successful");
		
	}
}


public class FbsAbstractClass01 {

	public static void main(String[] args) {
		Payment p1 = new CardPayment(101, 10000, "Amit k", "1234567890123456","123");
		Payment p2 = new UPIPayment(102, 2932, "Virat", "virat@ipl");
		Payment p3 = new CardPayment(103, 0, "Rahul k", "1234567890123456","456");
		Payment p4 = new UPIPayment(104, 2200, "Dhoni", "msdian");
		
		Payment[] arr = new Payment[4];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		
		for(Payment p : arr) {
			if(p!=null){
			p.process();
			p.printSummary();
			System.out.println("\n");
			}
		}

	}

}
