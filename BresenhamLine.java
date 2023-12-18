import java.applet.Applet;
import java.awt.*;

public class BresenhamLine extends Applet {
    private int x0, y0, x1, y1;

    public void init() {
        // Set the endpoints of the line
        x0 = 100;
        y0 = 100;
        x1 = 300;
        y1 = 300;
    }

    public void paint(Graphics g) {
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int d = (2 * dy) - dx;
        int inc1 = 2 * dy;
        int inc2 = 2 * (dy - dx);
        int x, y, xend;

        if (x0 > x1) {
            x = x1;
            y = y1;
            xend = x0;
        } else {
            x = x0;
            y = y0;
            xend = x1;
        }

        g.drawLine(x, y, x, y); // Draw the initial pixel

        for (int i = x + 1; i <= xend; i++) {
            if (d < 0) {
                d += inc1;
            } else {
                y++;
                d += inc2;
            }
            g.drawLine(i, y, i, y); // Draw the pixel for this iteration
        }
    }
}


/*<applet code="BresenhamLine.class" width="1000" height="1000">
 </applet>

 */
