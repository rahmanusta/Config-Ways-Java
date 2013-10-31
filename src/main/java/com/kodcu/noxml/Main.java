package com.kodcu.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 9/22/12
 * Time: 9:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(Galeri.class, Araba.class);
        //context.scan("com.kodcu.noxml");
        context.refresh();


        Galeri galeri = context.getBean("galeri", Galeri.class);
        galeri.getArac().calis();

    }

}
