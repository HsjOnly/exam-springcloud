package com.test.entity;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private Boolean flag;
    private String message;
    private T data;

    public Result() {
    }

    public Result(Boolean flag, String message, T data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
