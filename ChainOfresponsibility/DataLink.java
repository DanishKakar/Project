public class DataLink implements BaseHandler{
    private BaseHandler nextInChain;
    @Override
    public void setNextChain(BaseHandler nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
           
            request.addData("+DataLinkHeader");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
