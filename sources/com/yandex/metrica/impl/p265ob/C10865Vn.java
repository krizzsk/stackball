package com.yandex.metrica.impl.p265ob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Vn */
public class C10865Vn extends C10733Rn<Map<String, String>, C10349Hn> {

    /* renamed from: b */
    private final C10821Un f26135b;

    /* renamed from: c */
    private final C10821Un f26136c;

    /* renamed from: d */
    private Comparator<Map.Entry<String, String>> f26137d;

    /* renamed from: com.yandex.metrica.impl.ob.Vn$a */
    class C10866a implements Comparator<Map.Entry<String, String>> {
        C10866a(C10865Vn vn) {
        }

        public int compare(Object obj, Object obj2) {
            int length = C10585O2.m27106c((String) ((Map.Entry) obj).getValue()).length;
            int length2 = C10585O2.m27106c((String) ((Map.Entry) obj2).getValue()).length;
            if (length < length2) {
                return -1;
            }
            return length == length2 ? 0 : 1;
        }
    }

    public C10865Vn(int i, int i2, int i3) {
        this(i, new C10821Un(i2), new C10821Un(i3));
    }

    public C10865Vn(int i, C10821Un un, C10821Un un2) {
        super(i);
        this.f26137d = new C10866a(this);
        this.f26135b = un;
        this.f26136c = un2;
    }

    /* renamed from: a */
    public C10682Qn<Map<String, String>, C10349Hn> mo62210a(Map<String, String> map) {
        int i;
        HashMap hashMap;
        int i2 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f26137d);
            int length = entryArr.length;
            i = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i2 < length) {
                Map.Entry entry = entryArr[i2];
                C10682Qn<String, C10265Fn> a = this.f26135b.mo62210a((String) entry.getKey());
                C10682Qn<String, C10265Fn> a2 = this.f26136c.mo62210a((String) entry.getValue());
                int length2 = C10585O2.m27106c((String) entry.getKey()).length + C10585O2.m27106c((String) entry.getValue()).length;
                int length3 = C10585O2.m27106c((String) a.f25555a).length + C10585O2.m27106c((String) a2.f25555a).length;
                if (z || length3 + i4 > mo62209a()) {
                    i3++;
                    i += length2;
                    z = true;
                } else {
                    i = i + a.f25556b.mo61250a() + a2.f25556b.mo61250a();
                    i4 += C10585O2.m27106c((String) a.f25555a).length + C10585O2.m27106c((String) a2.f25555a).length;
                    hashMap.put(a.f25555a, a2.f25555a);
                }
                i2++;
            }
            i2 = i3;
        } else {
            hashMap = null;
            i = 0;
        }
        return new C10682Qn<>(hashMap, new C10349Hn(i2, i));
    }
}
