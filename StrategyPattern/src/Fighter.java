/**
 * This is the concept of strategy pattern
 * simply we can have access of inheritance if we have behaviours common to all
 * concret classes,but if we have different behaviour just apply interface of the
 * none common behaviour and override in the concrete class and create parent object with para
 * meters of the instance of type interface .
 */
// Abstract as you must have a specific fighter
abstract class Fighter
{
    // optional behaviour of concrete class
    KickBehavior kickBehavior;
    JumpBehavior jumpBehavior;

    /**
     * @param kickBehavior optional kick
     * @param jumpBehavior optional jump
     */
    public Fighter(KickBehavior kickBehavior,
                   JumpBehavior jumpBehavior)
    {
        this.jumpBehavior = jumpBehavior;
        this.kickBehavior = kickBehavior;
    }

    /**
     * comment punch
     */
    public void punch()
    {
        System.out.println("Default Punch");
    }

    /**
     * common kick
     */
    public void kick()
    {
        // delegate to kick behavior 
        kickBehavior.kick();
    }

    /**
     * optional jump
     */
    public void jump()
    {

        // delegate to jump behavior 
        jumpBehavior.jump();
    }

    /**
     * common roll
     */
    public void roll()
    {
        System.out.println("Default Roll");
    }
    public void setKickBehavior(KickBehavior kickBehavior)
    {
        this.kickBehavior = kickBehavior;
    }
    public void setJumpBehavior(JumpBehavior jumpBehavior)
    {
        this.jumpBehavior = jumpBehavior;
    }
    public abstract void display();
}
