package com.p243my.target;

import com.p243my.target.common.models.ImageData;
import java.util.List;

/* renamed from: com.my.target.p1 */
public class C7596p1 {

    /* renamed from: a */
    public final ImageData f19163a;

    /* renamed from: b */
    public final String f19164b;

    /* renamed from: c */
    public List<C7597a> f19165c;

    /* renamed from: com.my.target.p1$a */
    public static class C7597a {

        /* renamed from: a */
        public final String f19166a;

        /* renamed from: b */
        public final String f19167b;

        /* renamed from: c */
        public final String f19168c;

        /* renamed from: d */
        public final boolean f19169d;

        public C7597a(String str, String str2, String str3, boolean z) {
            this.f19166a = str;
            this.f19167b = str2;
            this.f19168c = str3;
            this.f19169d = z;
        }

        /* renamed from: a */
        public static C7597a m20061a(String str, String str2, String str3, boolean z) {
            return new C7597a(str, str2, str3, z);
        }
    }

    public C7596p1(ImageData imageData, String str) {
        this.f19163a = imageData;
        this.f19164b = str;
    }

    /* renamed from: a */
    public static C7596p1 m20056a(ImageData imageData, String str) {
        return new C7596p1(imageData, str);
    }

    /* renamed from: a */
    public List<C7597a> mo51315a() {
        return this.f19165c;
    }

    /* renamed from: a */
    public void mo51316a(List<C7597a> list) {
        this.f19165c = list;
    }

    /* renamed from: b */
    public String mo51317b() {
        return this.f19164b;
    }

    /* renamed from: c */
    public ImageData mo51318c() {
        return this.f19163a;
    }
}
