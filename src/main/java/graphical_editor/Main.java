package graphical_editor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

            Canvas p = new Canvas(800,800);
            p.add(new Square(300,400,100));
            p.add(new Circle(40,50,30));

            Composition s = new Composition(100,100);
            s.add(new Square(100,100,200));
            s.add(new Circle(20,20,60));
            p.add(s);
            p.add(new Square(30,30,100));

            p.makePainting("painting.png");


    }
}
