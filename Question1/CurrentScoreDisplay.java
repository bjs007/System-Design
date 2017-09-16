/*
CurrentScoreDisplay is a concrete subclass of Observer.
*/

class CurrentScoreDisplay implements Observer {
private int runs;
private int wickets;
private int overs;


public void update(int runs,int wickets,int overs){
  this.runs = runs;
  this.wickets = wickets;
  this.overs = overs;
  display();
}

public void display(){
  System.out.println("Runs:" + runs +", wickets: " + wickets+", overs: "+overs);
}


}
