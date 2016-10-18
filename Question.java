//generate question
//implement two answer types
//multiple choice and true/false
import java.util.Scanner;
public class Question {
    Scanner kb = new Scanner(System.in);
    private int qType = 1;
    public String generateQ() {     //this method generates the question via user input
        String answers = "";
        System.out.print("Enter question for iVote service: ");
        String question = kb.nextLine();
        System.out.print("\nWhat question type? Enter 1 for multiple choice or 2 for true/false: ");
        qType = kb.nextInt();
        kb.nextLine();      //gets rid of the \n in buffer
        if (qType == 1) {   //1 lets the user pick the answers for multilpe choice
           answers = multipleChoice();
        }
        else if (qType == 2) {  //2 sets the answers to true/false
           answers = trueFalse();
        }
        else {      //any other choice terminates the program
           System.out.println("Invalid choice. Terminating program.");
           System.exit(0);
        }
        String fullQuestion = question + "\n" + answers + "\n"; //combines the question and answer list into a single string
        return fullQuestion;
    }
    
    public String multipleChoice() {    //generates multiple choice answers via user input
        System.out.println("With multiple choice, the students can choose from A, B, C, or D");
        System.out.println("Enter the answer for option A: ");
        String A = kb.nextLine();
        System.out.println("Enter the answer for option B: ");
        String B = kb.nextLine();
        System.out.println("Enter the answer for option C: ");
        String C = kb.nextLine();
        System.out.println("Enter the answer for option D: ");
        String D = kb.nextLine();
        String list = "A. " + A + "\nB. " + B + "\nC. " + C + "\nD. " + D + "\n";   //combines all answers into a single string
        return list; //returns a list of all answers
    }
    
    public String trueFalse() {         //similar to the above method, this returns a list of answers, limited to true/false
        System.out.println("When students vote, the answers will be 'A. true' and 'B. false'");
        String list = "A. true\nB. false\n";
        return list;
    }
    
    public int getQType() { //method to return the question type as an int
        return qType;
    }

}
