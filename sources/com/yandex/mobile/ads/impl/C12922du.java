package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.View;
import com.yandex.mobile.ads.impl.j10;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.du */
public final class C12922du {
    @JvmStatic
    /* renamed from: a */
    public static final boolean m35452a(Uri uri, d10 d10) {
        View findViewWithTag;
        j10 j10;
        String queryParameter;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(d10, "view");
        String queryParameter2 = uri.getQueryParameter("id");
        if (queryParameter2 == null || (findViewWithTag = d10.mo66384a().findViewWithTag(queryParameter2)) == null) {
            return false;
        }
        String authority = uri.getAuthority();
        if (findViewWithTag instanceof C13016ey) {
            j10 = new j10.C13469c((C13016ey) findViewWithTag, C13008eu.m35820a(authority));
        } else {
            j10 = findViewWithTag instanceof C14325pw ? new j10.C13466a((C14325pw) findViewWithTag, C13008eu.m35820a(authority)) : findViewWithTag instanceof C15118wv ? new j10.C13468b((C15118wv) findViewWithTag) : findViewWithTag instanceof uc1 ? new j10.C13470d((uc1) findViewWithTag) : null;
        }
        if (j10 == null || !(!(j10 instanceof j10.C13469c)) || authority == null) {
            return false;
        }
        int hashCode = authority.hashCode();
        if (hashCode != -1789088446) {
            if (hashCode != -1280379330) {
                if (hashCode != -88123690 || !authority.equals("set_current_item") || (queryParameter = uri.getQueryParameter("item")) == null) {
                    return false;
                }
                try {
                    j10.mo67914a(Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                    return false;
                }
            } else if (!authority.equals("set_previous_item")) {
                return false;
            } else {
                j10.mo67914a(C13008eu.m35819a(uri, j10.mo67913a(), j10.mo67915b()).mo68528b());
            }
        } else if (!authority.equals("set_next_item")) {
            return false;
        } else {
            j10.mo67914a(C13008eu.m35819a(uri, j10.mo67913a(), j10.mo67915b()).mo68527a());
        }
        return true;
    }
}
