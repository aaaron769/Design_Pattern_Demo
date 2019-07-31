package FactoryPattern_Demo;

/**
 * This interface will be implemented by many types of plans
 *  a client request using string to create the appropriate type of plan
 *  the planFactory will create a type of plan after identified the string from user.
 */
public abstract class Plan{
    protected double rate;
    abstract void getRate();
    // this needs to be override by all plan
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
