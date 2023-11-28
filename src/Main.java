interface PaymentStrategy
{
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println(amount+" kadar kredi kartından ödendi!");
    }
};

class CashPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println(amount+" kadar nakit ödendi");
    }
};

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount){
        this.paymentStrategy.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {


    }
}