//Driver class
class StreetFighter
{
    public static void main(String args[])
    {
        // first we will create a behaviour having type of
        // uncommon behaviour interface
        // let us make some behaviors first 
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        // Make a fighter with desired behaviors 
        Fighter ken = new Ken(tornadoKick,shortJump);
        ken.display();

        // Test behaviors 
        ken.punch();
        ken.kick();
        ken.jump();
        // Change behavior dynamically (algorithms are
        // interchangeable)
        ken.setJumpBehavior(LongJump);
        ken.jump();
    }
}
