import java.applet.Applet;
import java.awt.*;

public class pp1819 extends Applet {
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
            g.fillRect(x1, y1, 2, 2);

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
	
	void drawCircle(Graphics g, int x, int y, int r) {
        // Bresenham's Circle Drawing Algorithm
        int d = 3 - 2 * r;
        int dx = 0;
        int dy = r;

        while (dx <= dy) {
            g.fillRect(x + dx, y + dy, 2, 2);
            g.fillRect(x - dx, y + dy, 2, 2);
            g.fillRect(x + dx, y - dy, 2, 2);
            g.fillRect(x - dx, y - dy, 2, 2);
            g.fillRect(x + dy, y + dx, 2, 2);
            g.fillRect(x - dy, y + dx, 2, 2);
            g.fillRect(x + dy, y - dx, 2, 2);
            g.fillRect(x - dy, y - dx, 2, 2);

            if (d < 0) {
                d = d + 4 * dx + 6;
            } else {
                d = d + 4 * (dx - dy) + 10;
                dy = dy - 1;
            }
            dx = dx + 1;
        }
    }

    

 

    public void paint(Graphics g) {
        initgr();

        // Draw the four sides of the rectangle using the Bresenham algorithm
       drawLine(g, centerX - 100, centerY - 100, centerX + 100, centerY - 100);
        drawLine(g, centerX + 100, centerY - 100, centerX + 100, centerY + 100);
        drawLine(g, centerX + 100, centerY + 100, centerX - 100, centerY + 100);
        drawLine(g, centerX - 100, centerY + 100, centerX - 100, centerY - 100);
		
		drawLine(g, centerX , centerY - 100, centerX , centerY + 200);
		drawLine(g, centerX , centerY + 200, centerX + 150, centerY + 200);
		drawLine(g, centerX + 150, centerY + 200, centerX , centerY - 100);
		
		drawLine(g, centerX + 100, centerY - 100, centerX+260 , centerY -260);
		
		 // Draw a circle
        drawCircle(g, centerX+135, centerY-135, 50);
		drawCircle(g, centerX+207, centerY-207, 50);
		
		
    }
}

/*<applet code="pp1819.class" width="1000" height="1000">
 </applet>

 */