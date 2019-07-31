package MoreOnProxy;

public interface ICommandExecutor {
     // to be override by proxy and realSubject
    public void runCommand(String cmd) ;
}
