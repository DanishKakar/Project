public interface BaseHandler {
    public void setNextChain(BaseHandler nextChain);
    public void process(Data request);
}