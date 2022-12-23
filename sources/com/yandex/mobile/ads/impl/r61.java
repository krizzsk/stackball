package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class r61<T extends View> {
    /* renamed from: a */
    public T mo69698a(Context context, Class<T> cls, int i, ViewGroup viewGroup) {
        try {
            return (View) cls.cast(LayoutInflater.from(context).inflate(i, viewGroup, false));
        } catch (Exception unused) {
            return null;
        }
    }
}
