package com.ogury.p244cm.internal;

import android.content.Context;
import com.appsflyer.internal.referrer.Payload;
import com.ogury.p244cm.ConsentActivity;

/* renamed from: com.ogury.cm.internal.aabbc */
public final class aabbc {

    /* renamed from: a */
    private final abccb f20345a = new abccb();

    /* renamed from: com.ogury.cm.internal.aabbc$aaaaa */
    public static final class aaaaa implements acabb {

        /* renamed from: a */
        final /* synthetic */ acabb f20346a;

        /* renamed from: com.ogury.cm.internal.aabbc$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C15671aaaaa extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f20347a;

            /* renamed from: b */
            final /* synthetic */ String f20348b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15671aaaaa(aaaaa aaaaa, String str) {
                super(0);
                this.f20347a = aaaaa;
                this.f20348b = str;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo52622a() {
                this.f20347a.f20346a.mo52619a(this.f20348b);
                return babcc.f20603a;
            }
        }

        /* renamed from: com.ogury.cm.internal.aabbc$aaaaa$aaaab */
        static final class aaaab extends bbaca implements bbaaa<babcc> {

            /* renamed from: a */
            final /* synthetic */ aaaaa f20349a;

            /* renamed from: b */
            final /* synthetic */ int f20350b;

            /* renamed from: c */
            final /* synthetic */ String f20351c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaab(aaaaa aaaaa, int i, String str) {
                super(0);
                this.f20349a = aaaaa;
                this.f20350b = i;
                this.f20351c = str;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo52622a() {
                this.f20349a.f20346a.mo52618a(this.f20350b, this.f20351c);
                return babcc.f20603a;
            }
        }

        aaaaa(acabb acabb) {
            this.f20346a = acabb;
        }

        /* renamed from: a */
        public final void mo52618a(int i, String str) {
            bbabc.m22051b(str, "error");
            abbac abbac = abbac.f20408a;
            abbac.m21817b().mo52670a(new aaaab(this, i, str));
        }

        /* renamed from: a */
        public final void mo52619a(String str) {
            bbabc.m22051b(str, Payload.RESPONSE);
            abbac abbac = abbac.f20408a;
            abbac.m21817b().mo52670a(new C15671aaaaa(this, str));
        }
    }

    /* renamed from: com.ogury.cm.internal.aabbc$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aabbc f20352a;

        /* renamed from: b */
        final /* synthetic */ aaacc f20353b;

        /* renamed from: c */
        final /* synthetic */ Context f20354c;

        /* renamed from: d */
        final /* synthetic */ String f20355d;

        /* renamed from: e */
        final /* synthetic */ String f20356e;

        /* renamed from: f */
        final /* synthetic */ acabb f20357f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(aabbc aabbc, aaacc aaacc, Context context, String str, String str2, acabb acabb) {
            super(0);
            this.f20352a = aabbc;
            this.f20353b = aaacc;
            this.f20354c = context;
            this.f20355d = str;
            this.f20356e = str2;
            this.f20357f = acabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            acabc acabc;
            String str;
            String str2;
            abcbc abcbc;
            acaba a = new acaba().mo52735a("POST");
            aaacc aaacc = this.f20353b;
            if (aaacc instanceof aabab) {
                acaca acaca = acaca.f20536a;
                acabc = acabc.EXTERNAL_TCF_CONSENT;
            } else if (aaacc instanceof aabaa) {
                acaca acaca2 = acaca.f20536a;
                acabc = acabc.EXTERNAL_BOOLEAN_CONSENT;
            } else {
                throw new babbb();
            }
            acaba c = a.mo52740c(acaca.m21936a(acabc));
            Context context = this.f20354c;
            String str3 = this.f20355d;
            String str4 = this.f20356e;
            aaacc aaacc2 = this.f20353b;
            new bacbb();
            bbabc.m22051b(context, "context");
            bbabc.m22051b(str3, "appKey");
            bbabc.m22051b(aaacc2, "externalConsentData");
            bbabc.m22051b(str4, "consentToken");
            if (aaacc2 instanceof aabab) {
                if (aaacc2 instanceof aabac) {
                    Context applicationContext = context.getApplicationContext();
                    bbabc.m22048a((Object) applicationContext, "context.applicationContext");
                    String packageName = applicationContext.getPackageName();
                    bbabc.m22048a((Object) packageName, "context.applicationContext.packageName");
                    String c2 = ConsentActivity.aaaaa.m21631c(context);
                    aabab aabab = (aabab) aaacc2;
                    String b = aabab.mo52648b();
                    Integer[] d = ((aabac) aaacc2).mo52650d();
                    String name = aabab.mo52649c().name();
                    String str5 = packageName;
                    String str6 = "3.3.0";
                    str = abcbc.mo52723a().mo52719a().toString();
                    str2 = "requestBodyBuilder.build…serializedJson.toString()";
                } else {
                    Context applicationContext2 = context.getApplicationContext();
                    bbabc.m22048a((Object) applicationContext2, "context.applicationContext");
                    String packageName2 = applicationContext2.getPackageName();
                    bbabc.m22048a((Object) packageName2, "context.applicationContext.packageName");
                    aabab aabab2 = (aabab) aaacc2;
                    new abcbc(str3, "android", packageName2, "3.3.0", ConsentActivity.aaaaa.m21631c(context), str4, (Boolean) null, aabab2.mo52648b(), (String) null, aabab2.mo52649c().name(), (Integer[]) null, 1344, (bbabb) null);
                    str = abcbc.mo52723a().mo52719a().toString();
                    str2 = "requestBodyBuilder.build…serializedJson.toString()";
                }
                bbabc.m22048a((Object) str, str2);
            } else if (aaacc2 instanceof aabaa) {
                Context applicationContext3 = context.getApplicationContext();
                bbabc.m22048a((Object) applicationContext3, "context.applicationContext");
                String packageName3 = applicationContext3.getPackageName();
                bbabc.m22048a((Object) packageName3, "context.applicationContext.packageName");
                aabaa aabaa = (aabaa) aaacc2;
                str = new abcbc(str3, "android", packageName3, "3.3.0", ConsentActivity.aaaaa.m21631c(context), str4, Boolean.valueOf(aabaa.mo52645a()), (String) null, aabaa.mo52646b(), aabba.MANUAL.name(), (Integer[]) null, 1152, (bbabb) null).mo52723a().mo52719a().toString();
                bbabc.m22048a((Object) str, "requestBodyBuilder.build…serializedJson.toString()");
            } else {
                throw new babbb();
            }
            abccb.m21912a(c.mo52738b(str).mo52734a(this.f20357f).mo52744f());
            return babcc.f20603a;
        }
    }

    /* renamed from: a */
    public final void mo52655a(Context context, String str, String str2, aaacc aaacc, acabb acabb) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        bbabc.m22051b(str2, "consentToken");
        bbabc.m22051b(aaacc, "externalConsentData");
        bbabc.m22051b(acabb, "requestCallback");
        abbac abbac = abbac.f20408a;
        abbac.m21816a().mo52670a(new aaaab(this, aaacc, context, str, str2, new aaaaa(acabb)));
    }
}
