import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Figure> listFigures = new ArrayList<Figure>();
        Figure circle = new Circle(5);
        Figure sphere = new Sphere(3);
        Figure square = new Square(10);
        Figure cube = new Cube(8);
        listFigures.add(circle);
        listFigures.add(sphere);
        listFigures.add(square);
        listFigures.add(cube);
        for(Figure figure: listFigures)
        {
            System.out.println(figure.getClass().getName());
            System.out.println("Площадь "+figure.ShowArea());
            if(figure instanceof FigureVolume)
            {
                System.out.println("Объем "+((FigureVolume) figure).ShowVolume());
            }
        }
    }
}
