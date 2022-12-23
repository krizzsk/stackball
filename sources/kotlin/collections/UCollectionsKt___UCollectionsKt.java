package kotlin.collections;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001a\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo72093d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, mo72094k = 5, mo72095mv = {1, 5, 1}, mo72097xi = 1, mo72098xs = "kotlin/collections/UCollectionsKt")
/* compiled from: _UCollections.kt */
class UCollectionsKt___UCollectionsKt {
    public static final byte[] toUByteArray(Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "$this$toUByteArray");
        byte[] r0 = UByteArray.m46084constructorimpl(collection.size());
        int i = 0;
        for (UByte r2 : collection) {
            UByteArray.m46095setVurrAj0(r0, i, r2.m46082unboximpl());
            i++;
        }
        return r0;
    }

    public static final int[] toUIntArray(Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "$this$toUIntArray");
        int[] r0 = UIntArray.m46162constructorimpl(collection.size());
        int i = 0;
        for (UInt r2 : collection) {
            UIntArray.m46173setVXSXFK8(r0, i, r2.m46160unboximpl());
            i++;
        }
        return r0;
    }

    public static final long[] toULongArray(Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "$this$toULongArray");
        long[] r0 = ULongArray.m46240constructorimpl(collection.size());
        int i = 0;
        for (ULong r2 : collection) {
            ULongArray.m46251setk8EXiF4(r0, i, r2.m46238unboximpl());
            i++;
        }
        return r0;
    }

    public static final short[] toUShortArray(Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "$this$toUShortArray");
        short[] r0 = UShortArray.m46344constructorimpl(collection.size());
        int i = 0;
        for (UShort r2 : collection) {
            UShortArray.m46355set01HTLdE(r0, i, r2.m46342unboximpl());
            i++;
        }
        return r0;
    }

    public static final int sumOfUInt(Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "$this$sum");
        int i = 0;
        for (UInt r1 : iterable) {
            i = UInt.m46109constructorimpl(i + r1.m46160unboximpl());
        }
        return i;
    }

    public static final long sumOfULong(Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "$this$sum");
        long j = 0;
        for (ULong r2 : iterable) {
            j = ULong.m46187constructorimpl(j + r2.m46238unboximpl());
        }
        return j;
    }

    public static final int sumOfUByte(Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "$this$sum");
        int i = 0;
        for (UByte r1 : iterable) {
            i = UInt.m46109constructorimpl(i + UInt.m46109constructorimpl(r1.m46082unboximpl() & 255));
        }
        return i;
    }

    public static final int sumOfUShort(Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "$this$sum");
        int i = 0;
        for (UShort r1 : iterable) {
            i = UInt.m46109constructorimpl(i + UInt.m46109constructorimpl(r1.m46342unboximpl() & UShort.MAX_VALUE));
        }
        return i;
    }
}
