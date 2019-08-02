


// Driver class 
class RemoteControlTest
{
    public static void main(String[] args)
    {
        SimpleRemoteControl remote =
                new SimpleRemoteControl();
        Light light = new Light();// the light object
        Stereo stereo = new Stereo();// the stereo object

        // we can change command dynamically
        //............................start................
                        // light command
        remote.setCommand(new
                LightOnCommand(light));
                       // this will execute  operation
        remote.buttonWasPressed();
                 //stereoOnWithCD Command
        remote.setCommand(new
                StereoOnWithCDCommand(stereo));
                // this will execute  operation
        remote.buttonWasPressed();
                // stereoOffCommand
        remote.setCommand(new
                StereoOffCommand(stereo));
        //..........................end.....................
        // this will execute  operation
        remote.buttonWasPressed();
    }
}
