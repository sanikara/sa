import java.applet.Applet;
import java.awt.Graphics;

public class BresenhamCircle extends Applet {
	
public void paint(Graphics g) {
int xCenter = 200; 
int yCenter = 200; 
int radius = 100; 

int x = 0;
int y = radius;
int d = 3 - 2 * radius;

while (x <= y) {
plotCircle(g, xCenter, yCenter, x, y);
x++;

if (d > 0) {
y--;
d = d + 4 * (x - y) + 10;
} else {
d = d + 4 * x + 6;
}

plotCircle(g, xCenter, yCenter, x, y);
}
}

// circle
void plotCircle(Graphics g, int xCenter, int yCenter, int x, int y) {
g.fillRect(xCenter + x, yCenter + y, 1, 1);
g.fillRect(xCenter - x, yCenter + y, 1, 1);
g.fillRect(xCenter + x, yCenter - y, 1, 1);
g.fillRect(xCenter - x, yCenter - y, 1, 1);
g.fillRect(xCenter + y, yCenter + x, 1, 1);
g.fillRect(xCenter - y, yCenter + x, 1, 1);
g.fillRect(xCenter + y, yCenter - x, 1, 1);
g.fillRect(xCenter - y, yCenter - x, 1, 1);
}
}

/*<applet code="BresenhamCircle.class" width="1000" height="1000">
 </applet>

 */