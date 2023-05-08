package edu.uaslp.objetos.shoppingcart;

import exceptions.ItemNotFoundException;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private LinkedList<ShoppingItem> shoppingCart;
    private ShoppingItemCatalog shoppingItemCatalog;
    private int size=0;
    private int totalCost;
    private int distinctItemsCount;
    private int totalItemsCount;
    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog) {
        this.shoppingItemCatalog=shoppingItemCatalog;
    }
    public void setTotalCost(int totalCost){
        this.totalCost=totalCost;
    }
    public void setDistinctItemsCount(int distinctItemsCount) {
        this.distinctItemsCount = distinctItemsCount;
    }

    public void setTotalItemsCount(int totalItemsCount) {
        this.totalItemsCount = totalItemsCount;
    }
    public void setShoppingItemCatalog(LinkedList<ShoppingItem> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    public void add(String code) throws ItemNotFoundException {
        ShoppingItem item1=shoppingItemCatalog.getItem(code);
        shoppingCart.add(item1);
    }
    public int getTotalCostInCents(){
        return 0;
    }
    public int getDistinctItemsCount(){
        return 0;
    }
    public int getTotalItemsCount(){
        return 0;
    }
    public List<ShoppingItem> getItems(){
        return null;
    }

    public Collection<ShoppingItem> getDistinctItems() {
        return null;
    }
}
