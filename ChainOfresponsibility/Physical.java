public class Physical implements BaseHandler{
    private BaseHandler nextInChain;
    @Override
    public void setNextChain(BaseHandler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            request.addData("=Bits");
            System.out.println(request.getData());
        }
        else {
            nextInChain.process(request);
        }
    }
}
