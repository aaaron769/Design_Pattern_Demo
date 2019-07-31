public class PositiveProcessor implements Chain {
    private Chain netInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.netInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber()>0){
            System.out.println("Postive"+request.getNumber());
        }else {
            netInChain.process(request);
        }
    }
}
