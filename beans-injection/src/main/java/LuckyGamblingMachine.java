public class LuckyGamblingMachine implements GamblingMachine {

    private MessageService messageService;

    public LuckyGamblingMachine(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public String draw() {
        return "You won 10$!";
    }

    @Override
    public String getMessage() {
        return messageService.getMessage();
    }
}
