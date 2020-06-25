package com.clean.beergoggles;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

public class OkhttpAsynchronousGetTest {

    @Test
    public void run() {
//        Create countdown latch and have latch wait a couple seconds
        AtomicReference<String> reference = new AtomicReference<>();

        new OkhttpAsynchronousGet().run(new OkhttpAsynchronousGet.ResultCallback() {
            @Override
            public void onSuccess(String result) {
                reference.set(result);
            }

            @Override
            public void onFailure(String result) {
            }
        });
        Assert.assertTrue(reference.toString().length()!=0);
    }
}