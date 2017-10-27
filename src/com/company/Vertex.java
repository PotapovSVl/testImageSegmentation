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
    //флаг для обходов
    private boolean visited;


    //лист рёбер
    private LinkedList<WEdge<VT>> edges;

    //набор соседей с вершиной
    private HashSet<Vertex<VT>> neighbor;

    //getter для id
    public int id() {
        return this.num;
    }

    public boolean setID(int id) {
        this.num = id;
        return (this.num == id);
    }

    //возвращает HashCode объекта по его ID
    @Override
    public int hashCode() {
        return new Integer(this.num).hashCode();
    }


    //возвращает рёбра
    public LinkedList<WEdge<VT>> getEdges() {
        return this.edges;
    }

    //возвращает соседей
    public HashSet<Vertex<VT>> getNeighbor() {
        return this.neighbor;
    }

    //возвращает данные
    public VT data() {
        return this.data;
    }

    public VT getData() {
        return this.data;
    }


    //создает новый граф
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
        this.visited =false;
    }

    //добавить ребро, вернуть true, если добавлено
    public boolean addEdge(WEdge<VT> e) {
        this.edges.add(e);
        if (e.source().id() == this.num) {
            this.neighbor.add(e.end());
        } else {
            this.neighbor.add(e.source());
        }
        return true;
    }

    //удалить ребро, вернуть true, если удалено
    public boolean removeEdge(WEdge<VT> e) {
        this.edges.remove(e);
        if (e.source().id() == this.num) {
            this.neighbor.remove(e.end());
        } else {
            this.neighbor.remove(e.source());
        }
        return true;
    }

    //составить строковое представление для вершины.
    public String toString() {
        return "(" + this.data + " - ID:" + this.num + ")";
    }


    //проверить пренадлежность двух вершин одному айди
    public boolean equals(Object other) {
        if (other instanceof Vertex) {
            Vertex v = (Vertex) other;
            return this.num == v.id();
        } else return false;


    }
    public boolean isVisited(){return this.visited;}

    public void markVisited() {this.visited=true;}

    public void createVisited(){this.visited= false;}

    @Override
    public int compareTo(Vertex<VT> o) {
        return this.num - o.id();
    }
}
