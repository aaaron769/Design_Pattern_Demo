/**
 * This fighter has its behaviour of jump and Kick
 * which is different with other
 */
class ChunLi extends Fighter
{
    public ChunLi(KickBehavior kickBehavior, JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }
    public void display()
    {
        System.out.println("ChunLi");
    }
}
