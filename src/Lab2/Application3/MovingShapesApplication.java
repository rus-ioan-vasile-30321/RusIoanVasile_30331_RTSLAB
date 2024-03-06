package Lab2.Application3;

import Lab2.Application3.MovingSquare;

import javax.swing.*;

class MovingShapesApplication extends JFrame {
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 500;
    private static final int SQUARE_SIZE = 50;

    private MovingSquare[] squares;

    public MovingShapesApplication(int[] maxSpeeds) {
        setTitle("Moving Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        squares = new MovingSquare[3];

        // Add squares to the window
        for (int i = 0; i < 3; i++) {
            MovingSquare square = new MovingSquare("Square" + (i + 1), maxSpeeds[i], WINDOW_WIDTH / 3 * i, 0, SQUARE_SIZE, WINDOW_HEIGHT - SQUARE_SIZE);
            add(square);
            squares[i] = square;
        }

        setVisible(true);
    }

    public void startMoving() {
        // Start threads for moving squares
        for (MovingSquare square : squares) {
            Thread thread = new Thread(square);
            thread.start();
        }
    }
}