package com.facebook.appevents.p028ml;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo72093d2 = {"Lcom/facebook/appevents/ml/Utils;", "", "()V", "DIR_NAME", "", "getMlDir", "Ljava/io/File;", "normalizeString", "str", "parseModelWeights", "", "Lcom/facebook/appevents/ml/MTensor;", "file", "vectorize", "", "texts", "maxLen", "", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.ml.Utils */
/* compiled from: Utils.kt */
public final class Utils {
    private static final String DIR_NAME = "facebook_ml/";
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public final int[] vectorize(String str, int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "texts");
            int[] iArr = new int[i];
            String normalizeString = normalizeString(str);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-8\")");
            if (normalizeString != null) {
                byte[] bytes = normalizeString.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 < bytes.length) {
                        iArr[i2] = bytes[i2] & 255;
                    } else {
                        iArr[i2] = 0;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    public static final File getMlDir() {
        Class<Utils> cls = Utils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "FacebookSdk.getApplicationContext()");
            File file = new File(applicationContext.getFilesDir(), DIR_NAME);
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final Map<String, MTensor> parseModelWeights(File file) {
        File file2 = file;
        Class<Utils> cls = Utils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(file2, "file");
            try {
                InputStream fileInputStream = new FileInputStream(file2);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                Intrinsics.checkNotNullExpressionValue(wrap, "bb");
                int i2 = wrap.getInt();
                int i3 = i2 + 4;
                if (available < i3) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, Charsets.UTF_8));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i4 = 0; i4 < length; i4++) {
                    strArr[i4] = names.getString(i4);
                }
                ArraysKt.sort((T[]) strArr);
                HashMap hashMap = new HashMap();
                int i5 = 0;
                while (i5 < length) {
                    String str = strArr[i5];
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i6 = 1;
                        while (i < length2) {
                            iArr[i] = jSONArray.getInt(i);
                            i6 *= iArr[i];
                            i++;
                        }
                        int i7 = i6 * 4;
                        int i8 = i3 + i7;
                        if (i8 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i7);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        MTensor mTensor = new MTensor(iArr);
                        wrap2.asFloatBuffer().get(mTensor.getData(), 0, i6);
                        hashMap.put(str, mTensor);
                        i3 = i8;
                    }
                    i5++;
                    i = 0;
                }
                return hashMap;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public final String normalizeString(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            CharSequence charSequence = str;
            int length = charSequence.length() - 1;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i > length) {
                    break;
                }
                boolean z2 = Intrinsics.compare((int) charSequence.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new Regex("\\s+").split(charSequence.subSequence(i, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                Intrinsics.checkNotNullExpressionValue(join, "TextUtils.join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
