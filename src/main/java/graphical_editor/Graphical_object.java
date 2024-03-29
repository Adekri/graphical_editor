package graphical_editor;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class Graphical_object {
    private int x;
    private int y;

    public Graphical_object(int x, int y){
        super();
        this.x=x;
        this.y=y;
    }

    public abstract void paint(BufferedImage img, String name) throws IOException;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
