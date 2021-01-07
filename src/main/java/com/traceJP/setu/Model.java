package com.traceJP.setu;

import java.util.Arrays;

public class Model {

    private int code;
    private String msg;
    private int quota;
    private int quota_min_ttl;
    private int count;
    private setu[] data;

    public Model(int code, String msg, int quota, int quota_min_ttl, int count, setu[] data) {
        this.code = code;
        this.msg = msg;
        this.quota = quota;
        this.quota_min_ttl = quota_min_ttl;
        this.count = count;
        this.data = data;
    }

    public Model() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getQuota_min_ttl() {
        return quota_min_ttl;
    }

    public void setQuota_min_ttl(int quota_min_ttl) {
        this.quota_min_ttl = quota_min_ttl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public setu[] getData() {
        return data;
    }

    public void setData(setu[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Model{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", quota=" + quota +
                ", quota_min_ttl=" + quota_min_ttl +
                ", count=" + count +
                ", data=" + Arrays.toString(data) +
                '}';
    }

}
