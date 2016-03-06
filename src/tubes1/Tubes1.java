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
public class Tubes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startime = System.currentTimeMillis();
        loadData ld = new loadData();
//        ld.setMap();
        ld.abintang();
        ld.pathHasil();
        long  endtime = System.currentTimeMillis();
        long elapsedtime = endtime - startime;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("---------------------------");
        runtime.gc();
        long memory = runtime.totalMemory()-runtime.freeMemory();
        System.out.println("Used Memory is = "+memory+" bytes");
        System.out.println("Time Running = "+ elapsedtime + "ms");
        
    }
    
}
