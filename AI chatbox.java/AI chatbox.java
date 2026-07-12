import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      Welcome to AI Chatbot");
        System.out.println("Type 'exit' to end the chat.");
        System.out.println("====================================");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Bot: Thank you! Have a great day.");
                break;
            }
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("name")) {
                System.out.println("Bot: I am CodeAlpha AI Chatbot.");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I'm doing great! Thanks for asking.");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is an object-oriented programming language.");
            }
            else if (input.contains("college")) {
                System.out.println("Bot: I can answer general questions about studies.");
            }
            else if (input.contains("time")) {
                System.out.println("Bot: Please check your system clock for the current time.");
            }
            else if (input.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand your question.");
            }
        }

        sc.close();
    }
}