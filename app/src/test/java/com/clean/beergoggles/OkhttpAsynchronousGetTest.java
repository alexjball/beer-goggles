package com.clean.beergoggles;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class OkhttpAsynchronousGetTest {

    @Test
    public void success() throws Exception {
        AtomicReference<String> reference = new AtomicReference<>();
        CountDownLatch latch = new CountDownLatch(1);

        new OkhttpAsynchronousGet().run("http://publicobject.com/helloworld.txt", new OkhttpAsynchronousGet.ResultCallback() {
            @Override
            public void onSuccess(String result) {
                reference.set(result);
                latch.countDown();
            }

            @Override
            public void onFailure(String result) {
            }
        });

        latch.await(5, TimeUnit.SECONDS);

        Assert.assertTrue(reference.get().length()!=0);
    }

    @Test
    public void failureOn404() throws Exception {
        AtomicReference<String> reference = new AtomicReference<>();
        CountDownLatch latch = new CountDownLatch(1);

        new OkhttpAsynchronousGet().run("https://httpstat.us/404", new OkhttpAsynchronousGet.ResultCallback() {
            @Override
            public void onSuccess(String result) {
            }

            @Override
            public void onFailure(String result) {
                reference.set(result);
                latch.countDown();
            }
        });

        latch.await(5, TimeUnit.SECONDS);

        Assert.assertTrue(reference.get().length()!=0);
    }

    @Test
    public void failureOnDomainNotFound() throws Exception {
        AtomicReference<String> reference = new AtomicReference<>();
        CountDownLatch latch = new CountDownLatch(1);

        new OkhttpAsynchronousGet().run("https://fjaslkdfjaalskdjfalksdjflaksjdflka.com", new OkhttpAsynchronousGet.ResultCallback() {
            @Override
            public void onSuccess(String result) {
            }

            @Override
            public void onFailure(String result) {
                reference.set(result);
                latch.countDown();
            }
        });

        latch.await(5, TimeUnit.SECONDS);

        Assert.assertTrue(reference.get().length()!=0);
    }
}