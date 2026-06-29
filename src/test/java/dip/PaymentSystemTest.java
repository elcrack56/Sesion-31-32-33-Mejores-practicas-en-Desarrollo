package dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentSystemTest {
    @Test
    void testCreditCardPayment() {
        PaymentMethod method = new CreditCardPayment();
        assertTrue(method.processPayment(100).contains("credit card"));
    }

    @Test
    void testPayPalPayment() {
        PaymentMethod method = new PayPalPayment();
        assertTrue(method.processPayment(100).contains("PayPal"));
    }

    @Test
    void testCryptoPayment() {
        PaymentMethod method = new CryptoPayment();
        assertTrue(method.processPayment(100).contains("Crypto"));
    }

    @Test
    void testPaymentProcessorWithAnyMethod() {
        PaymentProcessor processor = new PaymentProcessor(new PayPalPayment());
        assertDoesNotThrow(() -> processor.execute(50.0));
    }
}