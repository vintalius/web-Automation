package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import shared.functions.tests.SearchTestMethods;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SearchTest extends SearchTestMethods {

    @Test
    public void A_searchForProduct() {
        searchProduct();
        chooseProduct();
    }

}
