/**
 * This interface is the The Subject(ex:- the CNN company)
 * want to register Observers(Customers) and unRegister Observers(Customers)
 * and also notify the observers
 *
 */
// Implemented by Cricket data to communicate
// with observers 
interface Subject
{
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
}
