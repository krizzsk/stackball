package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p036b.C2775c;
import com.fyber.inneractive.sdk.config.p036b.C2783i;
import com.fyber.inneractive.sdk.util.C3623ae;
import com.fyber.inneractive.sdk.util.C3690v;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.v */
public final class C2810v implements C2811w, C3623ae.C3624a {

    /* renamed from: a */
    Boolean f6650a = true;

    /* renamed from: b */
    public Integer f6651b = 5000;

    /* renamed from: c */
    public Integer f6652c = 0;

    /* renamed from: d */
    Boolean f6653d = true;

    /* renamed from: e */
    Orientation f6654e;

    /* renamed from: f */
    Integer f6655f = 0;

    /* renamed from: g */
    public Integer f6656g = 2048;

    /* renamed from: h */
    Skip f6657h = Skip.fromValue(0);

    /* renamed from: i */
    TapAction f6658i;

    /* renamed from: j */
    public UnitDisplayType f6659j;

    /* renamed from: k */
    public List<Integer> f6660k = new ArrayList();

    /* renamed from: a */
    public final Boolean mo18073a() {
        return this.f6650a;
    }

    /* renamed from: b */
    public final Boolean mo18075b() {
        return this.f6653d;
    }

    /* renamed from: d */
    public final Orientation mo18076d() {
        return this.f6654e;
    }

    /* renamed from: e */
    public final Integer mo18077e() {
        return this.f6655f;
    }

    /* renamed from: f */
    public final Skip mo18078f() {
        return this.f6657h;
    }

    /* renamed from: g */
    public final TapAction mo18079g() {
        return this.f6658i;
    }

    /* renamed from: h */
    public final UnitDisplayType mo18080h() {
        return this.f6659j;
    }

    /* renamed from: i */
    public final boolean mo18081i() {
        return C3690v.m9190a(this.f6659j);
    }

    /* renamed from: a */
    public final void mo18074a(List<Integer> list, C2775c.C2777b... bVarArr) {
        int i = 0;
        while (true) {
            if (i <= 0) {
                C2783i a = bVarArr[0].mo18024a();
                if (a != null && a.f6569k != null && a.f6569k.size() > 0) {
                    list = a.f6569k;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        this.f6660k = list;
    }

    /* renamed from: c */
    public final JSONObject mo18060c() {
        JSONObject jSONObject = new JSONObject();
        C3623ae.m9046a(jSONObject, "autoPlay", this.f6650a);
        C3623ae.m9046a(jSONObject, MediaFile.MAX_BITRATE, this.f6651b);
        C3623ae.m9046a(jSONObject, MediaFile.MIN_BITRATE, this.f6652c);
        C3623ae.m9046a(jSONObject, "muted", this.f6653d);
        C3623ae.m9046a(jSONObject, "orientation", this.f6654e);
        C3623ae.m9046a(jSONObject, "padding", this.f6655f);
        C3623ae.m9046a(jSONObject, "pivotBitrate", this.f6656g);
        C3623ae.m9046a(jSONObject, "skip", this.f6657h);
        C3623ae.m9046a(jSONObject, "tapAction", this.f6658i);
        C3623ae.m9046a(jSONObject, "unitDisplayType", this.f6659j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f6660k;
        if (list != null) {
            for (Integer next : list) {
                if (next != null) {
                    jSONArray.put(next);
                }
            }
        }
        C3623ae.m9046a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
