package com.kodcu.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 9/22/12
 * Time: 9:59 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Galeri {

    @Autowired
    private Arac arac;

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }
}
