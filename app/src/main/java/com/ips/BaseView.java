package com.ips;

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

    boolean consumeBackPress();

    void onTokenExpired();

}