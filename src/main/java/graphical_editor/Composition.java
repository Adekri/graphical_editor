package graphical_editor;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

public class Composition extends Graphical_object {

    private LinkedList<Graphical_object> objects = new LinkedList<>();

    public Composition(int x, int y) {
        super(x, y);
    }

    public void add(Graphical_object graphicalobject){
        objects.add(graphicalobject);
    }

    @Override
    public void paint(BufferedImage img, String name) throws IOException {

        System.out.println("Composition containing: ");
        for (Graphical_object graphicalobject : objects){
            System.out.print("     ");
            graphicalobject.paint(img, name);

        }
    }
}
