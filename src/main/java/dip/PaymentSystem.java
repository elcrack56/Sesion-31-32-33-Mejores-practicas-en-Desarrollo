package dip;

interface PaymentMethod {
    String processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public String processPayment(double amount) {
        return "Processing credit card payment of $" + amount;
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public String processPayment(double amount) {
        return "Processing PayPal payment of $" + amount;
    }
}

class CryptoPayment implements PaymentMethod {
    @Override
    public String processPayment(double amount) {
        return "Processing Crypto payment of $" + amount;
    }
}

class PaymentProcessor {
    private final PaymentMethod paymentMethod;

    // Inyección de dependencias por constructor
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void execute(double amount) {
        System.out.println(paymentMethod.processPayment(amount));
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Pagos (Aplicando DIP) ---\n");

        // El control de qué método usar se decide aquí, fuera del procesador
        PaymentProcessor creditCard = new PaymentProcessor(new CreditCardPayment());
        PaymentProcessor paypal = new PaymentProcessor(new PayPalPayment());
        PaymentProcessor crypto = new PaymentProcessor(new CryptoPayment());

        creditCard.execute(150.0);
        paypal.execute(45.5);
        crypto.execute(0.005);
    }
}