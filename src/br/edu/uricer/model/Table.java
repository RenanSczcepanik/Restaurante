package br.edu.uricer.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Table {
    private int number;
    private boolean occupied;
    private List<Item> items = new ArrayList<Item>();
    private BigDecimal totalValue;

    public Table(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOccupied() {
        return occupied;
    }
    
    public void vacateTheTable(){
        occupied = false;
    }
    
    public void occupyTheTable(){
        occupied = true;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }
    public void addItem(Product product, BigDecimal quantity){
        Item newItem = new Item();
        newItem.setProduct(product);
        newItem.setQuantity(quantity);
        newItem.setUnitaryValue(product.getPrice());
        items.add(newItem);
    }
    public void totalize(){
        totalValue = new BigDecimal("0.00");
        for(Item item : items){
            item.totalize();
            totalValue = totalValue.add(item.getTotalValue()).setScale(2);
        }
    }
}
