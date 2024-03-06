package Lab2.Application3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class MovingSquare extends JPanel implements Runnable {
    private static final long serialVersionUID = 1L;

    private int maxSpeed; // Individual maximum speed limit
    private static final Random random = new Random();
    private String name;
    private int minY;
    private int maxY;
    private boolean stop = false;

    public MovingSquare(String name, int maxSpeed, int x, int y, int size, int maxY) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        setBounds(x, y, size, size);
        setBackground(Color.BLUE);
        this.minY = size;
        this.maxY = maxY - size;
    }

    @Override
    public void run() {
        while (!stop) {
            int speed = random.nextInt(maxSpeed) + 1; // Random speed between 1 and maxSpeed
            setLocation(getX(), getY() + speed);

            // Print message to console
            System.out.println(name + "->" + speed);

            // Check if square exits window perimeter
            if (getY() > maxY) {
                stop = true;
            }

            try {
                Thread.sleep(50); // Adjust for smoother movement
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
