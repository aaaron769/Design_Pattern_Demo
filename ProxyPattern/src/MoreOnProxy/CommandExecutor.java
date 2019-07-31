package MoreOnProxy;

public class CommandExecutor implements ICommandExecutor {
    // the client will defer to this object if the proxy allowed
    @Override
    public void runCommand(String cmd)  {

        System.out.println("'" + cmd + "' command executed.");
    }
}
