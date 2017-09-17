class Question6{
  public static void main(String args[]){
    Sparrow sparrow = new Sparrow();
    PlasticToyDuck toyDuck = new PlasticToyDuck();
    ToyDuck birdAdapter = new BirdAdapter(sparrow);

    System.out.println("Sparrow...");
    sparrow.fly();
    sparrow.makeSound();

    System.out.println("ToyDuck...");
    toyDuck.squeek();

    // bird behaving like a toy duck
    System.out.println("BirdAdapter...");
    birdAdapter.squeek();
  }
}
