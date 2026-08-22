package Interface;

public interface Payment {

    void pay(double amount);
    default void paymentSuccessNotification(){
        System.out.println("Payment is successfully done");
    }

    static void utilMethod() {
        System.out.println("Utility method");
//        these method can not be called through objects.
//        Payment.utilMethod(); ----> Correct way to call the method.

//        Sealed interface :- You can restrict which classes can implement an interface by using the sealed modifier.
//        A sealed interface can only be implemented by a specific set of classes, which are defined in the interface declaration.
//        This can be useful for enforcing certain design patterns or for limiting the number of implementations of an interface.
//        public sealed interface Payment permits CreditCardPayment, UpiPayment {
//        Only CreditCardPayment and UpiPayment classes can implement this interface.
//    }
    }
}
