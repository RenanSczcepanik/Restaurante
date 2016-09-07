package br.edu.uricer.model;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class TableTest {
    
    public TableTest() {
    }
    @Test
    public void testOccupiedIsFalse(){
        Table table = new Table(3);
        assertEquals(false, table.isOccupied());
    }
    @Test
    public void testOccupiedIsTrue(){
        Table table = new Table(3);
        table.occupyTheTable();
        assertEquals(true, table.isOccupied());
    }
        
    @Test
    public void testAddItem(){
        Product bread = new Product();
        bread.setDescription("Bread");
        bread.setPrice(new BigDecimal("2.50"));
        
        Table table = new Table(1);
        table.addItem(bread,new BigDecimal("2"));
        table.addItem(bread,new BigDecimal("4"));
        
        assertEquals(2, table.getItems().size());
    }
    
    @Test
    public void testTotalize() {
        Product bread = new Product();
        bread.setDescription("Bread");
        bread.setPrice(new BigDecimal("2.50"));
        
        Product juice = new Product();
        juice.setDescription("Orange Juice");
        juice.setPrice(new BigDecimal("3.00"));
        
        Table table = new Table(1);
        table.addItem(juice,new BigDecimal("2"));
        table.addItem(bread,new BigDecimal("3"));
        
        table.totalize();
        
        assertEquals(new BigDecimal("13.50"),table.getTotalValue());
    }
    
}
