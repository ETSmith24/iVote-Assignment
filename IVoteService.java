//receives question and answer type from Question class
//receives answers from Student class
//a unique ID can only vote once
//displays results
public class IVoteService {
    Question q = new Question();
    Student s = new Student();
    private int countA = 0;     //these are counters for tallying votes
    private int countB = 0;
    private int countC = 0;
    private int countD = 0;
    
    public void iVote() {
        int studentCount = 30;  //sample size of 30 students will be voting
        int submission = 0;     //instantiating the voting variable

        System.out.println(q.generateQ());  //calls Question to generate the question and answers
        int temp = q.getQType();            //stores question type as an int in temp
        if (temp == 1 || temp == 2) {       //if statement distributes the votes to counters
            while (studentCount > 0) {
                submission = s.vote(temp);
                if (submission == 0) {
                    countA++;
                    studentCount--;
                }
                else if (submission == 1) {
                    countB++;
                    studentCount--;
                }
                else if (submission == 2) {
                    countC++;
                    studentCount--;
                }
                else {
                    countD++;
                    studentCount--;
                }
            }
        }
    }
    public void stats(int type) {
        System.out.println("These are the results of the vote: ");
        if (type == 1) {
            System.out.println("A: " + countA + "\nB: " + countB + "\nC: " + countC + "\nD: " + countD);
        }
        else {
            System.out.println("An error has occured");
        }
    }

}
