public class PaypalStrategy implements PaymentStrategy{
  private String email;
  private String password;

  PaypalStrategy(String email,String password){
    this.email = email;
    this.password = password;
  }

  public void pay(int amount){
    System.out.println(amount +" paid using paypal");
  }
}
