/**
 * This Observer interface will have an abstract method
 * update where all Observer concrete class will implement
 * and they update their data when it has called by the Subject(CNN Company)
 */
interface Observer
{
    /**
     * the update method to be implemented by all observer concrete classes
     * @param runs
     * @param wickets
     * @param overs
     */
    public void update(int runs, int wickets,float overs);
}
