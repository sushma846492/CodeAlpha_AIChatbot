import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("AI ChatBot Started!");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            // Rule-based chatbot
            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }

            else if (userInput.contains("your name")) {
                System.out.println("Bot: My name is AI ChatBot.");
            }

            else if (userInput.contains("java")) {
                System.out.println("Bot: Java is a programming language.");
            }

            else if (userInput.contains("internship")) {
                System.out.println("Bot: Internship helps improve skills.");
            }

            else if (userInput.contains("project")) {
                System.out.println("Bot: Projects improve coding knowledge.");
            }

            else if (userInput.contains("how are you")) {
                System.out.println("Bot: I am fine. Thank you!");
            }

            else if (userInput.contains("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}