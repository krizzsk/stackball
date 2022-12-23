package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.p036b.C2773a;
import com.fyber.inneractive.sdk.config.p036b.C2774b;
import com.fyber.inneractive.sdk.config.p036b.C2775c;
import com.fyber.inneractive.sdk.config.p036b.C2778d;
import com.fyber.inneractive.sdk.config.p036b.C2779e;
import com.fyber.inneractive.sdk.config.p036b.C2780f;
import com.fyber.inneractive.sdk.config.p036b.C2781g;
import com.fyber.inneractive.sdk.config.p036b.C2782h;
import com.fyber.inneractive.sdk.config.p036b.C2783i;
import com.fyber.inneractive.sdk.config.p036b.C2784j;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.p029a.C2681a;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.c */
public final class C2785c implements C2681a<IAConfigManager.C2736a> {

    /* renamed from: a */
    private boolean f6573a = false;

    /* renamed from: a */
    public final String mo17886a() {
        return "IALastModifiedFromHeader";
    }

    /* renamed from: b */
    public final String mo17888b() {
        return "inneractive.config";
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17887a(Object obj) {
        IAConfigManager.C2736a aVar = (IAConfigManager.C2736a) obj;
        if (aVar != null && aVar.f6457a != null) {
            C3657l.m9125p().getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", aVar.f6457a).apply();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public IAConfigManager.C2736a mo17885a(String str) throws Exception {
        C2778d dVar;
        try {
            IAConfigManager.m5936g().mo18026a();
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("updateHash", (String) null);
            if (TextUtils.isEmpty(optString)) {
                dVar = null;
            } else {
                dVar = new C2778d();
                dVar.f6540c = optString;
                JSONObject optJSONObject = jSONObject.optJSONObject(TapjoyConstants.TJC_APP_PLACEMENT);
                int optInt = optJSONObject.optInt("id", -1);
                if (optJSONObject == null || optInt == -1) {
                    throw new InvalidAppIdException();
                }
                C2773a aVar = new C2773a();
                aVar.f6526a = String.valueOf(optInt);
                aVar.f6527b = optJSONObject.optString("publisherId", (String) null);
                aVar.f6528c = C2779e.m6050a(optJSONObject.optJSONObject("monitor"));
                aVar.f6529d = C2783i.m6056a(optJSONObject.optJSONObject("video"));
                aVar.f6530e = C2774b.m6046a(optJSONObject.optJSONObject("display"));
                aVar.f6531f = C2784j.m6057a(optJSONObject.optJSONObject("viewability"));
                aVar.f6533h = optJSONObject.optString("isActive", (String) null);
                aVar.f6532g = C2780f.m6051a(optJSONObject.optJSONObject("native"));
                dVar.f6538a = aVar;
                dVar.f6539b = C2778d.m6049a(jSONObject);
            }
            String str2 = IAConfigManager.f6419n.f6432d;
            if (dVar == null || !str2.equals(dVar.f6538a.f6526a)) {
                IAlog.m9037e("internal error while parsing local configuration", new Object[0]);
                if (dVar != null) {
                    if (!str2.equals(dVar.f6538a.f6526a)) {
                        throw new InvalidAppIdException();
                    }
                }
                m6060a((Throwable) null, str);
                return null;
            }
            dVar.f6541d = str;
            return m6058a(dVar);
        } catch (Throwable th) {
            m6060a(th, str);
            IAlog.m9037e("Exception Error while parsing local configuration", new Object[0]);
            throw th;
        }
    }

    /* renamed from: a */
    private void m6060a(Throwable th, String str) {
        String str2;
        String str3;
        String str4;
        if (!this.f6573a) {
            this.f6573a = true;
            if (!TextUtils.isEmpty(str)) {
                str2 = str.substring(0, str.length() > 501 ? TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL : str.length() - 1);
            } else {
                str2 = "Empty Json Data";
            }
            if (th != null) {
                str4 = th.getClass().getName();
                str3 = th.getLocalizedMessage();
            } else {
                str4 = "Bad remote configuration";
                str3 = "Internal error";
            }
            String str5 = IAConfigManager.f6419n.f6432d;
            C2968n.C2969a aVar = new C2968n.C2969a(C2966l.FATAL_CONFIGURATION_ERROR);
            Object[] objArr = new Object[8];
            objArr[0] = "exception";
            if (str4 == null) {
                str4 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            objArr[1] = str4;
            objArr[2] = "message";
            if (str3 == null) {
                str3 = "No message";
            }
            objArr[3] = str3;
            objArr[4] = "data";
            objArr[5] = str2;
            objArr[6] = "appId";
            if (TextUtils.isEmpty(str5)) {
                str5 = "EMPTY_APP_ID";
            }
            objArr[7] = str5;
            aVar.mo18435a(objArr).mo18436b((String) null);
        }
    }

    /* renamed from: d */
    public final boolean mo17890d() {
        String string = C3657l.m9125p().getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", (String) null);
        if (string == null || !string.equalsIgnoreCase(IAConfigManager.m5945p())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static IAConfigManager.C2736a m6058a(C2778d dVar) {
        boolean z;
        IAConfigManager.C2736a aVar;
        Iterator<C2782h> it;
        Iterator<C2781g> it2;
        Map<String, C2807s> map;
        Set<Track> set;
        Integer num;
        Integer num2;
        Set<Vendor> set2;
        char c;
        Set<Vendor> set3;
        char c2;
        Boolean bool;
        Integer num3;
        Integer num4;
        Boolean bool2;
        Orientation orientation;
        Integer num5;
        Integer num6;
        Skip skip;
        TapAction tapAction;
        int i;
        TapAction tapAction2;
        Integer num7;
        Integer num8;
        Boolean bool3;
        Boolean bool4;
        Integer num9;
        Integer num10;
        String b;
        C2778d dVar2 = dVar;
        IAConfigManager.C2736a aVar2 = new IAConfigManager.C2736a();
        aVar2.f6459c = dVar2.f6540c;
        aVar2.f6458b = dVar2.f6538a.f6527b;
        aVar2.f6460d = dVar2.f6541d;
        aVar2.f6457a = dVar2.f6538a.f6526a;
        Iterator<C2781g> it3 = dVar2.f6539b.iterator();
        while (it3.hasNext()) {
            C2781g next = it3.next();
            Map<String, C2807s> map2 = aVar2.f6461e;
            String str = next.f6544a;
            C2773a aVar3 = dVar2.f6538a;
            Map<String, C2808t> map3 = aVar2.f6462f;
            IAConfigManager.C2738c cVar = aVar2.f6463g;
            C2807s sVar = new C2807s();
            sVar.f6640a = next.f6544a;
            int i2 = 2;
            C2775c.C2776a[] aVarArr = {aVar3, next};
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    C2775c.C2776a aVar4 = aVarArr[i3];
                    if (aVar4 != null && (b = aVar4.mo18025b()) != null && b.equals("false")) {
                        z = false;
                        break;
                    }
                    i3++;
                    i2 = 2;
                } else {
                    z = true;
                    break;
                }
            }
            sVar.f6642c = z;
            Iterator<C2782h> it4 = next.f6551h.iterator();
            while (it4.hasNext()) {
                C2782h next2 = it4.next();
                C2808t tVar = new C2808t();
                if (next2.f6552a == null || next2.f6553b == null) {
                    IAConfigManager.C2736a aVar5 = aVar2;
                    Iterator<C2781g> it5 = it3;
                    C2778d dVar3 = dVar;
                } else {
                    tVar.f6643a = next2.f6552a;
                    tVar.f6644b = next2.f6553b;
                    if (next2.f6556e != null) {
                        C2806r rVar = new C2806r();
                        if (next2.f6556e.f6543a == UnitDisplayType.DEFAULT) {
                            rVar.f6639a = next2.f6556e.f6543a;
                            tVar.f6647e = rVar;
                        }
                    }
                    if (next2.f6554c != null) {
                        C2774b bVar = next2.f6554c;
                        C2774b bVar2 = next.f6546c;
                        C2774b bVar3 = aVar3.f6530e;
                        C2800n nVar = new C2800n();
                        it2 = it3;
                        it = it4;
                        if (bVar.f6534a == UnitDisplayType.BANNER || bVar.f6534a == UnitDisplayType.MRECT || bVar.f6534a.isFullscreenUnit()) {
                            nVar.f6633b = bVar.f6534a;
                            Object[] objArr = new Object[3];
                            objArr[0] = bVar.f6536c;
                            if (bVar2 != null) {
                                num7 = bVar2.f6536c;
                            } else {
                                num7 = null;
                            }
                            objArr[1] = num7;
                            if (bVar3 != null) {
                                num8 = bVar3.f6536c;
                            } else {
                                num8 = null;
                            }
                            objArr[2] = num8;
                            Integer num11 = (Integer) m6059a((Object) null, objArr);
                            aVar = aVar2;
                            if (num11 != null && num11.intValue() >= 5 && num11.intValue() <= 60) {
                                nVar.f6632a = num11;
                            }
                            Object[] objArr2 = new Object[3];
                            objArr2[0] = bVar.f6535b;
                            if (bVar2 != null) {
                                bool3 = bVar2.f6535b;
                            } else {
                                bool3 = null;
                            }
                            objArr2[1] = bool3;
                            if (bVar3 != null) {
                                bool4 = bVar3.f6535b;
                            } else {
                                bool4 = null;
                            }
                            objArr2[2] = bool4;
                            nVar.mo18058a(((Boolean) m6059a((Object) true, objArr2)).booleanValue());
                            Object[] objArr3 = new Object[3];
                            objArr3[0] = bVar.f6537d;
                            if (bVar2 != null) {
                                num9 = bVar2.f6537d;
                            } else {
                                num9 = null;
                            }
                            objArr3[1] = num9;
                            if (bVar3 != null) {
                                num10 = bVar3.f6537d;
                            } else {
                                num10 = null;
                            }
                            objArr3[2] = num10;
                            Integer num12 = (Integer) m6059a((Object) null, objArr3);
                            if (num12 != null && num12.intValue() >= 5 && num12.intValue() <= 60) {
                                nVar.f6635d = num12;
                            }
                            if (nVar.f6635d == null && !nVar.f6634c.booleanValue() && (bVar.f6534a == UnitDisplayType.INTERSTITIAL || bVar.f6534a == UnitDisplayType.REWARDED)) {
                                nVar.mo18058a(true);
                            }
                            tVar.f6645c = nVar;
                        } else {
                            C2778d dVar4 = dVar;
                            it3 = it2;
                            it4 = it;
                        }
                    } else {
                        aVar = aVar2;
                        it2 = it3;
                        it = it4;
                    }
                    if (next2.f6557f != null) {
                        if (next2.f6557f.f6568j == UnitDisplayType.REWARDED && next2.f6554c == null) {
                            tVar.f6645c = new C2800n();
                            tVar.f6645c.mo18058a(false);
                            tVar.f6645c.f6635d = -1;
                            tVar.f6645c.f6633b = UnitDisplayType.REWARDED;
                            tVar.f6645c.f6632a = -1;
                        }
                        C2810v vVar = new C2810v();
                        C2783i iVar = next2.f6557f;
                        C2783i iVar2 = next.f6549f;
                        C2783i iVar3 = aVar3.f6529d;
                        if (iVar.f6568j == UnitDisplayType.LANDSCAPE || iVar.f6568j == UnitDisplayType.SQUARE || iVar.f6568j == UnitDisplayType.INTERSTITIAL || iVar.f6568j == UnitDisplayType.VERTICAL || iVar.f6568j == UnitDisplayType.REWARDED || iVar.f6568j == UnitDisplayType.MRECT) {
                            vVar.f6659j = iVar.f6568j;
                        } else {
                            if (tVar.f6647e != null) {
                                vVar.f6659j = UnitDisplayType.INTERSTITIAL;
                            }
                            C2778d dVar5 = dVar;
                            it3 = it2;
                            it4 = it;
                            aVar2 = aVar;
                        }
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iVar.f6559a;
                        objArr4[1] = iVar2 != null ? iVar2.f6559a : null;
                        if (iVar3 != null) {
                            bool = iVar3.f6559a;
                        } else {
                            bool = null;
                        }
                        objArr4[2] = bool;
                        Object a = m6059a((Object) null, objArr4);
                        if (a != null) {
                            vVar.f6650a = (Boolean) a;
                            Object[] objArr5 = new Object[3];
                            objArr5[0] = iVar.f6560b;
                            objArr5[1] = iVar2 != null ? iVar2.f6560b : null;
                            if (iVar3 != null) {
                                num3 = iVar3.f6560b;
                            } else {
                                num3 = null;
                            }
                            objArr5[2] = num3;
                            vVar.f6651b = (Integer) m6059a((Object) 5000, objArr5);
                            map = map2;
                            Object[] objArr6 = new Object[3];
                            objArr6[0] = iVar.f6561c;
                            objArr6[1] = iVar2 != null ? iVar2.f6561c : null;
                            if (iVar3 != null) {
                                num4 = iVar3.f6561c;
                            } else {
                                num4 = null;
                            }
                            objArr6[2] = num4;
                            Integer num13 = (Integer) m6059a((Object) 0, objArr6);
                            vVar.f6652c = Integer.valueOf(num13.intValue() < 0 ? 0 : num13.intValue());
                            Object[] objArr7 = new Object[3];
                            objArr7[0] = iVar.f6563e;
                            objArr7[1] = iVar2 != null ? iVar2.f6563e : null;
                            if (iVar3 != null) {
                                bool2 = iVar3.f6563e;
                            } else {
                                bool2 = null;
                            }
                            objArr7[2] = bool2;
                            vVar.f6653d = (Boolean) m6059a((Object) true, objArr7);
                            Orientation orientation2 = Orientation.USER;
                            Object[] objArr8 = new Object[3];
                            objArr8[0] = iVar.f6565g;
                            objArr8[1] = iVar2 != null ? iVar2.f6565g : null;
                            if (iVar3 != null) {
                                orientation = iVar3.f6565g;
                            } else {
                                orientation = null;
                            }
                            objArr8[2] = orientation;
                            vVar.f6654e = (Orientation) m6059a((Object) orientation2, objArr8);
                            Object[] objArr9 = new Object[3];
                            objArr9[0] = iVar.f6567i;
                            objArr9[1] = iVar2 != null ? iVar2.f6567i : null;
                            if (iVar3 != null) {
                                num5 = iVar3.f6567i;
                            } else {
                                num5 = null;
                            }
                            objArr9[2] = num5;
                            Integer num14 = (Integer) m6059a((Object) 0, objArr9);
                            vVar.f6655f = Integer.valueOf(num14.intValue() < 0 ? 0 : num14.intValue());
                            Object[] objArr10 = new Object[3];
                            objArr10[0] = iVar.f6566h;
                            objArr10[1] = iVar2 != null ? iVar2.f6566h : null;
                            if (iVar3 != null) {
                                num6 = iVar3.f6566h;
                            } else {
                                num6 = null;
                            }
                            objArr10[2] = num6;
                            Integer num15 = (Integer) m6059a((Object) 2048, objArr10);
                            if (num15.intValue() > vVar.f6651b.intValue()) {
                                num15 = vVar.f6651b;
                            }
                            vVar.f6656g = num15;
                            Skip skip2 = Skip._0;
                            Object[] objArr11 = new Object[3];
                            objArr11[0] = iVar.f6562d;
                            objArr11[1] = iVar2 != null ? iVar2.f6562d : null;
                            if (iVar3 != null) {
                                skip = iVar3.f6562d;
                            } else {
                                skip = null;
                            }
                            objArr11[2] = skip;
                            vVar.f6657h = (Skip) m6059a((Object) skip2, objArr11);
                            TapAction tapAction3 = TapAction.DO_NOTHING;
                            Object[] objArr12 = new Object[3];
                            objArr12[0] = iVar.f6564f;
                            if (iVar2 != null) {
                                tapAction = iVar2.f6564f;
                                i = 1;
                            } else {
                                i = 1;
                                tapAction = null;
                            }
                            objArr12[i] = tapAction;
                            if (iVar3 != null) {
                                tapAction2 = iVar3.f6564f;
                            } else {
                                tapAction2 = null;
                            }
                            objArr12[2] = tapAction2;
                            vVar.f6658i = (TapAction) m6059a((Object) tapAction3, objArr12);
                            ArrayList arrayList = new ArrayList();
                            C2775c.C2777b[] bVarArr = new C2775c.C2777b[i];
                            bVarArr[0] = next2;
                            vVar.mo18074a(arrayList, bVarArr);
                            tVar.f6648f = vVar;
                        }
                        C2778d dVar52 = dVar;
                        it3 = it2;
                        it4 = it;
                        aVar2 = aVar;
                    } else {
                        map = map2;
                    }
                    C2805q qVar = new C2805q();
                    HashSet hashSet = new HashSet();
                    Object[] objArr13 = new Object[3];
                    objArr13[0] = next2.f6555d != null ? next2.f6555d.f6542a : null;
                    objArr13[1] = next.f6547d != null ? next.f6547d.f6542a : null;
                    if (aVar3.f6528c != null) {
                        set = aVar3.f6528c.f6542a;
                    } else {
                        set = null;
                    }
                    objArr13[2] = set;
                    qVar.f6638a = (Set) m6059a((Object) hashSet, objArr13);
                    tVar.f6646d = qVar;
                    C2812x xVar = new C2812x();
                    C2784j jVar = next2.f6558g;
                    C2784j jVar2 = next.f6550g;
                    C2784j jVar3 = aVar3.f6531f;
                    Object[] objArr14 = new Object[3];
                    objArr14[0] = jVar != null ? jVar.f6570a : null;
                    objArr14[1] = jVar2 != null ? jVar2.f6570a : null;
                    if (jVar3 != null) {
                        num = jVar3.f6570a;
                    } else {
                        num = null;
                    }
                    objArr14[2] = num;
                    Integer num16 = (Integer) m6059a((Object) 1, objArr14);
                    if (num16.intValue() > 0 || num16.intValue() <= 100) {
                        xVar.f6661a = num16;
                    } else {
                        xVar.f6661a = 1;
                    }
                    Object[] objArr15 = new Object[3];
                    objArr15[0] = jVar != null ? jVar.f6571b : null;
                    objArr15[1] = jVar2 != null ? jVar2.f6571b : null;
                    if (jVar3 != null) {
                        num2 = jVar3.f6571b;
                    } else {
                        num2 = null;
                    }
                    objArr15[2] = num2;
                    Integer num17 = (Integer) m6059a((Object) 0, objArr15);
                    if (num17.intValue() >= 0 || num17.intValue() <= 100) {
                        xVar.f6662b = num17;
                    } else {
                        xVar.f6662b = 0;
                    }
                    HashSet hashSet2 = new HashSet();
                    Object[] objArr16 = new Object[3];
                    objArr16[0] = jVar != null ? jVar.f6572c : null;
                    if (jVar2 != null) {
                        set2 = jVar2.f6572c;
                        c = 1;
                    } else {
                        c = 1;
                        set2 = null;
                    }
                    objArr16[c] = set2;
                    if (jVar3 != null) {
                        set3 = jVar3.f6572c;
                        c2 = 2;
                    } else {
                        c2 = 2;
                        set3 = null;
                    }
                    objArr16[c2] = set3;
                    xVar.f6663c = (Set) m6059a((Object) hashSet2, objArr16);
                    tVar.f6649g = xVar;
                    if (cVar != null) {
                        cVar.mo17977a(xVar.f6663c);
                    }
                    sVar.f6641b.add(tVar);
                    map3.put(tVar.f6643a, tVar);
                    C2778d dVar6 = dVar;
                    it3 = it2;
                    it4 = it;
                    map2 = map;
                    aVar2 = aVar;
                }
            }
            IAConfigManager.C2736a aVar6 = aVar2;
            Iterator<C2781g> it6 = it3;
            map2.put(str, sVar);
            dVar2 = dVar;
        }
        return aVar2;
    }

    /* renamed from: a */
    private static Object m6059a(Object obj, Object... objArr) {
        for (int i = 0; i < 3; i++) {
            Object obj2 = objArr[i];
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final String mo17889c() {
        String str = IAConfigManager.f6419n.f6432d;
        StringBuilder sb = new StringBuilder("https://");
        String g = C2788f.m6079g();
        if (TextUtils.isEmpty(g)) {
            sb.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb.append(g);
        }
        sb.append(str);
        sb.append('/');
        sb.append(str);
        sb.append(".json");
        String sb2 = sb.toString();
        IAlog.m9030a(IAlog.f9871b, "%s: %s", "APP_CONFIG_REQUEST", sb2);
        return sb2;
    }
}
