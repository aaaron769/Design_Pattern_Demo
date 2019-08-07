/**
 * this is the observer class at which waiting
 * the update data from Subject
 */
class CurrentScoreDisplay implements Observer
{
    private int runs, wickets;
    private float overs;

    /**
     * This method will be called by subject inorder to
     * update it's data
     * @param runs
     * @param wickets
     * @param overs
     */
    public void update(int runs, int wickets,
                       float overs)
    {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();// to show up its update value calling display method
    }

    public void display()
    {
        System.out.println("\nCurrent Score Display:\n"
                + "Runs: " + runs +
                "\nWickets:" + wickets +
                "\nOvers: " + overs );
    }
}
