//submit answers to questions
//each student has a unique string ID
//each student can only vote once
import java.util.Random;
public class Student {
    Random rand = new Random();
    public String generateID() {
        int temp = rand.nextInt(1000);  //generates a student ID from 0-999
        String ID = temp + "";
        return ID;
    }
    public int vote(int type) {         //submits the student vote. boolean parameter determines which question type is used
        if (type == 1) {                //if the parameter is 1, it's a multiple choice question
            int temp = rand.nextInt(4);
            return temp;                //returns a random number from 0-3 representing A,B,C,D respectively
        }
        else {                          //if it is false, it's a true/false question
            int temp = rand.nextInt(2);
            return temp;                //returns either 0 or 1, 0 = true, 1 = false
        }
    }

}
