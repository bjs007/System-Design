public class Question5{
  public static void main(String args[]){
    Pizza paneer = new PeppyPaneer();
    System.out.println("Price of " + paneer.getDescription() +" is "+ paneer.getCost());
    //Decorate with Farmhouse
    Pizza pizza2 = new FreshTomato(paneer);

    System.out.println("Price of " + pizza2.getDescription() +" is "+ pizza2.getCost());
    pizza2 = new Barbeque(pizza2);

    System.out.println("Price of " + pizza2.getDescription() +" is "+ pizza2.getCost());


  }
}
