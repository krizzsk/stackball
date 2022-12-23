package com.tapjoy.internal;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.at */
public abstract class C9076at extends AbstractQueue implements C9081ax {
    public Iterator iterator() {
        return new Iterator() {

            /* renamed from: b */
            private int f22367b = 0;

            public final boolean hasNext() {
                return this.f22367b < C9076at.this.size();
            }

            public final Object next() {
                C9076at atVar = C9076at.this;
                int i = this.f22367b;
                this.f22367b = i + 1;
                return atVar.mo57777a(i);
            }

            public final void remove() {
                if (this.f22367b == 1) {
                    C9076at.this.mo57778b(1);
                    this.f22367b = 0;
                    return;
                }
                throw new UnsupportedOperationException("For the first element only");
            }
        };
    }
}
