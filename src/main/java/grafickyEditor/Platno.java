package grafickyEditor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

public class Platno {
    private int sirka;
    private int vyska;
   private BufferedImage img;

    private LinkedList<GrObjekt>objekty = new LinkedList<>();



    public Platno(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
        img = new BufferedImage(sirka,vyska,BufferedImage.TYPE_INT_RGB);

    }

    public void vytvorRastr(String nazev) throws IOException {

        System.out.println("VYTVÁŘÍM RASTR "+nazev);
        for (GrObjekt grObjekt:objekty){
            grObjekt.vykresli(img,nazev);
        }
    }

    public void pridej(GrObjekt grObjekt){
        objekty.add(grObjekt);
    }


}
