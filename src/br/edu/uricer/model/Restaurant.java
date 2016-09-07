package br.edu.uricer.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<Table> tables = null;

    public Restaurant() {
        tables = new ArrayList<Table>(6);
        
        Table table1 = new Table(1);
        tables.add(table1);
        Table table2 = new Table(2);
        tables.add(table2);
        Table table3 = new Table(3);
        tables.add(table3);
        Table table4 = new Table(4);
        tables.add(table4);
        Table table5 = new Table(5);
        tables.add(table5);
        Table table6 = new Table(6);
        tables.add(table6);       
    }
    public List<Table> listEmpytTables(){
        List<Table> isEmpyt = new ArrayList<Table>();
        for(Table table : tables){
            if(!table.isOccupied()){
                isEmpyt.add(table);
            }
        }
        return isEmpyt;
    }
    public void occupyTheTable(Table table){
        table.occupyTheTable();
    }
     public void vacateTheTable(Table table){
        table.vacateTheTable();
    }
    
    
            
}
