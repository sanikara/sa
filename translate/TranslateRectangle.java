import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class TranslateRectangle extends Applet {

    @Override
    public void init() {
        // Set the size of the applet window
        setSize(400, 400);
    }

    @Override
    public void paint(Graphics g) {
        int x = 50; // X-coordinate of the top-left corner of the rectangle
        int y = 50; // Y-coordinate of the top-left corner of the rectangle

        int width = 100; // Width of the rectangle
        int height = 50; // Height of the rectangle

        int translationX = 20; // X-translation
        int translationY = 20; // Y-translation

        // Calculate the translated coordinates
        int translatedX = x + translationX;
        int translatedY = y + translationY;

        // Set the color and draw the original rectangle
        g.setColor(Color.BLUE);
        g.drawRect(x, y, width, height);

        // Set the color and draw the translated rectangle
        g.setColor(Color.RED);
        g.drawRect(translatedX, translatedY, width, height);
    }
}

/*<applet code="TranslateRectangle.class" width="1000" height="1000">
 </applet>

 */