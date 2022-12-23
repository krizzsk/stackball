package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.li */
public final class C8430li {
    /* renamed from: a */
    public static final <T> Class<T> m23853a(C8492nm<T> nmVar) {
        C8467mq.m23881b(nmVar, "$this$javaObjectType");
        Class a = ((C8459mj) nmVar).mo53971a();
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (a != null) {
            return a;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }
}
