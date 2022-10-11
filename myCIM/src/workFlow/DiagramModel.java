package workFlow;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;

public interface DiagramModel {

    public HashMap getValueMap();

    public void add(Figure figure);

    public void remove(Figure figure);

    public void clear();

    public Iterator iterator();

    public int size();

    public void setValue(Figure figure, Object value);

    public void setDiagramSize(Dimension size);

    public Dimension getDiagramSize();

    public Object getValue(Figure figure);

    public void addDiagramDataListener(DiagramModelListener listener);

    public void removeDiagramDataListener(DiagramModelListener listener);

    public Object[] toArray(Object[] array);
}
