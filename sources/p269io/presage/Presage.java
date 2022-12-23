package p269io.presage;

import android.content.Context;
import com.ogury.sdk.Ogury;
import com.ogury.sdk.OguryConfiguration;

@Deprecated
/* renamed from: io.presage.Presage */
public class Presage {

    /* renamed from: a */
    private static Presage f44179a;

    @Deprecated
    public static Presage getInstance() {
        if (f44179a == null) {
            f44179a = new Presage();
        }
        return f44179a;
    }

    private Presage() {
    }

    @Deprecated
    public void start(String str, Context context) {
        Ogury.start(new OguryConfiguration.Builder(context, str).build());
    }
}
