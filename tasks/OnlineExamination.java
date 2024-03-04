package tasks;

import java.util.Scanner;

public class OnlineExamination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Questions and answers
        String[] questions = {
            "What is the capital of India?",
            "Who invented the telephone?",
            "What is the chemical symbol for gold?",
        };

        String[] options = {
            "A. Mumbai\tB. Delhi\tC. Kolkata\tD. Chennai",
            "A. Isaac Newton\tB. Thomas Edison\tC. Alexander Graham Bell\tD. Albert Einstein",
            "A. Au\tB. Ag\tC. Go\tD. Gd",
        };
        
        String[] answers = {"B", "C", "A"};
        
        // Variables to store user's answers and score
        String[] userAnswers = new String[questions.length];
        int score = 0;
        
        // Display and validate user's answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": ");
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your answer (A/B/C/D): ");
            userAnswers[i] = scanner.nextLine().toUpperCase();
            
            if (userAnswers[i].equals(answers[i])) {
                score++;
            }
        }
        
        // Display final score
        System.out.println("Your score: " + score + "/" + questions.length);
        
        scanner.close();
    }
}
