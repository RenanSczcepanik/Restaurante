package br.edu.uricer.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    public RestaurantTest() {
    }

    @Test
    public void listEmpytTables() {
        Restaurant restaurant = new Restaurant();
        assertEquals(6, restaurant.listEmpytTables().size());
    }

    @Test
    public void testOccupyTheTable() {
        Restaurant restaurant = new Restaurant();
        List<Table> empytTables = restaurant.listEmpytTables();
        Table empytTable = empytTables.get(0);

        restaurant.occupyTheTable(empytTable);
        assertEquals(5, restaurant.listEmpytTables().size());
    }
}
