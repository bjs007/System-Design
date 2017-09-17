public class Barbeque extends ToppingsDecorator{
  Pizza pizza;
  public Barbeque(Pizza pizza){
    this.pizza = pizza;
  }
  public String getDescription(){
    return pizza.getDescription() + ", Barbeque";
  }
  public int getCost(){
    return pizza.getCost() + 20;
  }

}
