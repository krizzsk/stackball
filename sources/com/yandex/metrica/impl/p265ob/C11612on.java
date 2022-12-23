package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.on */
public class C11612on implements Executor {
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
