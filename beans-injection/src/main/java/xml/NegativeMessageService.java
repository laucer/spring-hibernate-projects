package xml;

public class NegativeMessageService implements MessageService{
    @Override
    public String getMessage() {
        return "You lost!";
    }

    @Override
    public void init() {
        System.out.println("xml.NegativeMessageService init");
    }
}
