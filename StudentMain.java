import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentMain {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            String firstname = JOptionPane.showInputDialog(null, "Enter first name:", "Input First Name", JOptionPane.QUESTION_MESSAGE);
            String lastname = JOptionPane.showInputDialog(null, "Enter last name:", "Input Last Name", JOptionPane.QUESTION_MESSAGE);
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter age:", "Input Age", JOptionPane.QUESTION_MESSAGE));
            String nickname = JOptionPane.showInputDialog(null, "Enter nickname:", "Input Nickname", JOptionPane.QUESTION_MESSAGE);

            Student student = new Student(firstname, lastname, age);
            student.setNickname(nickname);

            JTextField field1 = new JTextField();
            JTextField field2 = new JTextField();
            JTextField field3 = new JTextField();
            JTextField field4 = new JTextField();
            JTextField field5 = new JTextField();

            Object[] fields = {
                "Quiz 1", field1,
                "Quiz 2", field2,
                "Quiz 3", field3,
                "Quiz 4", field4,
                "Quiz 5", field5
            };
            int option = JOptionPane.showConfirmDialog(null, fields, "Input scores", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

            if (option == JOptionPane.OK_OPTION){
                student.setquizzes(0, Integer.parseInt(field1.getText()));
                student.setquizzes(1, Integer.parseInt(field2.getText()));
                student.setquizzes(2, Integer.parseInt(field3.getText()));
                student.setquizzes(3, Integer.parseInt(field4.getText()));
                student.setquizzes(4, Integer.parseInt(field5.getText()));
            }else{
                JOptionPane.showMessageDialog(null, "Score input canceled.", "Canceled", JOptionPane.WARNING_MESSAGE);
            }
            student.displayAllInformation();
        }
        JOptionPane.showMessageDialog(null, "Thank you for using the program!", null, JOptionPane.INFORMATION_MESSAGE);
    }
}