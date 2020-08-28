package base64;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public class Base64Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("图片转base64");
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(""));

        JTextArea textArea = new DropDragSupportTextArea();
        JScrollPane jsp = new JScrollPane();
        jsp.setViewportView(textArea);
        textArea.setColumns(40);
        textArea.setRows(20);

        panel.add(jsp);
        frame.add(panel);
        frame.setVisible(true);
    }
}
