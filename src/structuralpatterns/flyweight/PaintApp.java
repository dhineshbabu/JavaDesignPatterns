package structuralpatterns.flyweight;

public class PaintApp {

    public void render(int numOfShapes){
        Shape[] shapes = new Shape[numOfShapes + 1];

        for(int i=1; i<= numOfShapes; i++) {
            if(i%2 ==0) {
                shapes[i] = new Circle();
                ((Circle) shapes[i]).setRadius(i);
                ((Circle) shapes[i]).setFillColor("red");
                ((Circle) shapes[i]).setLineColor("white");
                shapes[i].draw();
            } else {
                shapes[i] = new RectAngle();
                ((RectAngle) shapes[i]).setLength(i);
                ((RectAngle) shapes[i]).setBreadth(i+i);
                ((RectAngle) shapes[i]).setFillStyle("dotted");
                shapes[i].draw();
            }

        }
    }

}
