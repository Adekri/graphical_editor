package graphical_editor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

public class Canvas {
    private int length;
    private int wight;
    private BufferedImage img;

    private LinkedList<Graphical_object> objects = new LinkedList<>();



    public Canvas(int length, int wight) {
        this.length = length;
        this.wight = wight;
        img = new BufferedImage(length, wight,BufferedImage.TYPE_INT_RGB);

    }

    public void makePainting(String nazev) throws IOException {

        System.out.println("MAKING PAINTING "+nazev);
        for (Graphical_object graphicalobject : objects){
            graphicalobject.paint(img,nazev);
        }
    }

    public void add(Graphical_object graphicalobject){
        objects.add(graphicalobject);
    }


}
