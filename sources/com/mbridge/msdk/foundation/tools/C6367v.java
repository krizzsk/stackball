package com.mbridge.msdk.foundation.tools;

import com.google.android.exoplayer2.C3716C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: com.mbridge.msdk.foundation.tools.v */
/* compiled from: SerializeTools */
public final class C6367v {
    /* renamed from: a */
    public static String m16232a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.flush();
            objectOutputStream.close();
            return new String(byteArray, C3716C.ISO88591_NAME);
        } catch (IOException e) {
            C6361q.m16155a("SerializeTools", "IOException", e);
            return "";
        }
    }

    /* renamed from: a */
    public static Object m16231a(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(C3716C.ISO88591_NAME));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return readObject;
        } catch (Exception e) {
            C6361q.m16155a("SerializeTools", "Exception", e);
            return null;
        }
    }
}
