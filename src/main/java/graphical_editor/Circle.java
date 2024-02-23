package graphical_editor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Circle extends Graphical_object {

    private int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }



    @Override
    public void paint(BufferedImage img, String name) throws IOException {
        System.out.println("Circle: "+getX()+" "+getY());
        Graphics2D g = (Graphics2D) img.getGraphics();
        g.drawOval(getX(),getY(), radius, radius);
        ImageIO.write(img, "PNG", new File(name));


    }
}
