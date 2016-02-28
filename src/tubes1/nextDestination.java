/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes1;

/**
 *
 * @author INF
 */
public class nextDestination {

    node kota2 ;
    double jarak ;
    public nextDestination(node kota2,double jarak){
        this.kota2 = kota2;
        this.jarak = jarak;
    }


    public node getKota2() {
        return kota2;
    }

    public double getJarak() {
        return jarak;
    }


    public void setKota2(node kota2) {
        this.kota2 = kota2;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }
    
    
    }