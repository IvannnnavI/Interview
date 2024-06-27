/*
 * created by max$
 */


package com.ebay.tests;

import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchItemPositiveTest(){

        app.getDepartment().selectDepartment("2");
        app.getDepartment().selectSection("1");
        app.getDepartment().selectBrand("Apple ");

        String secondItemName = app.getItem().getSecondItemName("2");
        System.out.println(secondItemName);

        app.getItem().searchSecondItem(secondItemName);

    }


}
