import org.mariuszgromada.math.mxparser.Expression;
import javax.swing.*;
import java.awt.event.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class ScientificCalculator {
    private JPanel mainPanel;
    private JPanel rightPanel;
    private JScrollPane scrollContainerPane;
    private JTextArea mainTextArea;
    private JTextField formulasInput;
    private JList functionsList;
    private JButton evalButton;
    private JComboBox selectList;
    private JMenuBar menuBar;
    private JMenu menu;
    private static JMenuItem reset = new JMenuItem("reset");
    private static JMenuItem exit = new JMenuItem("exit");

    private ScientificCalculator() {
        final String[] lastResult = new String[1];
        final String[] lastExpression = new String[1];

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainTextArea.selectAll();
                mainTextArea.replaceSelection("");
                formulasInput.selectAll();
                formulasInput.replaceSelection("");
            }
        });
        functionsList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int choiceFromList = functionsList.getSelectedIndex();
                List<String> listModel = new ArrayList<String>();
                listModel.add("+");
                listModel.add("-");
                listModel.add("*");
                listModel.add("pi");
                listModel.add("sin()");
                listModel.add("cos()");
                listModel.add("ln()");
                listModel.add("rad()");
                listModel.add("floor()");
                listModel.add("[Pt]");
                listModel.add("[Ks]");
                listModel.add(lastResult[0]);
                if(e.getClickCount()==2){
                    formulasInput.setText(formulasInput.getText()+listModel.get(choiceFromList));
                    formulasInput.requestFocus();
                }
            }
        });
        formulasInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    Expression e1 = new Expression(formulasInput.getText());
                    if(e1.checkSyntax()){
                        Double resultOfCalculate = e1.calculate();
                        lastResult[0] = resultOfCalculate.toString();
                        String formatOfExpression = MessageFormat.format("{0}{1}                    ={2}{1}---------------{1}", formulasInput.getText(), '\n', resultOfCalculate);
                        mainTextArea.setText(mainTextArea.getText() + formatOfExpression);
                        lastExpression[0] = formulasInput.getText();
                        formulasInput.selectAll();
                        formulasInput.replaceSelection("");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, e1.getErrorMessage());
                    }
                }
            }
        });
        formulasInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_UP){
                    formulasInput.setText(lastExpression[0]);
                }
            }
        });
        evalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Expression e1 = new Expression(formulasInput.getText());
                if(e1.checkSyntax()){
                    Double resultOfCalculate = e1.calculate();
                    lastResult[0] = resultOfCalculate.toString();
                    String formatOfExpression = MessageFormat.format("{0}{1}                    ={2}{1}---------------{1}", formulasInput.getText(), '\n', resultOfCalculate);
                    mainTextArea.setText(mainTextArea.getText() + formatOfExpression);
                    lastExpression[0] = formulasInput.getText();
                    formulasInput.selectAll();
                    formulasInput.replaceSelection("");
                }
                else {
                    JOptionPane.showMessageDialog(null, e1.getErrorMessage());
                }
            }
        });

        mainTextArea.setEditable(false);

        DefaultListModel<String> listModel = new DefaultListModel<String>();
        listModel.addElement("+");
        listModel.addElement("-");
        listModel.addElement("*");
        listModel.addElement("PI");
        listModel.addElement("Sinus");
        listModel.addElement("Cosinus");
        listModel.addElement("Natural logarithm");
        listModel.addElement("Radian");
        listModel.addElement("Floor");
        listModel.addElement("Porter's constant");
        listModel.addElement("Sierpinski's constant");
        listModel.addElement("Result");
        functionsList.setModel(listModel);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ScientificCalculator");
        frame.setContentPane(new ScientificCalculator().mainPanel);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        menuBar.add(menu);
        menu.add(reset);
        menu.add(exit);

        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setJMenuBar(menuBar);
    }
}
