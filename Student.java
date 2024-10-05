import javax.swing.JOptionPane;

public class Student {

    //fields
    public String FirstName, LastName;
    public int Age;
    private String Nickname;
    private int[] quizzes = new int [5];

    //methods
    //#1 (constructor w/o parameter)
    public Student() {
        this.FirstName = "";
        this.LastName = "";
        this.Age = 0;
    }

    //#2 (constructor w/ parameter)
    public Student(String FirstName, String LastName, int Age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    //#3 (accessor and mutator for nn)
    public String getNickname(){
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    //#4 (accessor and mutator for quizzes)
    public void displayQuizzes(){
        StringBuilder quizScores = new StringBuilder("Scores: \n");
        for (int i = 0; i < 5; i++){
            quizScores.append("Quiz ").append(i+1).append(": ").append(quizzes[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, quizScores.toString(), "Quiz Scores", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setquizzes(int index, int score){
        if (index >= 0 && index < 5){
            quizzes[index] = score;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid index...", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    //#5 (display)
    private void displayStudentNameAge(){
        JOptionPane.showMessageDialog(null,
        "Student name: " + FirstName + " " + LastName + "\n" +
        "Nickname: " + Nickname + "\n" +
        "Age: " + Age, "Student Information", JOptionPane.INFORMATION_MESSAGE);
    }

    //#6 (compute)
    private void computeGrade(){
        StringBuilder scoresDisplay = new StringBuilder("Scores:\n");
        for (int i = 0; i < 5; i++) {
            scoresDisplay.append("Quiz ").append(i + 1).append(": ").append(quizzes[i]).append("\n");
        }

        int totalScore = 0;
        for (int quiz : quizzes) {
            totalScore += quiz;
        }
        double average = totalScore / 5.0;

        scoresDisplay.append("\nAverage: ").append(average);
        JOptionPane.showMessageDialog(null, scoresDisplay.toString(), "Quiz Scores and Average", JOptionPane.INFORMATION_MESSAGE);
    }

    //#7 (all info display)
    public void displayAllInformation(){
        displayStudentNameAge();
        displayQuizzes();
        computeGrade();
    }

}