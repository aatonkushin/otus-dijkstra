package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Вершина
 */
public class Vertex {
    String name;        // название вершины
    List<Edge> edges;   // список инцидентных рёбер

    public Vertex(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!obj.getClass().equals(Vertex.class)) {
            return false;
        }

        return this.name.equals(((Vertex) obj).name);
    }

    @Override
    public String toString() {
        return "Vertex{" + name +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
