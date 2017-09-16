/*
This is Concrete class which implements Subject interface.

*/
import java.util.*;
class CricketData implements Subject{
  int runs;
  int overs;
  int wickets;
  private List<Observer> observers;
  CricketData(){
    observers = new ArrayList<Observer>();
  }
  public void registerObserver(Observer o){
    observers.add(o);
  }

  public  boolean removeObserver(Observer o){
    if(observers==null || observers.size() == 0){
      return false;
    }

    int index = observers.indexOf(o);
    if(index > 0){
      observers.remove(index);
      return true;
    }
    return false;
  }

  private int getRuns(){
    int min = 0;
    int max = 300;
    int range = max - min;
    runs = (int)(Math.random() * range) + min;
    return runs;
  }

  private int getWickets(){
    int min = 0;
    int max = 10;
    int range = max - min;
    wickets = (int)(Math.random() * range) + min;
    return wickets;
  }

  private int getOvers(){
    int min = 0;
    int max = 20;
    int range = max - min;
    overs =  (int)(Math.random() * range) + min;
    return overs;
  }

  public void dataChanged(){
    getOvers();
    getWickets();
    getRuns();
    notifyObservers();
  }

public void notifyObservers(){
    for(Observer o: observers){
      o.update(runs,wickets,overs);
    }
  }
}
