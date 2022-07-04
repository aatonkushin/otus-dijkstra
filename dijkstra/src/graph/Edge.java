package graph;

/**
 * Ребро
 */
public class Edge implements Comparable<Edge>{
    Vertex vertex1;         // вершина 1
    Vertex vertex2;         // вершина 2

    int weight;             // вес

    public Edge(Vertex vertex1, Vertex vertex2, int weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge e) {
        return Integer.compare(this.weight, e.weight);
    }

    @Override
    public String toString() {
        return "Edge{" +
                "v1=" + vertex1 +
                ", v2=" + vertex2 +
                ", weight=" + weight +
                '}';
    }

    public Vertex getVertex1() {
        return vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }

    public int getWeight() {
        return weight;
    }
}
