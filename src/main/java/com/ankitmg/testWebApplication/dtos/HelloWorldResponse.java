package com.ankitmg.testWebApplication.dtos;

/**
 * Created by iankitgupta on 7/24/2017.
 */

public class HelloWorldResponse {

    private String message;

    private long epochTimeStamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getEpochTimeStamp() {
        return epochTimeStamp;
    }

    public void setEpochTimeStamp(long epochTimeStamp) {
        this.epochTimeStamp = epochTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HelloWorldResponse that = (HelloWorldResponse) o;

        if (epochTimeStamp != that.epochTimeStamp) return false;
        return message.equals(that.message);
    }

    @Override
    public int hashCode() {
        int result = message.hashCode();
        result = 31 * result + (int) (epochTimeStamp ^ (epochTimeStamp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "HelloWorldResponse{" +
                "message='" + message + '\'' +
                ", epochTimeStamp=" + epochTimeStamp +
                '}';
    }
}
