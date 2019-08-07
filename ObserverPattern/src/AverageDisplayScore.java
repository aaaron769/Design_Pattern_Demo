/**
 * the second observer waiting Subject (CNN company) to call its update method
 */
class AverageScoreDisplay implements Observer
{
    private float runRate;
    private int predictedScore;

    /**
     * this update will be called by the Subject
     * when new info is available
     * @param runs
     * @param wickets
     * @param overs
     */
    public void update(int runs, int wickets,
                       float overs)
    {
        this.runRate =(float)runs/overs;
        this.predictedScore = (int)(this.runRate * 50);
        display();
    }

    /**
     * the display method to show new updated data.
     */
    public void display()
    {
        System.out.println("\nAverage Score Display: \n"
                + "Run Rate: " + runRate +
                "\nPredictedScore: " +
                predictedScore);
    }
}
