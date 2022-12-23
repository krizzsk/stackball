package com.inmobi.media;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hm */
/* compiled from: JSONConverter */
public class C5352hm<T> {

    /* renamed from: a */
    private static final String f12267a = C5352hm.class.getSimpleName();

    /* renamed from: b */
    private static boolean f12268b;

    /* renamed from: c */
    private Map<C5357hr, C5356hq> f12269c = new HashMap();

    /* renamed from: a */
    public static void m12374a(boolean z) {
        f12268b = z;
    }

    /* renamed from: a */
    public static void m12373a(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        if (cls.isAssignableFrom(obj2.getClass())) {
            Object cast = cls.cast(obj2);
            for (Field field : cls.getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    field.set(cast, field.get(obj));
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m12378b(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            if (obj.getClass() == Integer.TYPE) {
                return ((Integer) obj).intValue() == ((Integer) obj2).intValue();
            }
            if (obj.getClass() == Long.TYPE) {
                return ((Long) obj).longValue() == ((Long) obj2).longValue();
            }
            if (obj.getClass() == Boolean.TYPE) {
                return ((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue();
            }
            if (obj.getClass() == Double.TYPE) {
                return ((Double) obj).doubleValue() == ((Double) obj2).doubleValue();
            }
            if (obj.getClass() == Byte.TYPE) {
                return ((Byte) obj).byteValue() == ((Byte) obj2).byteValue();
            }
            if (obj.getClass() == Short.TYPE) {
                return ((Short) obj).shortValue() == ((Short) obj2).shortValue();
            }
            return obj.equals(obj2);
        } else if (obj.getClass() == Integer.class && obj2.getClass() == Long.class) {
            return ((Integer) obj).intValue() == ((Long) obj2).intValue();
        } else {
            if (obj.getClass() == Long.class && obj2.getClass() == Integer.class) {
                return ((Long) obj).intValue() == ((Integer) obj2).intValue();
            }
            return obj.equals(obj2);
        }
    }

    /* renamed from: a */
    private static boolean m12376a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                Object obj = jSONArray.get(i);
                Object obj2 = jSONArray2.get(i);
                if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
                    if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                        if (!m12378b(obj, obj2)) {
                            return false;
                        }
                    } else if (!m12376a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else if (!m12377a((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
                i++;
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m12377a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                Object obj2 = jSONObject2.get(next);
                if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
                    if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                        if (!m12378b(obj, obj2)) {
                            return false;
                        }
                    } else if (!m12376a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else if (!m12377a((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
            } catch (JSONException unused) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public C5352hm<T> mo40709a(C5357hr hrVar, C5356hq hqVar) {
        this.f12269c.put(hrVar, hqVar);
        return this;
    }

    /* renamed from: a */
    private static boolean m12375a(Class<?> cls) {
        return Integer.TYPE == cls || Integer.class == cls || Boolean.TYPE == cls || Boolean.class == cls || Double.TYPE == cls || Double.class == cls || Float.TYPE == cls || Float.class == cls || Long.TYPE == cls || Long.class == cls || String.class == cls;
    }

    /* renamed from: a */
    private JSONObject m12372a(Object obj, Class<?> cls) {
        JSONObject jSONObject;
        Object obj2;
        try {
            cls.getSimpleName();
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null || Object.class == superclass) {
                jSONObject = null;
            } else {
                Class<? super Object> superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                jSONObject = m12372a(obj, (Class<?>) superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            for (Field field : cls.getDeclaredFields()) {
                boolean z = true;
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(C5351hl.class)) {
                        if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() != type) {
                            z = false;
                        }
                        if (!z) {
                            String name = field.getName();
                            if (Integer.TYPE != type) {
                                if (Integer.class != type) {
                                    if (Boolean.TYPE != type) {
                                        if (Boolean.class != type) {
                                            if (Double.TYPE != type) {
                                                if (Double.class != type) {
                                                    if (Float.TYPE != type) {
                                                        if (Float.class != type) {
                                                            if (Long.TYPE != type) {
                                                                if (Long.class != type) {
                                                                    if (!(String.class == type || JSONObject.class == type)) {
                                                                        if (JSONArray.class != type) {
                                                                            if (Map.class.isAssignableFrom(type)) {
                                                                                if (this.f12269c.get(new C5357hr(name, cls)) instanceof C5355hp) {
                                                                                    JSONObject jSONObject2 = new JSONObject();
                                                                                    Object obj3 = field.get(obj);
                                                                                    if (obj3 != null) {
                                                                                        Map map = (Map) obj3;
                                                                                        for (Object next : map.keySet()) {
                                                                                            Object obj4 = map.get(next);
                                                                                            if (obj4 != null) {
                                                                                                if (!m12375a(obj4.getClass())) {
                                                                                                    obj4 = m12372a(obj4, obj4.getClass());
                                                                                                }
                                                                                                jSONObject2.put(next.toString(), obj4);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    jSONObject.put(name, jSONObject2);
                                                                                } else {
                                                                                    type.getSimpleName();
                                                                                }
                                                                            } else if (!List.class.isAssignableFrom(type)) {
                                                                                Object obj5 = field.get(obj);
                                                                                if (obj5 != null) {
                                                                                    jSONObject.put(name, m12372a(obj5, obj5.getClass()));
                                                                                } else {
                                                                                    type.getSimpleName();
                                                                                }
                                                                            } else if (this.f12269c.get(new C5357hr(name, cls)) instanceof C5354ho) {
                                                                                JSONArray jSONArray = new JSONArray();
                                                                                Object obj6 = field.get(obj);
                                                                                if (obj6 != null) {
                                                                                    for (Object next2 : (List) obj6) {
                                                                                        if (next2 != null) {
                                                                                            if (m12375a(next2.getClass())) {
                                                                                                obj2 = next2;
                                                                                            } else {
                                                                                                obj2 = m12372a(next2, next2.getClass());
                                                                                            }
                                                                                            if (obj2 == null) {
                                                                                                next2.getClass();
                                                                                            } else {
                                                                                                jSONArray.put(obj2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                jSONObject.put(name, jSONArray);
                                                                            } else {
                                                                                type.getSimpleName();
                                                                            }
                                                                        }
                                                                    }
                                                                    jSONObject.put(name, field.get(obj));
                                                                }
                                                            }
                                                            jSONObject.put(name, ((Long) field.get(obj)).longValue());
                                                        }
                                                    }
                                                    jSONObject.put(name, (double) ((Float) field.get(obj)).floatValue());
                                                }
                                            }
                                            jSONObject.put(name, ((Double) field.get(obj)).doubleValue());
                                        }
                                    }
                                    jSONObject.put(name, ((Boolean) field.get(obj)).booleanValue());
                                }
                            }
                            jSONObject.put(name, ((Integer) field.get(obj)).intValue());
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public JSONObject mo40711a(T t) {
        return m12372a((Object) t, t.getClass());
    }

    /* renamed from: a */
    public T mo40710a(JSONObject jSONObject, Class<T> cls) {
        return cls.cast(m12371a(jSONObject, cls, (Object) null, (Object) null));
    }

    /* JADX WARNING: type inference failed for: r22v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m12371a(org.json.JSONObject r19, java.lang.Class<?> r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r20.getSimpleName()     // Catch:{ Exception -> 0x02df }
            r4 = 1
            r5 = 0
            if (r22 != 0) goto L_0x006e
            java.lang.reflect.Constructor[] r6 = r20.getDeclaredConstructors()     // Catch:{ Exception -> 0x006d }
            int r7 = r6.length     // Catch:{ Exception -> 0x006d }
            if (r7 != 0) goto L_0x001a
            java.lang.Object r6 = r20.newInstance()     // Catch:{ Exception -> 0x006d }
            goto L_0x0070
        L_0x001a:
            r6 = r6[r5]     // Catch:{ Exception -> 0x006d }
            r6.setAccessible(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch:{ Exception -> 0x006d }
            int r7 = r7.length     // Catch:{ Exception -> 0x006d }
            if (r7 != 0) goto L_0x002d
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x006d }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ Exception -> 0x006d }
            goto L_0x0070
        L_0x002d:
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x006d }
            java.lang.Class[] r8 = r6.getParameterTypes()     // Catch:{ Exception -> 0x006d }
            int r9 = r8.length     // Catch:{ Exception -> 0x006d }
            r10 = 0
            r11 = 0
        L_0x0036:
            if (r10 >= r9) goto L_0x0068
            r12 = r8[r10]     // Catch:{ Exception -> 0x006d }
            int r13 = r11 + 1
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 == r12) goto L_0x005e
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 != r12) goto L_0x0045
            goto L_0x005e
        L_0x0045:
            java.lang.Class r14 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 != r12) goto L_0x004c
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x006d }
            goto L_0x0062
        L_0x004c:
            java.lang.Class r14 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 == r12) goto L_0x0057
            java.lang.Class r14 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x006d }
            if (r14 != r12) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r12 = r3
            goto L_0x0062
        L_0x0057:
            r14 = 0
            java.lang.Double r12 = java.lang.Double.valueOf(r14)     // Catch:{ Exception -> 0x006d }
            goto L_0x0062
        L_0x005e:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x006d }
        L_0x0062:
            r7[r11] = r12     // Catch:{ Exception -> 0x006d }
            int r10 = r10 + 1
            r11 = r13
            goto L_0x0036
        L_0x0068:
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ Exception -> 0x006d }
            goto L_0x0070
        L_0x006d:
            return r3
        L_0x006e:
            r6 = r22
        L_0x0070:
            java.lang.Class r7 = r20.getSuperclass()     // Catch:{ Exception -> 0x02df }
            if (r7 == 0) goto L_0x0083
            java.lang.Class r7 = r20.getSuperclass()     // Catch:{ Exception -> 0x02df }
            r7.getSimpleName()     // Catch:{ Exception -> 0x02df }
            r8 = r21
            java.lang.Object r6 = r0.m12371a(r1, r7, r8, r6)     // Catch:{ Exception -> 0x02df }
        L_0x0083:
            java.lang.reflect.Field[] r7 = r20.getDeclaredFields()     // Catch:{ Exception -> 0x02df }
            int r8 = r7.length     // Catch:{ Exception -> 0x02df }
            r9 = 0
        L_0x0089:
            if (r9 >= r8) goto L_0x02de
            r10 = r7[r9]     // Catch:{ Exception -> 0x02df }
            r10.setAccessible(r4)     // Catch:{ Exception -> 0x02df }
            java.lang.String r11 = r10.getName()     // Catch:{ Exception -> 0x02df }
            boolean r12 = r1.has(r11)     // Catch:{ Exception -> 0x02df }
            if (r12 == 0) goto L_0x02d1
            java.lang.Class<com.inmobi.media.hl> r12 = com.inmobi.media.C5351hl.class
            boolean r12 = r10.isAnnotationPresent(r12)     // Catch:{ Exception -> 0x02df }
            if (r12 != 0) goto L_0x02d1
            java.lang.Class r12 = r10.getType()     // Catch:{ Exception -> 0x02df }
            int r13 = r10.getModifiers()     // Catch:{ Exception -> 0x02df }
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)     // Catch:{ Exception -> 0x02df }
            if (r13 != 0) goto L_0x02d1
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x02df }
            if (r13 != r12) goto L_0x00bd
            int r11 = r1.getInt(r11)     // Catch:{ Exception -> 0x02df }
            r10.setInt(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x00bd:
            java.lang.Class<java.lang.Integer> r13 = java.lang.Integer.class
            if (r13 != r12) goto L_0x00ca
            java.lang.Object r11 = r1.get(r11)     // Catch:{ Exception -> 0x02df }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x00ca:
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x02df }
            if (r13 != r12) goto L_0x00d7
            boolean r11 = r1.getBoolean(r11)     // Catch:{ Exception -> 0x02df }
            r10.setBoolean(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x00d7:
            java.lang.Class<java.lang.Boolean> r13 = java.lang.Boolean.class
            if (r13 != r12) goto L_0x00e8
            boolean r11 = r1.getBoolean(r11)     // Catch:{ Exception -> 0x02df }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x02df }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x00e8:
            java.lang.Class r13 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x02df }
            if (r13 != r12) goto L_0x00f5
            double r11 = r1.getDouble(r11)     // Catch:{ Exception -> 0x02df }
            r10.setDouble(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x00f5:
            java.lang.Class<java.lang.Double> r13 = java.lang.Double.class
            if (r13 != r12) goto L_0x0106
            double r11 = r1.getDouble(r11)     // Catch:{ Exception -> 0x02df }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ Exception -> 0x02df }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x0106:
            java.lang.Class r13 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x02df }
            if (r13 != r12) goto L_0x0114
            double r11 = r1.getDouble(r11)     // Catch:{ Exception -> 0x02df }
            float r11 = (float) r11     // Catch:{ Exception -> 0x02df }
            r10.setFloat(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x0114:
            java.lang.Class<java.lang.Float> r13 = java.lang.Float.class
            if (r13 != r12) goto L_0x0126
            double r11 = r1.getDouble(r11)     // Catch:{ Exception -> 0x02df }
            float r11 = (float) r11     // Catch:{ Exception -> 0x02df }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x02df }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x0126:
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x02df }
            if (r13 != r12) goto L_0x0133
            long r11 = r1.getLong(r11)     // Catch:{ Exception -> 0x02df }
            r10.setLong(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x0133:
            java.lang.Class<java.lang.Long> r13 = java.lang.Long.class
            if (r13 != r12) goto L_0x0144
            long r11 = r1.getLong(r11)     // Catch:{ Exception -> 0x02df }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x02df }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x0144:
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r13 != r12) goto L_0x0151
            java.lang.String r11 = r1.optString(r11)     // Catch:{ Exception -> 0x02df }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x0151:
            java.lang.Class<org.json.JSONObject> r13 = org.json.JSONObject.class
            if (r13 != r12) goto L_0x015e
            org.json.JSONObject r11 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x02df }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x015e:
            java.lang.Class<org.json.JSONArray> r13 = org.json.JSONArray.class
            if (r13 != r12) goto L_0x016b
            org.json.JSONArray r11 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x02df }
            r10.set(r6, r11)     // Catch:{ Exception -> 0x02df }
            goto L_0x02d1
        L_0x016b:
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            boolean r13 = r13.isAssignableFrom(r12)     // Catch:{ Exception -> 0x02df }
            if (r13 == 0) goto L_0x021f
            java.util.Map<com.inmobi.media.hr, com.inmobi.media.hq> r13 = r0.f12269c     // Catch:{ Exception -> 0x02df }
            com.inmobi.media.hr r14 = new com.inmobi.media.hr     // Catch:{ Exception -> 0x02df }
            r14.<init>(r11, r2)     // Catch:{ Exception -> 0x02df }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ Exception -> 0x02df }
            com.inmobi.media.hq r13 = (com.inmobi.media.C5356hq) r13     // Catch:{ Exception -> 0x02df }
            boolean r14 = r13 instanceof com.inmobi.media.C5355hp     // Catch:{ Exception -> 0x02df }
            if (r14 == 0) goto L_0x0217
            org.json.JSONObject r11 = r1.optJSONObject(r11)     // Catch:{ Exception -> 0x02df }
            if (r11 == 0) goto L_0x02d1
            com.inmobi.media.hp r13 = (com.inmobi.media.C5355hp) r13     // Catch:{ Exception -> 0x02df }
            com.inmobi.commons.utils.json.Constructor r12 = r13.f12272b     // Catch:{ Exception -> 0x02df }
            java.lang.Object r12 = r12.construct()     // Catch:{ Exception -> 0x02df }
            java.util.Map r12 = (java.util.Map) r12     // Catch:{ Exception -> 0x02df }
            java.util.Iterator r14 = r11.keys()     // Catch:{ Exception -> 0x02df }
        L_0x0198:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x02df }
            if (r15 == 0) goto L_0x020f
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x02df }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x02df }
            java.lang.Class<V> r4 = r13.f12271a     // Catch:{ Exception -> 0x02df }
            boolean r4 = m12375a((java.lang.Class<?>) r4)     // Catch:{ Exception -> 0x02df }
            if (r4 == 0) goto L_0x01f8
            java.lang.Class<V> r4 = r13.f12271a     // Catch:{ Exception -> 0x02df }
            java.lang.Class<V> r5 = r13.f12271a     // Catch:{ Exception -> 0x02df }
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r3 != r5) goto L_0x01c1
            int r3 = r11.getInt(r15)     // Catch:{ Exception -> 0x02cf }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02cf }
        L_0x01bc:
            r5 = r3
            r21 = r7
            r3 = r8
            goto L_0x01f3
        L_0x01c1:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r3 != r5) goto L_0x01ce
            double r16 = r11.getDouble(r15)     // Catch:{ Exception -> 0x02cf }
            java.lang.Double r3 = java.lang.Double.valueOf(r16)     // Catch:{ Exception -> 0x02cf }
            goto L_0x01bc
        L_0x01ce:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r3 != r5) goto L_0x01df
            r21 = r7
            r3 = r8
            double r7 = r11.getDouble(r15)     // Catch:{ Exception -> 0x02cf }
            float r5 = (float) r7     // Catch:{ Exception -> 0x02cf }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x02cf }
            goto L_0x01f3
        L_0x01df:
            r21 = r7
            r3 = r8
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            if (r7 != r5) goto L_0x01ef
            long r7 = r11.getLong(r15)     // Catch:{ Exception -> 0x02cf }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x02cf }
            goto L_0x01f3
        L_0x01ef:
            java.lang.Object r5 = r11.get(r15)     // Catch:{ Exception -> 0x02cf }
        L_0x01f3:
            java.lang.Object r4 = r4.cast(r5)     // Catch:{ Exception -> 0x02cf }
            goto L_0x0205
        L_0x01f8:
            r21 = r7
            r3 = r8
            org.json.JSONObject r4 = r11.getJSONObject(r15)     // Catch:{ Exception -> 0x02cf }
            java.lang.Class<V> r5 = r13.f12271a     // Catch:{ Exception -> 0x02cf }
            java.lang.Object r4 = r0.mo40710a((org.json.JSONObject) r4, r5)     // Catch:{ Exception -> 0x02cf }
        L_0x0205:
            r12.put(r15, r4)     // Catch:{ Exception -> 0x02cf }
            r7 = r21
            r8 = r3
            r3 = 0
            r4 = 1
            r5 = 0
            goto L_0x0198
        L_0x020f:
            r21 = r7
            r3 = r8
            r10.set(r6, r12)     // Catch:{ Exception -> 0x02cf }
            goto L_0x02d4
        L_0x0217:
            r21 = r7
            r3 = r8
            r12.getSimpleName()     // Catch:{ Exception -> 0x02cf }
            goto L_0x02d4
        L_0x021f:
            r21 = r7
            r3 = r8
            java.lang.Class<java.util.List> r4 = java.util.List.class
            boolean r4 = r4.isAssignableFrom(r12)     // Catch:{ Exception -> 0x02cf }
            if (r4 == 0) goto L_0x02ba
            java.util.Map<com.inmobi.media.hr, com.inmobi.media.hq> r4 = r0.f12269c     // Catch:{ Exception -> 0x02cf }
            com.inmobi.media.hr r5 = new com.inmobi.media.hr     // Catch:{ Exception -> 0x02cf }
            r5.<init>(r11, r2)     // Catch:{ Exception -> 0x02cf }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x02cf }
            com.inmobi.media.hq r4 = (com.inmobi.media.C5356hq) r4     // Catch:{ Exception -> 0x02cf }
            boolean r5 = r4 instanceof com.inmobi.media.C5354ho     // Catch:{ Exception -> 0x02cf }
            if (r5 == 0) goto L_0x02b6
            org.json.JSONArray r5 = r1.optJSONArray(r11)     // Catch:{ Exception -> 0x02cf }
            if (r5 == 0) goto L_0x02d4
            com.inmobi.media.ho r4 = (com.inmobi.media.C5354ho) r4     // Catch:{ Exception -> 0x02cf }
            java.util.List r7 = r4.mo40712a()     // Catch:{ Exception -> 0x02cf }
            r8 = 0
        L_0x0248:
            int r11 = r5.length()     // Catch:{ Exception -> 0x02cf }
            if (r8 >= r11) goto L_0x02b2
            java.lang.Class r11 = r4.mo40713b()     // Catch:{ Exception -> 0x02cf }
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            if (r12 != r11) goto L_0x025f
            int r11 = r5.getInt(r8)     // Catch:{ Exception -> 0x02cf }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x02cf }
            goto L_0x028b
        L_0x025f:
            java.lang.Class<java.lang.Double> r12 = java.lang.Double.class
            if (r12 != r11) goto L_0x026c
            double r11 = r5.getDouble(r8)     // Catch:{ Exception -> 0x02cf }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ Exception -> 0x02cf }
            goto L_0x028b
        L_0x026c:
            java.lang.Class<java.lang.Float> r12 = java.lang.Float.class
            if (r12 != r11) goto L_0x027a
            double r11 = r5.getDouble(r8)     // Catch:{ Exception -> 0x02cf }
            float r11 = (float) r11     // Catch:{ Exception -> 0x02cf }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x02cf }
            goto L_0x028b
        L_0x027a:
            java.lang.Class<java.lang.Long> r12 = java.lang.Long.class
            if (r12 != r11) goto L_0x0287
            long r11 = r5.getLong(r8)     // Catch:{ Exception -> 0x02cf }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x02cf }
            goto L_0x028b
        L_0x0287:
            java.lang.Object r11 = r5.get(r8)     // Catch:{ Exception -> 0x02cf }
        L_0x028b:
            java.lang.Class r12 = r11.getClass()     // Catch:{ Exception -> 0x02cf }
            boolean r12 = m12375a((java.lang.Class<?>) r12)     // Catch:{ Exception -> 0x02cf }
            if (r12 == 0) goto L_0x029e
            java.lang.Class r12 = r4.mo40713b()     // Catch:{ Exception -> 0x02cf }
            java.lang.Object r11 = r12.cast(r11)     // Catch:{ Exception -> 0x02cf }
            goto L_0x02aa
        L_0x029e:
            org.json.JSONObject r11 = r5.getJSONObject(r8)     // Catch:{ Exception -> 0x02cf }
            java.lang.Class r12 = r4.mo40713b()     // Catch:{ Exception -> 0x02cf }
            java.lang.Object r11 = r0.mo40710a((org.json.JSONObject) r11, r12)     // Catch:{ Exception -> 0x02cf }
        L_0x02aa:
            if (r11 == 0) goto L_0x02af
            r7.add(r11)     // Catch:{ Exception -> 0x02cf }
        L_0x02af:
            int r8 = r8 + 1
            goto L_0x0248
        L_0x02b2:
            r10.set(r6, r7)     // Catch:{ Exception -> 0x02cf }
            goto L_0x02d4
        L_0x02b6:
            r20.getSimpleName()     // Catch:{ Exception -> 0x02cf }
            goto L_0x02d4
        L_0x02ba:
            org.json.JSONObject r4 = r1.optJSONObject(r11)     // Catch:{ Exception -> 0x02cf }
            if (r4 == 0) goto L_0x02cb
            r5 = 0
            java.lang.Object r4 = r0.m12371a(r4, r12, r6, r5)     // Catch:{ Exception -> 0x02c9 }
            r10.set(r6, r4)     // Catch:{ Exception -> 0x02cf }
            goto L_0x02d4
        L_0x02c9:
            r1 = r5
            goto L_0x02e0
        L_0x02cb:
            r20.getSimpleName()     // Catch:{ Exception -> 0x02cf }
            goto L_0x02d4
        L_0x02cf:
            r1 = 0
            goto L_0x02e0
        L_0x02d1:
            r21 = r7
            r3 = r8
        L_0x02d4:
            int r9 = r9 + 1
            r7 = r21
            r8 = r3
            r3 = 0
            r4 = 1
            r5 = 0
            goto L_0x0089
        L_0x02de:
            return r6
        L_0x02df:
            r1 = r3
        L_0x02e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5352hm.m12371a(org.json.JSONObject, java.lang.Class, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
