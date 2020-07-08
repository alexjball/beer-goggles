package com.clean.beergoggles;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class OkhttpAsynchronousGet {
    public interface ResultCallback {
        void onSuccess(String result);
        void onFailure(String result);
    }

    private final OkHttpClient client = new OkHttpClient();

    public void run(String url, ResultCallback resultCallback) {
        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override public void onFailure(Call call, IOException e)
            {
                resultCallback.onFailure(e.toString());
            }

            @Override public void onResponse(Call call, Response response) {
                try (ResponseBody responseBody = response.body()) {
                    if (!response.isSuccessful())
                    {
                        resultCallback.onFailure("Unexpected code " + response);
                    }
                    resultCallback.onSuccess(responseBody.string());
                } catch (IOException e) {
                    resultCallback.onFailure((e.toString()));
                }
            }
        });
    }
}