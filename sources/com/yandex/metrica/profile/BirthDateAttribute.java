package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10137Bf;
import com.yandex.metrica.impl.p265ob.C10164Cf;
import com.yandex.metrica.impl.p265ob.C10190Df;
import com.yandex.metrica.impl.p265ob.C10223Ef;
import com.yandex.metrica.impl.p265ob.C10339Hf;
import com.yandex.metrica.impl.p265ob.C10381In;
import com.yandex.metrica.impl.p265ob.C11572no;
import com.yandex.metrica.impl.p265ob.C11683qf;
import com.yandex.metrica.impl.p265ob.C11749sf;
import com.yandex.metrica.impl.p265ob.C11850vf;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class BirthDateAttribute {

    /* renamed from: a */
    private final C11850vf f28993a = new C11850vf("appmetrica_birth_date", new C11572no(), new C10190Df());

    BirthDateAttribute() {
    }

    /* renamed from: a */
    private Calendar m31176a(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return gregorianCalendar;
    }

    public UserProfileUpdate<? extends C10339Hf> withAge(int i) {
        return mo64297a(m31176a(Calendar.getInstance(Locale.US).get(1) - i), "yyyy", (C11683qf) new C11749sf(this.f28993a.mo63845c()));
    }

    public UserProfileUpdate<? extends C10339Hf> withAgeIfUndefined(int i) {
        return mo64297a(m31176a(Calendar.getInstance(Locale.US).get(1) - i), "yyyy", (C11683qf) new C10164Cf(this.f28993a.mo63845c()));
    }

    public UserProfileUpdate<? extends C10339Hf> withBirthDate(int i) {
        return mo64297a(m31176a(i), "yyyy", (C11683qf) new C11749sf(this.f28993a.mo63845c()));
    }

    public UserProfileUpdate<? extends C10339Hf> withBirthDateIfUndefined(int i) {
        return mo64297a(m31176a(i), "yyyy", (C11683qf) new C10164Cf(this.f28993a.mo63845c()));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueReset() {
        return new UserProfileUpdate<>(new C10137Bf(0, this.f28993a.mo63843a(), new C11572no(), new C10190Df()));
    }

    public UserProfileUpdate<? extends C10339Hf> withBirthDate(int i, int i2) {
        return mo64297a(m31177a(i, i2), "yyyy-MM", (C11683qf) new C11749sf(this.f28993a.mo63845c()));
    }

    /* renamed from: a */
    private Calendar m31177a(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return gregorianCalendar;
    }

    public UserProfileUpdate<? extends C10339Hf> withBirthDateIfUndefined(int i, int i2) {
        return mo64297a(m31177a(i, i2), "yyyy-MM", (C11683qf) new C10164Cf(this.f28993a.mo63845c()));
    }

    public UserProfileUpdate<? extends C10339Hf> withBirthDate(int i, int i2, int i3) {
        return mo64297a(m31178a(i, i2, i3), "yyyy-MM-dd", (C11683qf) new C11749sf(this.f28993a.mo63845c()));
    }

    /* renamed from: a */
    private Calendar m31178a(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return gregorianCalendar;
    }

    public UserProfileUpdate<? extends C10339Hf> withBirthDateIfUndefined(int i, int i2, int i3) {
        return mo64297a(m31178a(i, i2, i3), "yyyy-MM-dd", (C11683qf) new C10164Cf(this.f28993a.mo63845c()));
    }

    public UserProfileUpdate<? extends C10339Hf> withBirthDate(Calendar calendar) {
        return mo64297a(calendar, "yyyy-MM-dd", (C11683qf) new C11749sf(this.f28993a.mo63845c()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public UserProfileUpdate<? extends C10339Hf> mo64297a(Calendar calendar, String str, C11683qf qfVar) {
        return new UserProfileUpdate<>(new C10223Ef(this.f28993a.mo63843a(), new SimpleDateFormat(str).format(calendar.getTime()), new C10381In(), new C11572no(), qfVar));
    }

    public UserProfileUpdate<? extends C10339Hf> withBirthDateIfUndefined(Calendar calendar) {
        return mo64297a(calendar, "yyyy-MM-dd", (C11683qf) new C10164Cf(this.f28993a.mo63845c()));
    }
}
