package com.yandex.metrica.impl.p265ob;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10255Fg;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.Hg */
class C10340Hg implements Callable<C10255Fg> {

    /* renamed from: a */
    final /* synthetic */ C10371Ig f24834a;

    C10340Hg(C10371Ig ig) {
        this.f24834a = ig;
    }

    public Object call() throws Exception {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f24834a.f24904a.getContentResolver();
        C10371Ig ig = this.f24834a;
        Cursor unused = ig.f24905b = contentResolver.query(parse, (String[]) null, (String) null, new String[]{ig.f24904a.getPackageName()}, (String) null);
        if (this.f24834a.f24905b != null && this.f24834a.f24905b.moveToFirst()) {
            String string = this.f24834a.f24905b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C10255Fg(string, this.f24834a.f24905b.getLong(1), this.f24834a.f24905b.getLong(2), C10255Fg.C10256a.HMS);
            }
        }
        return null;
    }
}
