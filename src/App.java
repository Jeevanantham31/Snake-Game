import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        int borderwidth =600;
        int borderheight =borderwidth;
 
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(borderheight,borderwidth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.fitsetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame =new SnakeGame(borderwidth, borderheight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
