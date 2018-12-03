package com.g5niusx.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author g5niusx
 */
public class Demo {
    private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        LOGGER.info("测试INFO");
        LOGGER.debug("测试DEBUG");
        LOGGER.warn("测试WARN");
        LOGGER.error("测试ERROR");
    }
}
