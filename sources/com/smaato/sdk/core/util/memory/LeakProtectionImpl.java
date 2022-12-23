package com.smaato.sdk.core.util.memory;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

final class LeakProtectionImpl implements LeakProtection {
    private final Map<LeakProtectionReference, Runnable> destructs = new HashMap();
    private final ReferenceQueue<Object> queue = new ReferenceQueue<>();

    LeakProtectionImpl() {
        new Thread(new Runnable() {
            public final void run() {
                LeakProtectionImpl.this.lambda$new$0$LeakProtectionImpl();
            }
        }).start();
    }

    public /* synthetic */ void lambda$new$0$LeakProtectionImpl() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
            while (true) {
                LeakProtectionReference leakProtectionReference = (LeakProtectionReference) this.queue.poll();
                if (leakProtectionReference != null) {
                    if (LeakProtectionReference.access$100(leakProtectionReference)) {
                        Runnable removeDestructionAction = removeDestructionAction(leakProtectionReference);
                        if (removeDestructionAction != null) {
                            removeDestructionAction.run();
                        }
                        leakProtectionReference.clear();
                    }
                }
            }
        }
    }

    public final synchronized void listenToObject(Object obj, Runnable runnable) {
        this.destructs.put(new LeakProtectionReference(obj, this.queue, (byte) 0), runnable);
    }

    private synchronized Runnable removeDestructionAction(LeakProtectionReference leakProtectionReference) {
        return this.destructs.remove(leakProtectionReference);
    }

    static final class LeakProtectionReference<T> extends PhantomReference<T> {
        private boolean cleared;

        /* synthetic */ LeakProtectionReference(Object obj, ReferenceQueue referenceQueue, byte b) {
            this(obj, referenceQueue);
        }

        private LeakProtectionReference(T t, ReferenceQueue<? super T> referenceQueue) {
            super(t, referenceQueue);
        }

        static /* synthetic */ boolean access$100(LeakProtectionReference leakProtectionReference) {
            if (leakProtectionReference.cleared) {
                return false;
            }
            leakProtectionReference.cleared = true;
            return true;
        }
    }
}
