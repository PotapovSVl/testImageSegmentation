package com.company;

public class WEdge<VT> implements Comparable<WEdge<VT>>{

    private Vertex<VT> sourse;
    private Vertex<VT> end;


    public Vertex<VT> end() {
        return this.end;
    }

    public Vertex<VT> source() {
    return this.sourse;
    }

    @Override
    public int compareTo(WEdge<VT> o) {
        return 0;
    }
    //   private VT source;
   // public VT source() {
//return this.source;
  //  }
}
