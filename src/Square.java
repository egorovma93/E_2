public class Square extends Figure {
    public int side;
    public Square(int side)
    {
        this.side = side;
    }
    @Override
    public double ShowArea()
    {
        return side*side;
    }
}
