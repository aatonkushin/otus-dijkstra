package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Взвешенный граф
 * Хранит список вершин и список рёбер.
 */
public class Graph {
    List<Edge> edgeList;        // список рёбер
    List<Vertex> vertexList;    // список вершин

    int weight = 0;

    public Graph() {
        edgeList = new ArrayList<>();
        vertexList = new ArrayList<>();
    }

    /**
     * Добавляет вершину в граф
     *
     * @param v - вершина
     * @return возвращает добавленную или уже существующую вершину
     */
    private Vertex addVertex(Vertex v) {
        if (!vertexList.contains(v)) {
            vertexList.add(v);
            return v;
        }

        return vertexList.get(vertexList.indexOf(v));
    }

    /**
     * Добавляет ребро в граф
     *
     * @param vertex1Name название вершины 1
     * @param vertex2Name название вершины 2
     * @param weight      вес ребра
     */
    public void addEdge(String vertex1Name, String vertex2Name, int weight) {
        // Создаём вершины
        Vertex vertex1 = new Vertex(vertex1Name);
        Vertex vertex2 = new Vertex(vertex2Name);

        // Добавляем вершины в граф
        Vertex v1 = this.addVertex(vertex1);
        Vertex v2 = this.addVertex(vertex2);

        // Создаём ребро
        Edge edge = new Edge(v1, v2, weight);

        // Добавляем ребро в список рёбер графа
        this.edgeList.add(edge);

        // Добавляем ребро к списку инцидентности каждой из вершин
        v1.edges.add(edge);
        v2.edges.add(edge);

        // Увеличиваем вес графа
        this.weight += weight;
    }

    /**
     * Список вершин графа
     *
     * @return список вершин графа
     */
    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public Vertex getVertexByName(String vertexName) {
        for (Vertex v : vertexList) {
            if (v.name.equals(vertexName)) {
                return v;
            }
        }

        throw new RuntimeException("Вершина не найдена");
    }
}
