package com.smaato.sdk.flow;

abstract class Exceptions {
    static void throwIfFatal(Throwable th) {
        if (th == null) {
            throw new NullPointerException("'t' specified as non-null is null");
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        } else if (th instanceof AssertionError) {
            throw ((AssertionError) th);
        }
    }
}
