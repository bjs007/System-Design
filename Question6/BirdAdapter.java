class BirdAdapter implements ToyDuck{
  Bird bird;
  BirdAdapter(Bird bird){
    this.bird = bird;
  }

  public void squeek(){
    bird.makeSound();
  }
}
