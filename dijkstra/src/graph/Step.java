package graph;

public class Step {
    int weight;         // общая стоимость пути
    Vertex prev;        // точка, предшествующая точке назначения

    public Step(int weight, Vertex prev) {
        this.weight = weight;
        this.prev = prev;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getPrev() {
        return prev;
    }

    public void setPrev(Vertex prev) {
        this.prev = prev;
    }
}
