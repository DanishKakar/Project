public class Main {
    public static void main(String[] args) {
        BaseHandler obj1 = new Application();
        BaseHandler obj2 = new Presntition();
        BaseHandler obj3 = new Session();
        BaseHandler obj4 = new Transport();
        BaseHandler obj5 = new Network();
        BaseHandler obj6 = new DataLink();
        BaseHandler obj7 = new Physical();

        obj1.setNextChain(obj2);
        obj2.setNextChain(obj3);
        obj3.setNextChain(obj4);
        obj4.setNextChain(obj5);
        obj5.setNextChain(obj6);
        obj6.setNextChain(obj7);

        Data request = new Data("data");
        obj1.process(request);
    }
}
