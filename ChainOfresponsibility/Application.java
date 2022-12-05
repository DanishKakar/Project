public class Application implements BaseHandler{
    private BaseHandler nextInChain;
    @Override
    public void setNextChain(BaseHandler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Do what application layer does (Process to process communication)
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
