/**
 * this method will implement the MobileAlertState
 * and override the alert method
 */
class Vibration implements MobileAlertState
{
    @Override
    public void alert(AlertStateContext ctx)
    {
        System.out.println("vibration...");
    }

}
