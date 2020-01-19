package com.incarcloud.methane;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class CountThreadTest {
    private static final Logger s_logger = LoggerFactory.getLogger(TransceiverGRPCTest.class);

    //线程数量
    private static int threadTotal = 4;
    //请求总数
    private static int clientTotal = 100;
    //计数累加
    private static AtomicInteger count = new AtomicInteger(0);

    @Test
    public void countTest() throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    count.incrementAndGet();
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        s_logger.info("count:" + count);
    }
}
