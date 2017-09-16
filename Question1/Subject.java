/*
This is Subject interface
*/

interface Subject{
  public void registerObserver(Observer o);
  public boolean removeObserver(Observer o);
  public void notifyObservers();
}
