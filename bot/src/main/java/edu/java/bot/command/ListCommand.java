import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

public class ListCommand implements Command {
    @Override
    public String command() {
        return "/list";
    }

    @Override
    public String description() {
        return "Show the list of tracked links";
    }

    @Override
    public SendMessage handle(Update update) {
        return new SendMessage(update.message().chat().id(), "List of tracked links:\n1. https://github.com/sanyarnd/tinkoff-java-course-2023/\n2. https://stackoverflow.com/questions/1642028/what-is-the-operator-in-c\n3. https://stackoverflow.com/search?q=unsupported%20link");
    }
}
