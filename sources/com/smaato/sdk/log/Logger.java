package com.smaato.sdk.log;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class Logger {
    private static final List<Tree> FOREST = new ArrayList();

    public interface Tree {
        void log(int i, String str);
    }

    /* renamed from: d */
    public static void m24075d(String str, Object... objArr) {
        if (str != null) {
            log(3, (Throwable) null, str, objArr);
            return;
        }
        throw new NullPointerException("'message' specified as non-null is null");
    }

    /* renamed from: i */
    public static void m24079i(String str, Object... objArr) {
        if (str != null) {
            log(4, (Throwable) null, str, objArr);
            return;
        }
        throw new NullPointerException("'message' specified as non-null is null");
    }

    /* renamed from: w */
    public static void m24081w(String str, Object... objArr) {
        if (str != null) {
            log(5, (Throwable) null, str, objArr);
            return;
        }
        throw new NullPointerException("'message' specified as non-null is null");
    }

    /* renamed from: w */
    public static void m24080w(String str, Throwable th) {
        if (str == null) {
            throw new NullPointerException("'message' specified as non-null is null");
        } else if (th != null) {
            log(5, th, str, new Object[0]);
        } else {
            throw new NullPointerException("'e' specified as non-null is null");
        }
    }

    /* renamed from: e */
    public static void m24077e(String str, Object... objArr) {
        if (str != null) {
            log(6, (Throwable) null, str, objArr);
            return;
        }
        throw new NullPointerException("'message' specified as non-null is null");
    }

    /* renamed from: e */
    public static void m24076e(String str, Throwable th, Object... objArr) {
        if (str == null) {
            throw new NullPointerException("'message' specified as non-null is null");
        } else if (th != null) {
            log(6, th, str, objArr);
        } else {
            throw new NullPointerException("'e' specified as non-null is null");
        }
    }

    /* renamed from: e */
    public static void m24078e(Throwable th) {
        if (th != null) {
            log(6, th, th.getMessage(), new Object[0]);
            return;
        }
        throw new NullPointerException("'e' specified as non-null is null");
    }

    public static void plant(Tree tree) {
        if (tree != null) {
            FOREST.add(tree);
            return;
        }
        throw new NullPointerException("'tree' specified as non-null is null");
    }

    private static void log(int i, Throwable th, String str, Object... objArr) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(256);
            if (objArr == null || objArr.length <= 0) {
                sb.append(str);
            } else {
                sb.append(String.format(Locale.US, str, objArr));
            }
            if (th != null) {
                sb.append("\n");
                if (th != null) {
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter(stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    sb.append(stringWriter.toString());
                } else {
                    throw new NullPointerException("'e' specified as non-null is null");
                }
            }
            if (sb.length() > 0) {
                for (Tree log : FOREST) {
                    log.log(i, sb.toString());
                }
                return;
            }
            return;
        }
        throw new NullPointerException("'message' specified as non-null is null");
    }

    public static class LogCatTree implements Tree {
        public void log(int i, String str) {
            int min;
            if (str == null) {
                throw new NullPointerException("'message' specified as non-null is null");
            } else if (i >= 5) {
                if (str.length() < 4000) {
                    Log.println(i, "SmaatoSDK", str);
                    return;
                }
                int i2 = 0;
                int length = str.length();
                while (i2 < length) {
                    int indexOf = str.indexOf(10, i2);
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    while (true) {
                        min = Math.min(indexOf, i2 + 4000);
                        Log.println(i, "SmaatoSDK", str.substring(i2, min));
                        if (min >= indexOf) {
                            break;
                        }
                        i2 = min;
                    }
                    i2 = min + 1;
                }
            }
        }
    }
}
