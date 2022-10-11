package workFlow;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public interface Figure extends Shape {

    public Point2D getAnchor(Point2D pt);

    public Rectangle2D getBounds2D(Rectangle2D rc);

    public Point2D getCenter(Point2D pt);

    public Point2D getConnection(Point2D ptFrom, Point2D pt);

    public void setBounds(double x, double y, double w, double h);

    public void translate(double x, double y);

    public Object clone();
}
