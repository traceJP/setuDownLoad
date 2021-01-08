package com.traceJP.setu;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownLoad implements Runnable {

    private final String rootFile = Util.getProperties("localUrl");

    private final String url;
    private final String fileName;
    private final String imageFormat = ".jpg";

    public DownLoad(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        load();
    }

    /**
     * 下载
     */
    private void load() {
        try {
            URL imgFile = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection)imgFile.openConnection();

            // 获取返回403,需要加上Referer
            urlConnection.setRequestProperty("referer", "https://www.pixiv.net/");
            urlConnection.setRequestProperty("User-agent", "Mozilla/4.0");

            urlConnection.connect();
            InputStream is = urlConnection.getInputStream();
            newJpgFile(is);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过流新建文件
     */
    private void newJpgFile(InputStream stream) {
        FileOutputStream output = null;
        try {
            File file = new File(rootFile + fileName + imageFormat);
            output = new FileOutputStream(file);
            int len;
            byte[] buffer = new byte[1024];
            while ((len = stream.read(buffer, 0, 1024)) != -1) {
                output.write(buffer, 0, len);
            }
            System.out.println("一份涩图已经下载成功 ---> " + fileName);
        } catch (Exception e) {
            System.out.println("下载出现未知错误");
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
