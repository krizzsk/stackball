package com.yandex.metrica.impl.p265ob;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.text.Typography;

/* renamed from: com.yandex.metrica.impl.ob.f */
public final class C11220f {
    /* renamed from: a */
    public static <T extends C11169e> String m28897a(T t) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m28899a((String) null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    /* renamed from: a */
    private static void m28899a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        int i;
        if (obj != null) {
            if (obj instanceof C11169e) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(m28898a(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if ((modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray()) {
                            m28899a(name, obj2, stringBuffer, stringBuffer2);
                        } else if (type.getComponentType() == Byte.TYPE) {
                            m28899a(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            if (obj2 == null) {
                                i = 0;
                            } else {
                                i = Array.getLength(obj2);
                            }
                            for (int i2 = 0; i2 < i; i2++) {
                                m28899a(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has" + substring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                m28899a(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                    return;
                }
                return;
            }
            String a = m28898a(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(a);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.startsWith("http") && str2.length() > 200) {
                    str2 = str2.substring(0, 200) + "[...]";
                }
                int length2 = str2.length();
                StringBuilder sb = new StringBuilder(length2);
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt = str2.charAt(i3);
                    if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                        sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    } else {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                stringBuffer2.append("\"");
                stringBuffer2.append(sb2);
                stringBuffer2.append("\"");
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                stringBuffer2.append(Typography.quote);
                for (byte b : bArr) {
                    byte b2 = b & 255;
                    if (b2 == 92 || b2 == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append((char) b2);
                    } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                        stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(b2)}));
                    } else {
                        stringBuffer2.append((char) b2);
                    }
                }
                stringBuffer2.append(Typography.quote);
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    /* renamed from: a */
    private static String m28898a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
