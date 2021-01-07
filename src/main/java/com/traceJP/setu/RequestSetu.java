package com.traceJP.setu;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RequestSetu {

    private final String url = Util.getProperties("apiUrl");

    private final String param = Util.getProperties("apiParam");

    /**
     * 获取apiurl返回的json数据
     * @return
     */
    public String requestSetu() {
        String urlName = url + "?" + param;
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(urlName)
                .build();
        final Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
