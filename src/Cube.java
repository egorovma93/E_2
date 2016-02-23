public class Cube extends FigureVolume{
    public int side;
    public Cube(int side)
    {
        this.side = side;
    }
    @Override
    public double ShowArea()
    {
        return 6*side*side;
    }
    @Override
    public double ShowVolume()
    {
        return side*side*side;
    }
}