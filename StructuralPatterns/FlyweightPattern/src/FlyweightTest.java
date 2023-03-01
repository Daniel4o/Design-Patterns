import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FlyweightTest extends JFrame {

    JButton startDrawing;

    int windowWidth = 1750;
    int windowHeight = 150;

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan, Color.magenta,
            Color.black, Color.gray};

    public static void main(String[] args) {
        new FlyweightTest();
    }

    public FlyweightTest() {
        this.setSize(windowWidth,windowHeight);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = drawingPanel.getGraphics();
                long startTime = System.currentTimeMillis();
                for(int i=0; i<100000; ++i) {
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(),
                            getRandX(), getRandY());
                }
                long endTime = System.currentTimeMillis();

                System.out.println("That took " + (endTime - startTime) + " milliseconds");

            }
        });

        this.add(contentPane);

        this.setVisible(true);

    }

        // Picks random x & y coordinates

    private int getRandX(){ return (int)(Math.random()*windowWidth); }

    private int getRandY(){ return (int)(Math.random()*windowHeight); }

        // Picks a random Color from the 9 available

    private Color getRandColor(){
        Random randomGenerator = new Random();

        int randInt = randomGenerator.nextInt(9);

        return shapeColor[randInt];


    }

}
