import java.applet.Applet;
import java.awt.Graphics;

public class ConcentricTriangles extends Applet {

    public void paint(Graphics g) {
        int x = 150; // Center x-coordinate
        int y = 150; // Center y-coordinate
        int sideLength = 20; // Initial side length
        int numberOfTriangles = 10; // Number of concentric triangles
        
        for (int i = 0; i < numberOfTriangles; i++) {
            drawTriangle(g, x, y, sideLength);
            sideLength += 20; // Increment the side length for the next triangle
        }
    }
    
    private void drawTriangle(Graphics g, int x, int y, int sideLength) {
        int halfSide = sideLength / 2;
        int height = (int) (Math.sqrt(3) * halfSide);
        
        int[] xPoints = { x, x - halfSide, x + halfSide };
        int[] yPoints = { y - height, y + height, y + height };
        
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
