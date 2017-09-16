import java.util.*;
public class ShoppingCart{
  List<Item> list;
  int price = 0;

  ShoppingCart(){
    list = new ArrayList<Item>();
  }

  void addItem(Item it){
    list.add(it);
  }

  void removeItem(Item it){
    if(list !=null || list.size() == 0){
      int index = list.indexOf(it);
      list.remove(index);
    }
  }

  boolean hasItem(){
    return !list.isEmpty();
  }

  int totalPrice(){
    if(hasItem()){
      for(Item it: list){
          price += it.getPrice();
        }
    }
    return price;
  }

  void pay(PaymentStrategy paymentStrategy){
    int totalPrice = totalPrice();
    paymentStrategy.pay(totalPrice);
  }

}
