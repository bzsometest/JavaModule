package com.bzchao.module;

import com.bzchao.service.Person;

import java.util.logging.Logger;

public class ModuleTest {
    private static final Logger logger = Logger.getLogger("MainClass");

    public static void main(String[] args) {
        logger.info("Main Start");

        System.out.println("hello module");
        Person ww = new Person("ww", 22);
        System.out.println(ww);
    }
}
