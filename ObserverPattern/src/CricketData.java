import java.util.ArrayList;
import java.util.Iterator;

/**
 * This is The subject(the concrete class of CNN)
 * will implement all behaviour of Subject
 * register will register Observer to ArrayList and
 * and unregister as well
 * the notifier method will iterate all observers in ArrayList and
 * calls the update method of the observers and provide the new update data.
 */
class CricketData implements Subject
{
    int runs;
    int wickets;
    float overs;
    ArrayList<Observer> observerList;

    /**
     * crates object and instanciate the ArrayList
     */
    public CricketData() {
        observerList = new ArrayList<Observer>();
    }

    /**
     * @param o register the observer
     */
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    /**
     * @param o unregister the observer remove from arrayList
     */
    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    /**
     * notifies all observers in ArrayList by calling the
     * update method of the observers
     */
    @Override
    public void notifyObservers()
    {
        for (Iterator<Observer> it =
             observerList.iterator(); it.hasNext();)
        {
            Observer o = it.next();
            o.update(runs,wickets,overs);// calling the update method in observer
        }
    }

    // get latest runs from stadium 
    private int getLatestRuns()
    {
        // return 90 for simplicity 
        return 90;
    }

    // get latest wickets from stadium 
    private int getLatestWickets()
    {
        // return 2 for simplicity 
        return 2;
    }

    // get latest overs from stadium 
    private float getLatestOvers()
    {
        // return 90 for simplicity 
        return (float)10.2;
    }

    // This method is used update displays 
    // when data changes 
    public void dataChanged()
    {
        //get latest data 
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
} 
