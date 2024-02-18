import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

public class HelpCommand implements Command {
    @Override
    public String command() {
        return "/help";
    }

    @Override
    public String description() {
        return "Display the command window";
    }

    @Override
    public SendMessage handle(Update update) {
        return new SendMessage(update.message().chat().id(), "List of commands:\n/start - register the user\n/help - display the command window\n/track - start tracking a link\n/untrack - stop tracking a link\n/list - show the list of tracked links");
    }
}
