package com.ogury.core;

import com.ogury.core.internal.C7920ah;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.OguryIntegrationLogger;

/* compiled from: OguryLog.kt */
public final class OguryLog {
    public static final OguryLog INSTANCE = new OguryLog();

    private OguryLog() {
    }

    /* compiled from: OguryLog.kt */
    public enum Level {
        ;

        public abstract int getLogPriority();

        /* renamed from: com.ogury.core.OguryLog$Level$d */
        /* compiled from: OguryLog.kt */
        static final class C7901d extends Level {
            public final int getLogPriority() {
                return 999;
            }

            C7901d(String str, int i) {
                super(str, 0, (C7920ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$a */
        /* compiled from: OguryLog.kt */
        static final class C7898a extends Level {
            public final int getLogPriority() {
                return 3;
            }

            C7898a(String str, int i) {
                super(str, 1, (C7920ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$c */
        /* compiled from: OguryLog.kt */
        static final class C7900c extends Level {
            public final int getLogPriority() {
                return 4;
            }

            C7900c(String str, int i) {
                super(str, 2, (C7920ah) null);
            }
        }

        /* renamed from: com.ogury.core.OguryLog$Level$b */
        /* compiled from: OguryLog.kt */
        static final class C7899b extends Level {
            public final int getLogPriority() {
                return 6;
            }

            C7899b(String str, int i) {
                super(str, 3, (C7920ah) null);
            }
        }
    }

    public static final void enable(Level level) {
        C7921ai.m22144b(level, "level");
        OguryIntegrationLogger.setLevel(level.getLogPriority());
    }
}
