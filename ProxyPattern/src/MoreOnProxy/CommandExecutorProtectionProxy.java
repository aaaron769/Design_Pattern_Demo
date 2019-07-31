package MoreOnProxy;

public class CommandExecutorProtectionProxy implements ICommandExecutor
{
    private boolean isAdmin;
    // this realSubject will accessed if the user request satisfies the
    // proxy requirements
    private ICommandExecutor executor;

    public CommandExecutorProtectionProxy(String user, String pwd){
        // must be an admin
        if("username".equals(user) && "password".equals(pwd))
            isAdmin = true;
        executor = new CommandExecutor();
    }
    // an admin must be connected to realSubject
    @Override
    public void runCommand(String cmd) {
        if (isAdmin) {
            if (isAdmin) {
                executor.runCommand(cmd);
            } else {
                if (cmd.trim().startsWith("del")) {
                    try {
                        throw new Exception("'delete' command is not allowed for non-admin users.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    // others have an access for any operation except delete
                    executor.runCommand(cmd);
                }
            }
        }
    }
}
