package com.test.inlaze.Utilis;

import net.serenitybdd.core.pages.PageObject;

public class IteractorTime extends PageObject {

    public void esperaMilis(Integer milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
