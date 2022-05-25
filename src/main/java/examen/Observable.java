package examen;

public interface Observable {
    public void addObserver(String s,Observer o);
    public void removeObserver(String s,Observer o);

    public void notifyObs(String s);
}
