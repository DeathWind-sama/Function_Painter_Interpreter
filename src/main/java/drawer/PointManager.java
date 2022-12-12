package drawer;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

public class PointManager {
    //设置画板的长宽
    public static double maxX=1000;
    public static double maxY=1000;

    //点坐标集合
    private Set<Pair<Double,Double>> points=new HashSet<>();

    public void addPoint(double newX,double newY){
        points.add(new Pair<>(newX,newY));
    }
    public void addPoint(Pair<Double,Double> newPoint){
        points.add(newPoint);
    }

    public Set<Pair<Double, Double>> getPoints() {
        return points;
    }
}
