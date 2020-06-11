package com.clean.beergoggles;

public class SearchEngine {
    public interface ResultCallback {
        void onResult(String result);
    }

    public void search(String searchText, ResultCallback callback) {
        // TODO: Asynchronously search the web for searchText and invoke callback with the result.
        callback.onResult(searchText.toUpperCase());
    }
}
