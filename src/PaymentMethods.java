package src;

public class PaymentMethods {
  public static void creditCard(double amount) {
    System.out.println("Validing credit card...");
    System.out.println("Paid R$ " + amount + " with credit card.");
  }

  public static void boleto(double amount) {
    System.out.println("Generating barcode...");
    System.out.println("Paid R$ " + amount + " with credit boleto.");
  }

  public static void pix(double amount) {
    System.out.println("Generating QR Code...");
    System.out.println("Paid R$ " + amount + " with Pix.");
  }
}
