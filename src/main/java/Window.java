import javax.swing.*;

public class Window extends JFrame {

    public Window() {

        setBounds(300, 300, 300, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new Calculator());
        setVisible(true);
    }
}
