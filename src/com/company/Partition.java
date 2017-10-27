package com.company;

public class Partition {

    private int size;

    private int[] parent;

    private int[] weight;

    public Partition(int num) {
        this.size = num;
        this.parent = new int[num];
        this.weight = new int[num];

        for (int i = 0; i < this.size; i++) {
            this.parent[i] = -1;
            this.weight[i] = -1;

        }
    }

    void union(int a, int b) {
        int root1 = this.find(a);     // Find root of node a
        int root2 = this.find(b);     // Find root of node b
        if (root1 != root2) {    // Merge with weighted union
            if (this.weight[root2] > this.weight[root1]) {
                this.parent[root1] = root2;
                this.weight[root2] += this.weight[root1];
            } else {
                this.parent[root2] = root1;
                this.weight[root1] += this.weight[root2];
            }
        }
    }

    int find(int curr) {
        if (this.parent[curr] == -1) {
            return curr; // At root
        }
        this.parent[curr] = this.find(this.parent[curr]);
        return this.parent[curr];
    }


}
