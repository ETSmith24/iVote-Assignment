//1) create a question type and configure the answers;
//2) configure the question for iVote Service; 
//3) randomly generate a number students and the answers;
//4)submit all the students’ answers to iVote Service; 
//5) call the iVote Service output function to display the result.
public class SimDriver {
    public static void main(String[] args) {
        IVoteService driver = new IVoteService();   //creates object of IVoteService
        Question qu = new Question();               //creates object of Question
        driver.iVote();                             //calls main procedure
        driver.stats(qu.getQType());                //uses Question object to obtain question type for stats
        System.out.println("Voting Over.");
    }
 
}
