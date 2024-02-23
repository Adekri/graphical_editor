package grafickyEditor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

public class Slozenina extends GrObjekt{

    private LinkedList<GrObjekt> objekty = new LinkedList<>();

    public Slozenina(int x, int y) {
        super(x, y);
    }

    public void pridej(GrObjekt grObjekt){
        objekty.add(grObjekt);
    }

    @Override
    public void vykresli(BufferedImage img, String nazev) throws IOException {

        System.out.println("Složenina obsahující: ");
        for (GrObjekt grObjekt:objekty){
            System.out.print("     ");
            grObjekt.vykresli(img,nazev);

        }
    }
}
