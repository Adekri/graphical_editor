package grafickyEditor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ctverec extends GrObjekt {
    private int strana;
    public Ctverec(int x, int y, int strana) {
        super(x, y);
        this.strana=strana;
    }

    @Override
    public void vykresli(BufferedImage img, String nazev)throws IOException {

        System.out.println("Čtverec: "+getX()+" "+getY());
        Graphics2D g = (Graphics2D) img.getGraphics();
        g.drawRect(getX(),getY(),strana,strana);
        ImageIO.write(img, "PNG", new File(nazev));

    }
}
