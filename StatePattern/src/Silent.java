/**
 * this Silent class will implement the alert from MobileAlert State
 */
public class Silent implements MobileAlertState {
    /**
     * @param ctx we dont use this in this case
     *            but it has AlertStateContext where MobileAlertState stored in it.
     *            and called this class at run time to perform silent operation.
     *
     */
    @Override
    public void alert(AlertStateContext ctx)
    {
        System.out.println("silent...");
    }
}
