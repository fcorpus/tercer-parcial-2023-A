package edu.uaslp.objetos.shoppingcart;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private LinkedList<ShoppingItem> shoppingCart;
    private ShoppingItemCatalog shoppingItemCatalog;
    private int size=0;
    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog) {
        shoppingCart = new LinkedList<>();
        this.shoppingItemCatalog=shoppingItemCatalog;
    }
    public void add(String code){

        size ++;
    }
    public int getTotalCostInCents(){

    }
    public int getDistinctItemsCount(){

    }
    public int getTotalItemsCount(){

    }
    public List<ShoppingItem> getItems(){

    }

    public Collection<ShoppingItem> getDistinctItems() {
        return null;
    }
}
