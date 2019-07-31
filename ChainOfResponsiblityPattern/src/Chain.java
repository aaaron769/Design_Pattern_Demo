/**
 * this interface will be implemented by all
 * subclasses the default behaviour setNext will be insure the chain behaviour
 * at which the request to be transferred to the next chain
 */
public interface Chain {
    // the abstract method will allow us to set the desired chain
    public abstract void setNext(Chain nextInChain);
    // confirms if the request is transferable or to be done by the current chain.
    public abstract void process(Number request);
}
