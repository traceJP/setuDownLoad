package com.traceJP.setu;

import java.util.Arrays;

public class setu {

    private int pid;
    private int p;
    private int uid;
    private String title;
    private String author;
    private String url;
    private boolean r18;
    private int width;
    private int height;
    private String[] tags;

    public setu(int pid, int p, int uid, String title, String author, String url, boolean r18, int width, int height, String[] tags) {
        this.pid = pid;
        this.p = p;
        this.uid = uid;
        this.title = title;
        this.author = author;
        this.url = url;
        this.r18 = r18;
        this.width = width;
        this.height = height;
        this.tags = tags;
    }

    public setu() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isR18() {
        return r18;
    }

    public void setR18(boolean r18) {
        this.r18 = r18;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "setu{" +
                "pid=" + pid +
                ", p=" + p +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", r18=" + r18 +
                ", width=" + width +
                ", height=" + height +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }

}
