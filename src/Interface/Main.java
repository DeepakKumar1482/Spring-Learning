package Interface;

public class Main {
    public static void main(String []args){
        Payment pay=new CreditCardPayment();
        pay.pay(1000);
        pay.paymentSuccessNotification();

        Payment pay1=new UpiPayment();
        pay1.pay(2000);
        pay1.paymentSuccessNotification();
    }
}
