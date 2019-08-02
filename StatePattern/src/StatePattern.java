/**
 * The State Pattern is the client to interact to the Context
 */
class StatePattern
{
    public static void main(String[] args)
    {
        // the context
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
} 
