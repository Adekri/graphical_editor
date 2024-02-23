package grafickyEditor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Kruh  extends GrObjekt {

    private int polomer;
    public Kruh(int x, int y, int polomer) {
        super(x, y);
        this.polomer = polomer;
    }



    @Override
    public void vykresli(BufferedImage img, String nazev) throws IOException {
        System.out.println("Kruh: "+getX()+" "+getY());
        Graphics2D g = (Graphics2D) img.getGraphics();
        g.drawOval(getX(),getY(),polomer,polomer);
        ImageIO.write(img, "PNG", new File(nazev));


    }
}
