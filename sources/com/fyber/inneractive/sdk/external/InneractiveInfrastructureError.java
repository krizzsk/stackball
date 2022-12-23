package com.fyber.inneractive.sdk.external;

public class InneractiveInfrastructureError extends InneractiveError {

    /* renamed from: a */
    private final InneractiveErrorCode f6900a;

    /* renamed from: b */
    private Throwable f6901b;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode) {
        this.f6900a = inneractiveErrorCode;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, Throwable th) {
        this(inneractiveErrorCode);
        this.f6901b = th;
    }

    public void setCause(Throwable th) {
        this.f6901b = th;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f6900a;
    }

    public Throwable getCause() {
        return this.f6901b;
    }

    public String description() {
        StringBuilder sb = new StringBuilder();
        InneractiveErrorCode inneractiveErrorCode = this.f6900a;
        if (inneractiveErrorCode != null) {
            sb.append(inneractiveErrorCode);
        }
        if (this.f6901b != null) {
            sb.append(": ");
            sb.append(this.f6901b);
        }
        return sb.toString();
    }
}
