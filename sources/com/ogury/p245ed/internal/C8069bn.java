package com.ogury.p245ed.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bn */
public final class C8069bn {
    /* renamed from: a */
    public static List<Activity> m22484a(Context context) {
        C8467mq.m23881b(context, "context");
        try {
            List<Activity> arrayList = new ArrayList<>();
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            C8467mq.m23878a((Object) activityInfoArr, "activitiesInfo");
            int i = 0;
            int length = activityInfoArr.length;
            while (i < length) {
                ActivityInfo activityInfo = activityInfoArr[i];
                i++;
                String str = activityInfo.name;
                C8467mq.m23878a((Object) str, "activityInfo.name");
                Activity a = m22483a(str);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return C8394km.m23756a();
        }
    }

    /* renamed from: a */
    private static Activity m22483a(String str) {
        try {
            Object newInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof Activity) {
                return (Activity) newInstance;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
