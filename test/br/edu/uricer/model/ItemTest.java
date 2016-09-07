package br.edu.uricer.model;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    
    public ItemTest() {
    }
    
    @Test
    public void mustTotalItem() {
       Product product = new Product();
       product.setPrice(new BigDecimal("2.50"));
       Item item = new Item();
       item.setProduct(product);
       item.setQuantity(new BigDecimal("2"));
       item.setUnitaryValue(product.getPrice());
       item.totalize();
       assertEquals(new BigDecimal("5.00"),item.getTotalValue());
    }
    
}
