/**
 * ken has optional jump and kick behaviours but he is Fighter.
 */
class Ken extends Fighter
{
    public Ken(KickBehavior kickBehavior,
               JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }
    public void display()
    {
        System.out.println("Ken");
    }
}
