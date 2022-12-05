public class Presntition implements BaseHandler{
    private BaseHandler nextInChain;
    @Override
    public void setNextChain(BaseHandler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Do what the presentation layer does (encryption, translation)
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}