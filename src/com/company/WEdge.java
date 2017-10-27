package com.company;

/**
 * Представление ребра графа
 * возвращает объект графа с парамерами:
 * начало графа
 * конец графа
 * вес графа
 */
public class WEdge<VT> implements Comparable<WEdge<VT>> {

    private Vertex<VT> source;
    private Vertex<VT> end;
    private double weight;


    public Vertex<VT> end() {
        return this.end;
    }

    public Vertex<VT> source() {
        return this.source;
    }

    public double weight(){return this.weight;}

    public WEdge(Vertex<VT> source, Vertex<VT> end, double weight) {
        this.source = source;
        this.end = end;
        this.weight = weight;
    }

    public boolean equals(Object other) {
        if (other instanceof WEdge) {
            WEdge v = (WEdge) other;

            //проверка веса
            if (this.weight != v.weight) {
                return false;
            }
            //проверка
            if (!this.end.equals(v.end)) {
                return this.source.equals(v.end) && this.end.equals(v.source);
            } else return this.end.equals(v.end) && this.source.equals(v.source);
        }
        return false;
    }

    //Сравнение двух рёбер на основе веса
    @Override
    public int compareTo(WEdge<VT> other) {
        WEdge<VT> v = other;
        if (this.weight < v.weight) {
            return -1;
        } else if (this.weight > v.weight) {
            return 1;

        } else {
            return 0;
        }
    }

    //возвращает стринговый хеш объекта

    /**
     * @return the hashCode
     */
    public int hashCode() {
        return this.toString().hashCode();
    }

}
