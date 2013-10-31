package com.kodcu.conf;

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
                new AnnotationConfigApplicationContext(KodcuConfig.class);

        Galeri galeri = context.getBean("galeri", Galeri.class);
        galeri.getArac().calis();

    }

}
