// Name:         Justin Rhodes
// Class:         CS 3305/ W01
// Term:             Fall 2024
// Instructor:    Sharon Perry
// Assignment:   10-Part-1-DFS

import java.util.*;
//from textbook Listing 28.4 page 1033
public class UnweightedGraph<V> extends AbstractGraph<V> {
    /** Construct an empty graph */
    public UnweightedGraph() {
    }

    /** Construct a graph from vertices and edges stored in arrays */
    public UnweightedGraph(V[] vertices, int[][] edges) {
        super(vertices, edges);
    }

    /** Construct a graph from vertices and edges stored in List */
    public UnweightedGraph(List<V> vertices, List<AbstractGraph.Edge> edges) {
        super(vertices, edges);
    }

    /** Construct a graph for integer vertices 0, 1, 2 and edge list */
    public UnweightedGraph(List<AbstractGraph.Edge> edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }

    /** Construct a graph from integer vertices 0, 1, and edge array */
    public UnweightedGraph(int[][] edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }
}