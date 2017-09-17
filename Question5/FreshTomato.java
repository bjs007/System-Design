public class FreshTomato extends ToppingsDecorator{
  Pizza pizza;
  public FreshTomato(Pizza pizza){
    this.pizza = pizza;
  }

  public String getDescription(){
    return pizza.getDescription() + ", FreshTomato";
  }

  public int getCost(){
    return pizza.getCost() + 10;
  }
}
