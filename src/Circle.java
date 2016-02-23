public class Circle extends Figure {
    public int radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }
    @Override
    public double ShowArea()
    {
        return Math.PI*(radius*radius);
    }
}
