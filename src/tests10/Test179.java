package tests10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Test179 {
}


    /*public class TestShuffler extends JFrame implements ActionListener {
        JLabel questionLabel, answerLabel;
        JTextField questionField, answerField;
        JCheckBox answerCheck;
        JButton addButton, shuffleButton, saveButton;
        JTextArea questionArea, answerArea;
        int numQuestions, numAnswers;
        String[] questions, answers;
        boolean[] correctAnswers;

        public TestShuffler() {
            super("Test Shuffler");
            setSize(600, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            questionLabel = new JLabel("Enter the number of questions:");
            answerLabel = new JLabel("Enter the number of answers per question:");
            questionField = new JTextField(5);
            answerField = new JTextField(5);
            addButton = new JButton("Add Question");
            addButton.addActionListener(this);
            shuffleButton = new JButton("Shuffle Test");
            shuffleButton.addActionListener(this);
            saveButton = new JButton("Save Test");
            saveButton.addActionListener(this);
            questionArea = new JTextArea(20, 40);
            answerArea = new JTextArea(20, 40);

            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new GridLayout(2, 2));
            inputPanel.add(questionLabel);
            inputPanel.add(questionField);
            inputPanel.add(answerLabel);
            inputPanel.add(answerField);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout());
            buttonPanel.add(addButton);
            buttonPanel.add(shuffleButton);
            buttonPanel.add(saveButton);

            JPanel textPanel = new JPanel();
            textPanel.setLayout(new GridLayout(1, 2));
            textPanel.add(questionArea);
            textPanel.add(answerArea);

            Container contentPane = getContentPane();
            contentPane.setLayout(new BorderLayout());
            contentPane.add(inputPanel, BorderLayout.NORTH);
            contentPane.add(textPanel, BorderLayout.CENTER);
            contentPane.add(buttonPanel, BorderLayout.SOUTH);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addButton) {
                numQuestions = Integer.parseInt(questionField.getText());
                numAnswers = Integer.parseInt(answerField.getText());
                questions = new String[numQuestions];
                answers = new String[numQuestions * numAnswers];
                correctAnswers = new boolean[numQuestions * numAnswers];
                for (int i = 0; i < numQuestions; i++) {
                    String question = JOptionPane.showInputDialog("Enter question #" + (i + 1) + ":");
                    questions[i] = question;
                    for (int j = 0; j < numAnswers; j++) {
                        String answer = JOptionPane.showInputDialog("Enter answer #" + (i * numAnswers + j + 1) + " for question #" + (i + 1) + ":");
                        answers[i * numAnswers + j] = answer;
                    }
                    int answerIndex = JOptionPane.showOptionDialog(null, "Select the correct answer for question #" + (i + 1) + ":", "Correct Answer", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, answers, answers[0]);
                    for (int j = 0; j < numAnswers; j++) {
                        if (answerIndex == i * numAnswers + j) {
                            correctAnswers[i * numAnswers + j] = true;
                        } else {
                            correctAnswers[i * numAnswers + j] = false;
                        }
                    }
                }
                updateTextArea();
            } else if (e.getSource() == shuffleButton) {
                // Shuffle the questions and answers
                shuffle();

                // Print the shuffled test to a text file
                printTestToFile("shuffled_test.txt");

                // Print the answer sheet to a text file
                printAnswerSheetToFile("answer_sheet.txt");
            }
        }
    }*/
