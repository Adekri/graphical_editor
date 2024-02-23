package graphical_editor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Square extends Graphical_object {
    private int length;
    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public void paint(BufferedImage img, String name)throws IOException {

        System.out.println("Square: "+getX()+" "+getY());
        Graphics2D g = (Graphics2D) img.getGraphics();
        g.drawRect(getX(),getY(), length, length);
        ImageIO.write(img, "PNG", new File(name));

    }
}
