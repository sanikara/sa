import java.applet.Applet;
import java.awt.*;

public class MidpointCircle extends Applet {
    int x, y, r;

    public void init() {
        // Set the circle parameters
        x = 100;  // Center X coordinate
        y = 100;  // Center Y coordinate
        r = 50;   // Radius
    }

    public void putPixel(Graphics g, int x, int y) {
        g.fillRect(x, y, 1, 1);
    }

    public void drawMidpointCircle(Graphics g, int centerX, int centerY, int radius) {
        int x = radius;
        int y = 0;
        int p = 1 - radius;

        while (x >= y) {
            putPixel(g, centerX + x, centerY + y);
            putPixel(g, centerX - x, centerY + y);
            putPixel(g, centerX + x, centerY - y);
            putPixel(g, centerX - x, centerY - y);
            putPixel(g, centerX + y, centerY + x);
            putPixel(g, centerX - y, centerY + x);
            putPixel(g, centerX + y, centerY - x);
            putPixel(g, centerX - y, centerY - x);

            y++;

            if (p <= 0) {
                p = p + 2 * y + 1;
            } else {
                x--;
                p = p + 2 * y - 2 * x + 1;
            }
        }
    }

    public void paint(Graphics g) {
        drawMidpointCircle(g, x, y, r);
    }
}

/*<applet code="MidpointCircle.class" width="1000" height="1000">
 </applet>

 */
