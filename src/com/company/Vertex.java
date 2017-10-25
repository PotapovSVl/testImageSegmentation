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

    //лист рёбер
    private LinkedList<Edge<VT>> edges;

    //набор соседей с вершиной
    private HashSet<Vertex<VT>>  neighbor;

    //getter для id
    public int id(){return this.num;}

    //возвращает данные
    public VT data(){return this.data;}





    @Override
    public int compareTo(Vertex<VT> o) {
        return 0;
    }


}
