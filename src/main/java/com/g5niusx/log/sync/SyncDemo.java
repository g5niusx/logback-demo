package com.g5niusx.log.sync;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志文件异步写入
 *
 * @author g5niusx
 */
public class SyncDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(SyncDemo.class);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            LOGGER.info("测试INFO异步文件写入....");
            LOGGER.warn("测试WARN异步文件写入....");
            LOGGER.error("测试ERROR异步文件写入....");
            LOGGER.debug("测试DEBUG异步文件写入....");
        }
    }
}
