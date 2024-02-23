package grafickyEditor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

            Platno p = new Platno(800,800);
            p.pridej(new Ctverec(300,400,100));
            p.pridej(new Kruh(40,50,30));

            Slozenina s = new Slozenina(100,100);
            s.pridej(new Ctverec(100,100,200));
            s.pridej(new Kruh(20,20,60));
            p.pridej(s);
            p.pridej(new Ctverec(30,30,100));

            p.vytvorRastr("obrazek.png");


    }
}
