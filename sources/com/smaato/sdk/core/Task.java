package com.smaato.sdk.core;

public interface Task {

    public interface Listener<Response, Error> {
        void onFailure(Task task, Error error);

        void onSuccess(Task task, Response response);
    }

    void cancel();

    void start();
}
