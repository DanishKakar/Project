public class Session implements BaseHandler{
    private BaseHandler nextInChain;
    @Override
    public void setNextChain(BaseHandler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Do what the session layer does (controls the dialogues and set the connections)
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
