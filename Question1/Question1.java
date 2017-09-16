/*
Suppose we are building a cricket app that notifies viewers about the information such as current score, run rate etc. Suppose we have made two display elements CurrentScoreDisplay and AverageScoreDisplay. CricketData has all the data (runs, bowls etc.) and whenever data changes the display elements are notified with new data and they display the latest data accordingly

*/


public class Question1{
  public static void main(String args[]){
    AverageScoreDisplay av = new AverageScoreDisplay();
    CurrentScoreDisplay cu = new CurrentScoreDisplay();
    CricketData cd = new CricketData();
    cd.registerObserver(av);
    cd.registerObserver(cu);
    cd.dataChanged();
    cd.removeObserver(cu);
    cd.dataChanged();
  }
}
