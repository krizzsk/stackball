package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f10152c;

    /* renamed from: d */
    private final int f10153d;

    /* renamed from: k0 */
    private final long f10154k0;

    /* renamed from: k1 */
    private final long f10155k1;

    public int bits() {
        return 64;
    }

    SipHashFunction(int i, int i2, long j, long j2) {
        boolean z = true;
        Preconditions.checkArgument(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        Preconditions.checkArgument(i2 <= 0 ? false : z, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f10152c = i;
        this.f10153d = i2;
        this.f10154k0 = j;
        this.f10155k1 = j2;
    }

    public Hasher newHasher() {
        return new SipHasher(this.f10152c, this.f10153d, this.f10154k0, this.f10155k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f10152c + "" + this.f10153d + "(" + this.f10154k0 + ", " + this.f10155k1 + ")";
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        if (this.f10152c == sipHashFunction.f10152c && this.f10153d == sipHashFunction.f10153d && this.f10154k0 == sipHashFunction.f10154k0 && this.f10155k1 == sipHashFunction.f10155k1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((getClass().hashCode() ^ this.f10152c) ^ this.f10153d)) ^ this.f10154k0) ^ this.f10155k1);
    }

    private static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* renamed from: b */
        private long f10156b = 0;

        /* renamed from: c */
        private final int f10157c;

        /* renamed from: d */
        private final int f10158d;
        private long finalM = 0;

        /* renamed from: v0 */
        private long f10159v0 = 8317987319222330741L;

        /* renamed from: v1 */
        private long f10160v1 = 7237128888997146477L;

        /* renamed from: v2 */
        private long f10161v2 = 7816392313619706465L;

        /* renamed from: v3 */
        private long f10162v3 = 8387220255154660723L;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        SipHasher(int i, int i2, long j, long j2) {
            super(8);
            this.f10157c = i;
            this.f10158d = i2;
            this.f10159v0 = 8317987319222330741L ^ j;
            this.f10160v1 = 7237128888997146477L ^ j2;
            this.f10161v2 = 7816392313619706465L ^ j;
            this.f10162v3 = 8387220255154660723L ^ j2;
        }

        /* access modifiers changed from: protected */
        public void process(ByteBuffer byteBuffer) {
            this.f10156b += 8;
            processM(byteBuffer.getLong());
        }

        /* access modifiers changed from: protected */
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f10156b += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }

        public HashCode makeHash() {
            long j = this.finalM ^ (this.f10156b << 56);
            this.finalM = j;
            processM(j);
            this.f10161v2 ^= 255;
            sipRound(this.f10158d);
            return HashCode.fromLong(((this.f10159v0 ^ this.f10160v1) ^ this.f10161v2) ^ this.f10162v3);
        }

        private void processM(long j) {
            this.f10162v3 ^= j;
            sipRound(this.f10157c);
            this.f10159v0 = j ^ this.f10159v0;
        }

        private void sipRound(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f10159v0;
                long j2 = this.f10160v1;
                this.f10159v0 = j + j2;
                this.f10161v2 += this.f10162v3;
                this.f10160v1 = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.f10162v3, 16);
                this.f10162v3 = rotateLeft;
                long j3 = this.f10160v1;
                long j4 = this.f10159v0;
                this.f10160v1 = j3 ^ j4;
                this.f10162v3 = rotateLeft ^ this.f10161v2;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                this.f10159v0 = rotateLeft2;
                long j5 = this.f10161v2;
                long j6 = this.f10160v1;
                this.f10161v2 = j5 + j6;
                this.f10159v0 = rotateLeft2 + this.f10162v3;
                this.f10160v1 = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.f10162v3, 21);
                this.f10162v3 = rotateLeft3;
                long j7 = this.f10160v1;
                long j8 = this.f10161v2;
                this.f10160v1 = j7 ^ j8;
                this.f10162v3 = rotateLeft3 ^ this.f10159v0;
                this.f10161v2 = Long.rotateLeft(j8, 32);
            }
        }
    }
}
