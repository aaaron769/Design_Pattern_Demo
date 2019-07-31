/**
 * this Class has a chain will help us to chain the
 * responsibility
 */
public class NegativeProcessor implements Chain {
    // the next chain responsibility
    private Chain netInChain;

    /**
     * @param nextInChain the chain of responsibility
     */
    @Override
    public void setNext(Chain nextInChain) {
        this.netInChain = nextInChain;// confirming ready the next chain
    }

    @Override
    public void process(Number request) {
       if(request.getNumber()<0){
         System.out.println("Negative"+request.getNumber());
       }else {
           netInChain.process(request);// the chain continue forward the responsibility.
       }
    }
}
