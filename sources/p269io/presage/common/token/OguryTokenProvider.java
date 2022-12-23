package p269io.presage.common.token;

import android.content.Context;
import android.util.Base64;
import com.ogury.p245ed.internal.C8132dc;
import com.ogury.p245ed.internal.C8165dq;
import com.ogury.p245ed.internal.C8212ez;
import com.ogury.p245ed.internal.C8216fa;
import com.ogury.p245ed.internal.C8238fs;
import com.ogury.p245ed.internal.C8244fx;
import com.ogury.p245ed.internal.C8467mq;
import com.ogury.p245ed.internal.C8506nz;

/* renamed from: io.presage.common.token.OguryTokenProvider */
public final class OguryTokenProvider {

    /* renamed from: a */
    public static final OguryTokenProvider f44185a = new OguryTokenProvider();

    private OguryTokenProvider() {
    }

    public static final String getBidderToken(Context context) {
        C8467mq.m23881b(context, "context");
        String jSONObject = new C8238fs(new C8216fa(context), new C8212ez(context), new C8244fx(context), C8132dc.f21070a, new C8165dq(context).mo53312a()).mo53565a().mo53561a().toString();
        C8467mq.m23878a((Object) jSONObject, "tokenBuilder.build().serializedJson.toString()");
        byte[] bytes = jSONObject.getBytes(C8506nz.f21713a);
        C8467mq.m23878a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        C8467mq.m23878a((Object) encodeToString, "encodeToString(token.toB…eArray(), Base64.NO_WRAP)");
        return encodeToString;
    }
}
