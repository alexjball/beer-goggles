package com.clean.beergoggles;

public class SearchEngine {
    public interface ResultCallback {
        void onResult(String result);
    }

    public void search(String searchText, ResultCallback callback) {
        new OkhttpAsynchronousGet().run("http://example.com", new OkhttpAsynchronousGet.ResultCallback() {
            @Override
            public void onSuccess(String result) {
                // TODO: Asynchronously search the web for searchText and invoke callback with the result.
                callback.onResult(result);
            }

            @Override
            public void onFailure(String result) {
                // TODO: Asynchronously search the web for searchText and invoke callback with the result.
                callback.onResult(result);
            }
        });
    }
}