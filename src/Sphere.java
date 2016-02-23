public class Sphere extends FigureVolume {
    public int radius;
    public Sphere(int radius)
    {
        this.radius = radius;
    }
    @Override
    public double ShowArea()
    {
        return 4*Math.PI*(radius*radius);
    }
    @Override
    public double ShowVolume()
    {
        return 4/3*Math.PI*(radius*radius*radius);
    }
}
