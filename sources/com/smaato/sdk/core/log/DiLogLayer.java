package com.smaato.sdk.core.log;

import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.p251fi.Consumer;

public final class DiLogLayer {
    private static final Logger EMPTY = new Logger() {
        public final void debug(LogDomain logDomain, String str, Object... objArr) {
        }

        public final void debug(LogDomain logDomain, Throwable th, String str, Object... objArr) {
        }

        public final void error(LogDomain logDomain, String str, Object... objArr) {
        }

        public final void error(LogDomain logDomain, Throwable th, String str, Object... objArr) {
        }

        public final void info(LogDomain logDomain, String str, Object... objArr) {
        }

        public final void info(LogDomain logDomain, Throwable th, String str, Object... objArr) {
        }

        public final void log(LogLevel logLevel, LogDomain logDomain, String str, Object... objArr) {
        }

        public final void log(LogLevel logLevel, LogDomain logDomain, Throwable th, String str, Object... objArr) {
        }

        public final void setExplicitOneShotTag(String str) {
        }

        public final void warning(LogDomain logDomain, String str, Object... objArr) {
        }

        public final void warning(LogDomain logDomain, Throwable th, String str, Object... objArr) {
        }
    };

    private DiLogLayer() {
    }

    public static DiRegistry createRegistry(boolean z, LogLevel logLevel) {
        return DiRegistry.m24065of(new Consumer(z, logLevel) {
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ LogLevel f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((DiRegistry) obj).registerSingletonFactory(Logger.class, new ClassFactory(this.f$0, this.f$1) {
                    public final /* synthetic */ boolean f$0;
                    public final /* synthetic */ LogLevel f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final Object get(DiConstructor diConstructor) {
                        return DiLogLayer.lambda$null$0(this.f$0, this.f$1, diConstructor);
                    }
                });
            }
        });
    }

    static /* synthetic */ Logger lambda$null$0(boolean z, LogLevel logLevel, DiConstructor diConstructor) {
        if (!z) {
            return EMPTY;
        }
        LoggerFactory.initializeLogger(logLevel);
        return LoggerFactory.getLogger();
    }

    public static Logger getLoggerFrom(DiConstructor diConstructor) {
        return (Logger) diConstructor.get(Logger.class);
    }
}
