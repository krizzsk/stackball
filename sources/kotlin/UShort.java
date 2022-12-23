package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;

@JvmInline
@Metadata(mo72092d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b@\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001tB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0013J\u001b\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013J\u001b\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u0013J\u001b\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b;\u0010\u001fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0010J\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0013J\u001b\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u0010J\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0013J\u001b\u0010H\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0018J\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0010J\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bO\u0010\u0013J\u001b\u0010M\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0018J\u0010\u0010R\u001a\u00020SH\b¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020WH\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0003H\b¢\u0006\u0004\be\u0010\u0005J\u000f\u0010f\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\u00020\u000eH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010UJ\u0016\u0010l\u001a\u00020\u0011H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010-J\u0016\u0010n\u001a\u00020\u0014H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010cJ\u0016\u0010p\u001a\u00020\u0000H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010\u0005J\u001b\u0010r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0001\u0002\u0001\u00020\u0003ø\u0001\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, mo72093d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: UShort.kt */
public final class UShort implements Comparable<UShort> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UShort m46287boximpl(short s) {
        return new UShort(s);
    }

    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private int m46291compareToxj2QHRw(short s) {
        return m46292compareToxj2QHRw(this.data, s);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m46293constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m46299equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).m46342unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m46300equalsimpl0(short s, short s2) {
        return s == s2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m46305hashCodeimpl(short s) {
        return s;
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m46330toByteimpl(short s) {
        return (byte) s;
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m46331toDoubleimpl(short s) {
        return (double) (s & MAX_VALUE);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m46332toFloatimpl(short s) {
        return (float) (s & MAX_VALUE);
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m46333toIntimpl(short s) {
        return s & MAX_VALUE;
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m46334toLongimpl(short s) {
        return ((long) s) & 65535;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m46335toShortimpl(short s) {
        return s;
    }

    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m46340toUShortMh2AYeg(short s) {
        return s;
    }

    public boolean equals(Object obj) {
        return m46299equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m46305hashCodeimpl(this.data);
    }

    public String toString() {
        return m46336toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m46342unboximpl() {
        return this.data;
    }

    private /* synthetic */ UShort(short s) {
        this.data = s;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m46291compareToxj2QHRw(((UShort) obj).m46342unboximpl());
    }

    @Metadata(mo72092d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004XTø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004XTø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, mo72093d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: UShort.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static final int m46288compareTo7apg3OU(short s, byte b) {
        return Intrinsics.compare((int) s & MAX_VALUE, (int) b & 255);
    }

    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static int m46292compareToxj2QHRw(short s, short s2) {
        return Intrinsics.compare((int) s & MAX_VALUE, (int) s2 & MAX_VALUE);
    }

    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static final int m46290compareToWZ4Q5Ns(short s, int i) {
        return UnsignedKt.uintCompare(UInt.m46109constructorimpl(s & MAX_VALUE), i);
    }

    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m46289compareToVKZWuLQ(short s, long j) {
        return UnsignedKt.ulongCompare(ULong.m46187constructorimpl(((long) s) & 65535), j);
    }

    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m46317plus7apg3OU(short s, byte b) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) + UInt.m46109constructorimpl(b & 255));
    }

    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m46320plusxj2QHRw(short s, short s2) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) + UInt.m46109constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m46319plusWZ4Q5Ns(short s, int i) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) + i);
    }

    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m46318plusVKZWuLQ(short s, long j) {
        return ULong.m46187constructorimpl(ULong.m46187constructorimpl(((long) s) & 65535) + j);
    }

    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m46308minus7apg3OU(short s, byte b) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) - UInt.m46109constructorimpl(b & 255));
    }

    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m46311minusxj2QHRw(short s, short s2) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) - UInt.m46109constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m46310minusWZ4Q5Ns(short s, int i) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) - i);
    }

    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m46309minusVKZWuLQ(short s, long j) {
        return ULong.m46187constructorimpl(ULong.m46187constructorimpl(((long) s) & 65535) - j);
    }

    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m46326times7apg3OU(short s, byte b) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) * UInt.m46109constructorimpl(b & 255));
    }

    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m46329timesxj2QHRw(short s, short s2) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) * UInt.m46109constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m46328timesWZ4Q5Ns(short s, int i) {
        return UInt.m46109constructorimpl(UInt.m46109constructorimpl(s & MAX_VALUE) * i);
    }

    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m46327timesVKZWuLQ(short s, long j) {
        return ULong.m46187constructorimpl(ULong.m46187constructorimpl(((long) s) & 65535) * j);
    }

    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m46295div7apg3OU(short s, byte b) {
        return UnsignedKt.m46362uintDivideJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(b & 255));
    }

    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m46298divxj2QHRw(short s, short s2) {
        return UnsignedKt.m46362uintDivideJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m46297divWZ4Q5Ns(short s, int i) {
        return UnsignedKt.m46362uintDivideJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), i);
    }

    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m46296divVKZWuLQ(short s, long j) {
        return UnsignedKt.m46364ulongDivideeb3DHEI(ULong.m46187constructorimpl(((long) s) & 65535), j);
    }

    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m46322rem7apg3OU(short s, byte b) {
        return UnsignedKt.m46363uintRemainderJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(b & 255));
    }

    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m46325remxj2QHRw(short s, short s2) {
        return UnsignedKt.m46363uintRemainderJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m46324remWZ4Q5Ns(short s, int i) {
        return UnsignedKt.m46363uintRemainderJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), i);
    }

    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m46323remVKZWuLQ(short s, long j) {
        return UnsignedKt.m46365ulongRemaindereb3DHEI(ULong.m46187constructorimpl(((long) s) & 65535), j);
    }

    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m46301floorDiv7apg3OU(short s, byte b) {
        return UnsignedKt.m46362uintDivideJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(b & 255));
    }

    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m46304floorDivxj2QHRw(short s, short s2) {
        return UnsignedKt.m46362uintDivideJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m46303floorDivWZ4Q5Ns(short s, int i) {
        return UnsignedKt.m46362uintDivideJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), i);
    }

    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m46302floorDivVKZWuLQ(short s, long j) {
        return UnsignedKt.m46364ulongDivideeb3DHEI(ULong.m46187constructorimpl(((long) s) & 65535), j);
    }

    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m46312mod7apg3OU(short s, byte b) {
        return UByte.m46033constructorimpl((byte) UnsignedKt.m46363uintRemainderJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(b & 255)));
    }

    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m46315modxj2QHRw(short s, short s2) {
        return m46293constructorimpl((short) UnsignedKt.m46363uintRemainderJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(s2 & MAX_VALUE)));
    }

    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m46314modWZ4Q5Ns(short s, int i) {
        return UnsignedKt.m46363uintRemainderJ1ME1BU(UInt.m46109constructorimpl(s & MAX_VALUE), i);
    }

    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m46313modVKZWuLQ(short s, long j) {
        return UnsignedKt.m46365ulongRemaindereb3DHEI(ULong.m46187constructorimpl(((long) s) & 65535), j);
    }

    /* renamed from: inc-Mh2AYeg  reason: not valid java name */
    private static final short m46306incMh2AYeg(short s) {
        return m46293constructorimpl((short) (s + 1));
    }

    /* renamed from: dec-Mh2AYeg  reason: not valid java name */
    private static final short m46294decMh2AYeg(short s) {
        return m46293constructorimpl((short) (s - 1));
    }

    /* renamed from: rangeTo-xj2QHRw  reason: not valid java name */
    private static final UIntRange m46321rangeToxj2QHRw(short s, short s2) {
        return new UIntRange(UInt.m46109constructorimpl(s & MAX_VALUE), UInt.m46109constructorimpl(s2 & MAX_VALUE), (DefaultConstructorMarker) null);
    }

    /* renamed from: and-xj2QHRw  reason: not valid java name */
    private static final short m46286andxj2QHRw(short s, short s2) {
        return m46293constructorimpl((short) (s & s2));
    }

    /* renamed from: or-xj2QHRw  reason: not valid java name */
    private static final short m46316orxj2QHRw(short s, short s2) {
        return m46293constructorimpl((short) (s | s2));
    }

    /* renamed from: xor-xj2QHRw  reason: not valid java name */
    private static final short m46341xorxj2QHRw(short s, short s2) {
        return m46293constructorimpl((short) (s ^ s2));
    }

    /* renamed from: inv-Mh2AYeg  reason: not valid java name */
    private static final short m46307invMh2AYeg(short s) {
        return m46293constructorimpl((short) (~s));
    }

    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m46337toUBytew2LRezQ(short s) {
        return UByte.m46033constructorimpl((byte) s);
    }

    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m46338toUIntpVg5ArA(short s) {
        return UInt.m46109constructorimpl(s & MAX_VALUE);
    }

    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m46339toULongsVKNKU(short s) {
        return ULong.m46187constructorimpl(((long) s) & 65535);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m46336toStringimpl(short s) {
        return String.valueOf(s & MAX_VALUE);
    }
}
