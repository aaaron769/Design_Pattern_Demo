/**
 * ............to insure the Strategy pattern
 * Ryu a fighter has kick behaviour and jump behaviour
 * which is different compare others
 * he need to extend the Fighter by the different behaviours he has
 *
 */
// Characters
class Ryu extends Fighter
{
    /**
     * Ryu has different behaviour of kick and jump
     *
     * @param kickBehavior the kick
     * @param jumpBehavior the jump
     */
    public Ryu(KickBehavior kickBehavior,
               JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }
    public void display()
    {
        System.out.println("Ryu");
    }
}
