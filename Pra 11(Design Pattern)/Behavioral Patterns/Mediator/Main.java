public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello everyone!");
        System.out.println();
        user2.sendMessage("Hi Alice, how are you?");
    }
}