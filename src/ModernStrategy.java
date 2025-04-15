package src;

public class ModernStrategy {
  public static void main(String[] args) {
    String paymentMehtod = "CREDIT_CARD";
    try {
      PaymentType.valueOf(paymentMehtod).pay(3.0);
    } catch (IllegalArgumentException e) {
      System.out.printf("Não existe o método " + paymentMehtod);
    }
  }
}
