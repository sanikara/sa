import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Object extends Applet {

    @Override
    public void init() {
        // Set the size of the applet window
        setSize(400, 400);
    }

    @Override
    public void paint(Graphics g) {
        int triangleX1 = 100;
        int triangleY1 = 100;
        int triangleX2 = 150;
        int triangleY2 = 50;
        int triangleX3 = 200;
        int triangleY3 = 100;

        int rectangleX = 100;
        int rectangleY = 100;
        int rectangleWidth = 200;
        int rectangleHeight = 100;

        int smallRectX = 125;
        int smallRectY = 125;
        int smallRectWidth = 50;
        int smallRectHeight = 50;

        // Set the color and draw the triangle
        g.setColor(Color.BLUE);
        int[] xPoints = {triangleX1, triangleX2, triangleX3};
        int[] yPoints = {triangleY1, triangleY2, triangleY3};
        g.drawPolygon(xPoints, yPoints, 3);

        // Set the color and draw the outer rectangle
        g.setColor(Color.RED);
        g.drawRect(rectangleX, rectangleY, rectangleWidth, rectangleHeight);

        // Set the color and draw the inner smaller rectangle
        g.setColor(Color.GREEN);
        g.drawRect(smallRectX, smallRectY, smallRectWidth, smallRectHeight);
    }
}
/*<applet code="Object.class" width="1000" height="1000">
 </applet>

 */