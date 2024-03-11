package Lab2.Application3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            int[] maxSpeeds = {2, 8, 5}; // Individual maximum speed limits for each square
            MovingShapesApplication app = new MovingShapesApplication(maxSpeeds);
            app.startMoving();
        });
    }
}



