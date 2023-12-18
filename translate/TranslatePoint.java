import java.applet.Applet;
import java.awt.Graphics;

public class TranslatePoint extends Applet {

    @Override
    public void init() {
        // Set the size of the applet window
        setSize(400, 400);
    }

    @Override
    public void paint(Graphics g) {
        int pointX = 50; // Original X-coordinate of the point
        int pointY = 50; // Original Y-coordinate of the point

        int translationX = 20; // X-translation
        int translationY = 20; // Y-translation

        int translatedX = pointX + translationX; // Translated X-coordinate
        int translatedY = pointY + translationY; // Translated Y-coordinate

        // Set the color and draw the original point
        g.setColor(java.awt.Color.BLUE);
        g.fillRect(pointX, pointY, 5, 5); // Draw a point as a small rectangle

        // Set the color and draw the translated point
        g.setColor(java.awt.Color.RED);
        g.fillRect(translatedX, translatedY, 5, 5); // Draw a point as a small rectangle
    }
}

/*<applet code="TranslatePoint.class" width="1000" height="1000">
 </applet>

 */