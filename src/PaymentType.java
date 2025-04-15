package src;

import java.util.function.Consumer;

public enum PaymentType {
  CREDIT_CARD(PaymentMethods::creditCard),
  BOLETO(PaymentMethods::boleto),
  PIX(PaymentMethods::pix);

  private final Consumer<Double> paymentStrategy;

  PaymentType(Consumer<Double> paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void pay(Double amount) {
    paymentStrategy.accept(amount);
  }
}
