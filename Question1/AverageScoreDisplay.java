/*
CurrentScoreDisplay is a concrete subclass of Observer.
*/

class AverageScoreDisplay implements Observer {
private float runRate;
private float predictedScore;

public void update(int runs,int wickets,int overs){
runRate = (float)(runs/overs);
predictedScore = runRate * 20;
display();
}

public void display(){
        System.out.println("\nAverage Score Display: \n"
                           + "Run Rate: " + runRate +
                           "\nPredictedScore: " +
                           predictedScore);
    }

}
