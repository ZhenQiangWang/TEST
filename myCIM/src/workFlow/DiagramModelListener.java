package workFlow;

public interface DiagramModelListener {

    public void figureAdded(DiagramModel model, Figure figure);

    public void figureRemoved(DiagramModel model, Figure figure);
}
