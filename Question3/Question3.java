public class Question3{
  public static void main(String args[]){
    ShoppingCart cart = new ShoppingCart();
    Item t1 = new Item("1",100);
    Item t2 = new Item("2",200);
    cart.addItem(t1);
    cart.addItem(t2);
    cart.pay(new PaypalStrategy("bijays.nitdgp@gmail.com","password"));
  }
}
