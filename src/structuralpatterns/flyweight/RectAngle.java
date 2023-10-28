package structuralpatterns.flyweight;

public class RectAngle extends Shape{
    private String label;


    public RectAngle() {
        label = "Rectangle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a " + label + " with length " + length + " breadth " + breadth + " Line Color" + fillStyle);

    }
}
