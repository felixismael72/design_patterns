package behavioral.strategy;

public class CreditCard {
  private int amount;
  @SuppressWarnings("unused")
  private String number;
  @SuppressWarnings("unused")
  private String date;
  @SuppressWarnings("unused")
  private String cvv;

  CreditCard(String number, String date, String cvv) {
    this.amount = 100_000;
    this.number = number;
    this.date = date;
    this.cvv = cvv;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }
}
