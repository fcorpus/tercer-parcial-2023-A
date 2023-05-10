package edu.uaslp.objetos.shoppingcart;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class Exercise3ShoppingItemCatalog {


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        //given
        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();
        ShoppingItem shoppingItem;
        //when
        shoppingItem=shoppingItemCatalog.getItem("ABC4000");
        //then
        assertThat(shoppingItem).isNotNull();
    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
        //given
        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();
        ShoppingItem shoppingItem;
        //when
        shoppingItem=shoppingItemCatalog.getItem("dfsnlf");
        //then
        assertThat(shoppingItem).isNull();
    }
}

