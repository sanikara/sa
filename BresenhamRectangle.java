import java.applet.Applet;
import java.awt.*;

public class BresenhamRectangle extends Applet {
    int centerX, centerY, maxX, maxY;

    void initgr() {
        // Get the window size and compute minimum, maximum, and center
        java.awt.Dimension d = getSize();
        maxX = d.width - 1;
        maxY = d.height - 1;
        centerX = maxX / 2;
        centerY = maxY / 2;
    }

    void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        int err = dx - dy;

        while (true) {
            g.fillRect(x1, y1, 1, 1);

            if (x1 == x2 && y1 == y2) {
                break;
            }

            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }

    public void paint(Graphics g) {
        initgr();

        // Draw the four sides of the rectangle using the Bresenham algorithm
        drawLine(g, centerX - 100, centerY - 100, centerX + 100, centerY - 100);
        drawLine(g, centerX + 100, centerY - 100, centerX + 100, centerY + 100);
        drawLine(g, centerX + 100, centerY + 100, centerX - 100, centerY + 100);
        drawLine(g, centerX - 100, centerY + 100, centerX - 100, centerY - 100);
    }
}

/*<applet code="BresenhamRectangle.class" width="1000" height="1000">
 </applet>

 */