/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author INF
 */
public class loadData {
    ArrayList<node> open = new ArrayList<>();
    ArrayList<node> closed = new ArrayList<>();
    ArrayList<node> listNode = new ArrayList<>();
    ArrayList<node> suksesor = new ArrayList<>();
    public loadData(){   
        setMap();
    }
    public void setMap(){
        // set setiap node
        node ravenna = new node("ravenna",0);
        listNode.add(ravenna);
        node rimini = new node("rimini",0.5);
        listNode.add(rimini);
        node ferrara = new node("ferrara",5);
        listNode.add(ferrara);
        node forli = new node("forli",2);
        listNode.add(forli);
        node cesena = new node("cesena",4.5);
        listNode.add(cesena);
        node faenza = new node("faenza",4);
        listNode.add(faenza);
        node imola = new node("imola",5);
        listNode.add(imola);
        node emilia = new node("emilia",6);
        listNode.add(emilia);         
        node terme = new node("terme",7);
        listNode.add(terme);
        node carpi = new node("carpi",8);
        listNode.add(carpi);
        node piacenza = new node("piacenza",10);
        listNode.add(piacenza);
        node bobbia = new node("boobia",10.5);
        listNode.add(bobbia);
        bobbia.fn = bobbia.heuristic;
        
        //set setiap jarak antar kota
        //set next bobbia
        nextDestination bobpia = new nextDestination(piacenza, 5);
        bobbia.tujuan.add(bobpia);
        nextDestination bobter = new nextDestination(terme, 3);
        bobbia.tujuan.add(bobter);
        nextDestination bobces = new nextDestination(cesena, 15);
        bobbia.tujuan.add(bobces);

        //set next piacenza
        nextDestination piacar = new nextDestination(carpi, 3);
        piacenza.tujuan.add(piacar);
        nextDestination piater = new nextDestination(terme, 3);
        piacenza.tujuan.add(piater);  
        
        //set next terme
        nextDestination teremi = new nextDestination(emilia, 2);
        terme.tujuan.add(teremi);
        nextDestination terfae = new nextDestination(faenza, 3);
        terme.tujuan.add(terfae);
        
        //set next cesena
        nextDestination cesrim = new nextDestination(rimini, 5);
        cesena.tujuan.add(cesrim);
        
        //set next carpi 
        nextDestination caremi = new nextDestination(emilia, 2);
        carpi.tujuan.add(caremi);
        nextDestination carfer = new nextDestination(ferrara, 8);
        carpi.tujuan.add(carfer);
        
        //set next emilia
        nextDestination emiimo = new nextDestination(imola, 2);
        emilia.tujuan.add(emiimo);
        
        //set next faenza 
        nextDestination faefor = new nextDestination(forli, 2);
        faenza.tujuan.add(faefor);
        nextDestination faeces = new nextDestination(cesena, 6);
        faenza.tujuan.add(faeces);

        //set next rimini
        nextDestination rimrav = new nextDestination(ravenna, 1);
        rimini.tujuan.add(rimrav);
        
        //set next ferrara 
        nextDestination ferrav = new nextDestination(ravenna, 6);
        ferrara.tujuan.add(ferrav);
        
        //set next imola
        nextDestination imofae = new nextDestination(faenza, 1);
        imola.tujuan.add(imofae);

        //set next forli 
        nextDestination forrav= new nextDestination(ravenna, 3);
        forli.tujuan.add(forrav);
        nextDestination forces = new nextDestination(cesena, 2);
        forli.tujuan.add(forces);

        open.add(bobbia);
    }   
    public void abintang(){
        node BestNode = open.remove(0);
        closed.add(BestNode);
        while(BestNode.nama != "ravenna"){        
        for(int i=0; i<BestNode.tujuan.size(); i++){
            for(int j = 0; j<listNode.size(); j++){
                if(BestNode.tujuan.get(i).kota2.nama == listNode.get(j).nama){
                    listNode.get(j).fn = BestNode.fn + BestNode.tujuan.get(i).jarak+BestNode.tujuan.get(i).kota2.heuristic;
                    System.out.println(listNode.get(j).nama +" "+ listNode.get(j).fn);
                    if((open.isEmpty() )|| !(open.contains(listNode.get(j)))){
                        open.add(listNode.get(j));
                    }
                }
            }                
        }
        
        for(int i =1; i<open.size();i++){
            int max = 0;
            if (open.get(max).fn > open.get(i).fn){
                max = i;    
            }
            BestNode = open.remove(max);
            closed.add(BestNode);           
        }
            System.out.println("[Closed]");
            for(int i =0 ; i<closed.size(); i++){
                System.out.println(closed.get(i).nama+" "+closed.get(i).fn);
            }
            System.out.println("--------------");
    }
}
}
