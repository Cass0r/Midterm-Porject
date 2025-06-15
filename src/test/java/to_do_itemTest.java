import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class to_do_itemTest {

    // Instance of the class under test
private to_do_item to_do_ITEMS;

// This method runs before each test to set up a clean instance of to_do_item
@BeforeEach
    void setUp() {
    to_do_ITEMS = new to_do_item();
}

//----------------------------------------------------------------------------------------------------------------------
//Add item method

    //Item is successfully added
    @Test
    void add_items_to_list(){
    Items test_Item = new Items("55225","Hammer","16 oz hammers with mini compartment",true);
    assertTrue(to_do_ITEMS.Add_Item(test_Item),"Item has been successfully added to to do list.");
    }

    //duplicate error handling
    @Test
    void add_Movie_duplication(){
    Items test_Item = new Items("55225","Hammer","16 oz hammers with mini compartment",true);
    to_do_ITEMS.Add_Item(test_Item);
    assertFalse(to_do_ITEMS.Add_Item(test_Item),"Error: Item already exists in the collection.");
    }

//----------------------------------------------------------------------------------------------------------------------
//Remove item method

    //Item is successfully removed
    @Test
    void remove_items_from_list(){
    Items test_Item = new Items("55225","Hammer","16 oz hammers with mini compartment",true);
    to_do_ITEMS.Add_Item(test_Item);
    assertTrue(to_do_ITEMS.Delete_item("55225"),"Item has been successfully removed from do list.");
    }

    //Deleting an item that doesn't exist in list
    @Test
    void remove_item_invalid(){
    assertFalse(to_do_ITEMS.Delete_item("564512"),"There is no items in to list");
    }

//----------------------------------------------------------------------------------------------------------------------
//Display items

    //Display all items in the list
    @Test
    void Display_list_test(){

    Items test_Item = new Items("55465","Hammer","16 oz hammers with mini compartment.",true);
    Items test_Item2 = new Items("19856","Screwdriver","8 inch long screwdriver.",false);
    Items test_Item3 = new Items("88992","Nail Box","Box of 5 inch long nails(quantity 200 nails).",true);

    to_do_ITEMS.Add_Item(test_Item);
    to_do_ITEMS.Add_Item(test_Item2);
    to_do_ITEMS.Add_Item(test_Item3);

    to_do_ITEMS.display_items_list();
    }

//----------------------------------------------------------------------------------------------------------------------
}//class