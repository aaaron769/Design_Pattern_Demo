class AlertStateContext
{
    private MobileAlertState currentState;

    public AlertStateContext()
    {
        currentState = new Vibration();
    }

    /**
     * @param state changing the current state(just like a gear)
     *              at run time if the setState in context is called the
     *              the state changes.
     */
    public void setState(MobileAlertState state)
    {
        currentState = state;
    }

    /**
     * this alert will call the appropriate MobileAlertState in the runtime
     */
    public void alert()
    {
        currentState.alert(this);
    }
}
