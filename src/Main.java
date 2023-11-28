interface PaymentStrategy
{
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPayment(String number){
        this.cardNumber = number;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount+" kadar kredi kartından ödendi!");
    }
};

class CashPayment implements PaymentStrategy{
    private String name;

    public CashPayment(String name){
        this.name = name;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount+" kadar nakit ödendi");
    }
};

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount){
        this.paymentStrategy.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        CashPayment cash = new CashPayment("Halil");
        CreditCardPayment creditcard = new CreditCardPayment("123456");

        shoppingCart.setPaymentStrategy(cash);
        shoppingCart.checkOut(10);


        shoppingCart.setPaymentStrategy(creditcard);
        shoppingCart.checkOut(50);

    }
}