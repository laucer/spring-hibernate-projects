package xml;

public class PositiveMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "You won!";
    }

    @Override
    public void init() {
        System.out.println("xml.PositiveMessageService init");
    }
}
