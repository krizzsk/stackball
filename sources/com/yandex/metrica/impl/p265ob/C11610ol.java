package com.yandex.metrica.impl.p265ob;

import android.os.Build;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import com.yandex.metrica.impl.p265ob.C10893Wl;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ol */
public class C11610ol implements C10263Fl {

    /* renamed from: a */
    private final Set<Class> f27866a;

    public C11610ol() {
        HashSet hashSet = new HashSet();
        this.f27866a = hashSet;
        hashSet.add(EditText.class);
        hashSet.add(Chronometer.class);
        hashSet.add(DigitalClock.class);
        if (Build.VERSION.SDK_INT >= 17) {
            hashSet.add(TextClock.class);
        }
        hashSet.add(RadioButton.class);
        hashSet.add(CheckBox.class);
    }

    /* renamed from: a */
    public boolean mo61157a(Object obj) {
        TextView textView = (TextView) obj;
        for (Class isInstance : this.f27866a) {
            if (isInstance.isInstance(textView)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C10893Wl.C10895b mo61156a() {
        return C10893Wl.C10895b.IRRELEVANT_CLASS;
    }
}
