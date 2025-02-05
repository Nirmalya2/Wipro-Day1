import java.util.Optional;

public interface UserMessage {

    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    Optional<String> getUser(String name);

    public static void main(String[] args) {
        UserMessage userMessage = new UserMessageImpl();
        
        // Test cases
        System.out.println(userMessage.getUser("Alice").orElse(userMessage.getWelcomeMessage())); // Output: Welcome, Alice!
        System.out.println(userMessage.getUser(null).orElse(userMessage.getWelcomeMessage()));     // Output: Welcome, Guest!
    }
}

class UserMessageImpl implements UserMessage {

    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name).map(n -> "Welcome, " + n + "!");
    }
}
