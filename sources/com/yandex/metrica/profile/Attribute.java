package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10321Gn;
import com.yandex.metrica.impl.p265ob.C10380Im;
import com.yandex.metrica.impl.p265ob.C10581Nn;
import com.yandex.metrica.impl.p265ob.C11913wf;
import com.yandex.metrica.impl.p265ob.C11948xf;

public class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C11913wf(), new C11948xf(new C10321Gn(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C11913wf(), new C11948xf(new C10321Gn(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C11913wf(), new C11948xf(new C10321Gn(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C10581Nn(200, "String attribute \"" + str + "\"", C10380Im.m26607g()), new C11913wf(), new C11948xf(new C10321Gn(100)));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
