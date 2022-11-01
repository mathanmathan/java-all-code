abstract class SmartPhone{

    public SmartPhone()
    {
        System.out.println("SmartPhone Under development");
    }

    abstract int call(int second);
    abstract void sendMessage();
    abstract void receivedCall();

     void browse()
    {
        System.out.println("SmartPhone Browsing");
    }


}
