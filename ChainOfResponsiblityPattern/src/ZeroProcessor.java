public class ZeroProcessor implements Chain {
    private Chain netInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.netInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber()==0){
            System.out.println("ZeroProcesser"+request.getNumber());
        }else {
            netInChain.process(request);
        }
    }
}
