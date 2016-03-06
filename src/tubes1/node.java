/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes1;

import java.util.ArrayList;

/**
 *
 * @author INF
 */
public class node {
    String nama;
    ArrayList<nextDestination> tujuan= new ArrayList<>();
    double heuristic;
    double fn = 0;
    double gn = 0;
    
    public node(String nama,double heuristic){
        this.nama = nama;
        this.heuristic = heuristic;

    }

    public String getNama() {
        return nama;
    }

    public ArrayList<nextDestination> getTujuan() {
        return tujuan;
    }


    public double getHeuristic() {
        return heuristic;
    }

    public double getFn() {
        return fn;
    }
    
}
