public class CreditCard implements PaymentStrategy{
  private String name;
  private String cardNum;
  private String ccv;
  private String email;
  private String dateOfExpiry;

  CreditCard(String name,String cardNum,String ccv,String email,String dateOfExpiry){
    this.name = name;
    this.cardNum = cardNum;
    this.ccv = ccv;
    this.email = email;
    this.dateOfExpiry = dateOfExpiry;
  }

  public void pay(int amount){
    System.out.println(amount +" paid with CreditCard/debitCard");
  }

}
