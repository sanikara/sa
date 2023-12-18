import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class TranslateLine extends Applet {

    @Override
    public void init() {
        // Set the size of the applet window
        setSize(400, 400);
    }

    @Override
    public void paint(Graphics g) {
        int x1 = 50; // X-coordinate of the line's starting point
        int y1 = 50; // Y-coordinate of the line's starting point

        int x2 = 150; // X-coordinate of the line's ending point
        int y2 = 100; // Y-coordinate of the line's ending point

        int translationX = 20; // X-translation
        int translationY = 20; // Y-translation

        // Calculate the translated coordinates
        int translatedX1 = x1 + translationX;
        int translatedY1 = y1 + translationY;
        int translatedX2 = x2 + translationX;
        int translatedY2 = y2 + translationY;

        // Set the color and draw the original line
        g.setColor(Color.BLUE);
        g.drawLine(x1, y1, x2, y2);

        // Set the color and draw the translated line
        g.setColor(Color.RED);
        g.drawLine(translatedX1, translatedY1, translatedX2, translatedY2);
    }
}
/*<applet code="TranslateLine.class" width="1000" height="1000">
 </applet>

 */