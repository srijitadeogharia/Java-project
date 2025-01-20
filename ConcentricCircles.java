import java.applet.Applet;
import java.awt.Graphics;

public class ConcentricCircles extends Applet {

    public void paint(Graphics g) {
        int x = 150; // Center x-coordinate
        int y = 150; // Center y-coordinate
        int radius = 20; // Initial radius
        int numberOfCircles = 10; // Number of concentric circles
        
        for (int i = 0; i < numberOfCircles; i++) {
            g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
            radius += 20; // Increment the radius for the next circle
        }
    }
}