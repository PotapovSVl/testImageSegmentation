package com.company;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * представление вершины графа
 * VT - данные, которые будух храниться
 */
public class Vertex<VT> implements Comparable<Vertex<VT>> {
    //id каждой вершины
    private int num;
    //данные
    private VT data;


    //создает новый граф


    //лист рёбер
    private LinkedList<WEdge<VT>> edges;

    //набор соседей с вершиной
    private HashSet<Vertex<VT>> neighbor;

    //getter для id
    public int id() {
        return this.num;
    }

    //возвращает данные
    public VT data() {
        return this.data;
    }

    public Vertex(VT d, int id) {
        this.data = data;
        this.num = id;
        this.edges = new LinkedList<WEdge<VT>>();
        this.neighbor = new HashSet<Vertex<VT>>();
    }


    //сбрасывает связность графа, если понадобится, id сохраняет
    public void reset() {
        this.edges = new LinkedList<WEdge<VT>>();
        this.neighbor = new HashSet<Vertex<VT>>();
    }

    public boolean addEdge(WEdge<VT> e) {
        this.edges.add(e);
        if (e.source().id() == this.num) {
            this.neighbor.add(e.end());
        } else {
            this.neighbor.add(e.source());
        }
        return true;
    }





    @Override
    public int compareTo(Vertex<VT> o) {
        return 0;
    }


}
