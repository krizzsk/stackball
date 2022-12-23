package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ew */
/* compiled from: AppOwnershipConfig */
public final class C5236ew extends C5238ex {
    public int batchSize = 1;
    public List<String> bundleIds = new LinkedList();
    public boolean isEnabled = false;
    public int numOfDays = 28;

    /* renamed from: b */
    public final String mo40557b() {
        return "appOwnership";
    }

    C5236ew(String str) {
        super(str);
    }

    /* renamed from: d */
    public final boolean mo40559d() {
        if (this.numOfDays < 0 || this.batchSize < 0) {
            return false;
        }
        for (String trim : this.bundleIds) {
            if (trim.trim().length() == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final JSONObject mo40558c() {
        return m11976a().mo40711a(this);
    }

    /* renamed from: a */
    public static C5352hm<C5236ew> m11976a() {
        return new C5352hm().mo40709a(new C5357hr("bundleIds", C5236ew.class), (C5356hq) new C5354ho(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new LinkedList();
            }
        }, String.class));
    }
}
