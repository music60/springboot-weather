package com.studyjun.weather.vo;

/**
 * weather.com.cn 返回的bean对象
 * @param <T>
 */
public class WeatherComCnResponseEntity<T> {

    private T data;
    private int status;
    private String desc;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "data=" + data +
                ", status=" + status +
                ", desc='" + desc + '\'' +
                '}';
    }
}
