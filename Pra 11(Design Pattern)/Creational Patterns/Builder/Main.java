public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder("Large", "Beef")
                .addLettuce(true)
                .addTomato(true)
                .addSauce("Mayonnaise")
                .build();

        System.out.println(burger);
    }
}