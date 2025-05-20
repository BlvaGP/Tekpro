import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
    void addUser(User user);
    void sendMessage(String message, User sender);
}