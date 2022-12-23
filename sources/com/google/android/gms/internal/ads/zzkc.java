package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzja;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzkc implements zzjm {
    private static final zzjn zzaon = new zzkb();
    private static final byte[] zzaoo = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzaop = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID zzaoq = new UUID(72057594037932032L, -9223371306706625679L);
    private long zzaht;
    private final zzkf zzaof;
    private final zzka zzaor;
    private final SparseArray<zzkd> zzaos;
    private final boolean zzaot;
    private final zzos zzaou;
    private final zzos zzaov;
    private final zzos zzaow;
    private final zzos zzaox;
    private final zzos zzaoy;
    private final zzos zzaoz;
    private final zzos zzapa;
    private final zzos zzapb;
    private final zzos zzapc;
    private ByteBuffer zzapd;
    private long zzape;
    private long zzapf;
    private long zzapg;
    private long zzaph;
    private zzkd zzapi;
    private boolean zzapj;
    private int zzapk;
    private long zzapl;
    private boolean zzapm;
    private long zzapn;
    private long zzapo;
    private long zzapp;
    private zzom zzapq;
    private zzom zzapr;
    private boolean zzaps;
    private int zzapt;
    private long zzapu;
    private long zzapv;
    private int zzapw;
    private int zzapx;
    private int[] zzapy;
    private int zzapz;
    private int zzaqa;
    private int zzaqb;
    private int zzaqc;
    private boolean zzaqd;
    private boolean zzaqe;
    private boolean zzaqf;
    private boolean zzaqg;
    private byte zzaqh;
    private int zzaqi;
    private int zzaqj;
    private int zzaqk;
    private boolean zzaql;
    private boolean zzaqm;
    private zzjo zzaqn;

    public zzkc() {
        this(0);
    }

    static int zzaj(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /*17026*/:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static boolean zzak(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public final void release() {
    }

    private zzkc(int i) {
        this(new zzjv(), 0);
    }

    private zzkc(zzka zzka, int i) {
        this.zzapf = -1;
        this.zzapg = -9223372036854775807L;
        this.zzaph = -9223372036854775807L;
        this.zzaht = -9223372036854775807L;
        this.zzapn = -1;
        this.zzapo = -1;
        this.zzapp = -9223372036854775807L;
        this.zzaor = zzka;
        zzka.zza(new zzke(this, (zzkb) null));
        this.zzaot = true;
        this.zzaof = new zzkf();
        this.zzaos = new SparseArray<>();
        this.zzaow = new zzos(4);
        this.zzaox = new zzos(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzaoy = new zzos(4);
        this.zzaou = new zzos(zzon.zzbhb);
        this.zzaov = new zzos(4);
        this.zzaoz = new zzos();
        this.zzapa = new zzos();
        this.zzapb = new zzos(8);
        this.zzapc = new zzos();
    }

    public final boolean zza(zzjl zzjl) throws IOException, InterruptedException {
        return new zzkg().zza(zzjl);
    }

    public final void zza(zzjo zzjo) {
        this.zzaqn = zzjo;
    }

    public final void zzc(long j, long j2) {
        this.zzapp = -9223372036854775807L;
        this.zzapt = 0;
        this.zzaor.reset();
        this.zzaof.reset();
        zzgt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzjl r9, com.google.android.gms.internal.ads.zzjs r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.zzaql = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r8.zzaql
            if (r3 != 0) goto L_0x003a
            com.google.android.gms.internal.ads.zzka r2 = r8.zzaor
            boolean r2 = r2.zzb(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.getPosition()
            boolean r5 = r8.zzapm
            if (r5 == 0) goto L_0x0025
            r8.zzapo = r3
            long r3 = r8.zzapn
            r10.position = r3
            r8.zzapm = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r8.zzapj
            if (r3 == 0) goto L_0x0036
            long r3 = r8.zzapo
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r10.position = r3
            r8.zzapo = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkc.zza(com.google.android.gms.internal.ads.zzjl, com.google.android.gms.internal.ads.zzjs):int");
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i, long j, long j2) throws zzhi {
        if (i == 160) {
            this.zzaqm = false;
        } else if (i == 174) {
            this.zzapi = new zzkd((zzkb) null);
        } else if (i == 187) {
            this.zzaps = false;
        } else if (i == 19899) {
            this.zzapk = -1;
            this.zzapl = -1;
        } else if (i == 20533) {
            this.zzapi.zzaqq = true;
        } else if (i == 21968) {
            this.zzapi.zzaqx = true;
        } else if (i == 408125543) {
            long j3 = this.zzapf;
            if (j3 == -1 || j3 == j) {
                this.zzapf = j;
                this.zzape = j2;
                return;
            }
            throw new zzhi("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.zzapq = new zzom();
            this.zzapr = new zzom();
        } else if (i != 524531317 || this.zzapj) {
        } else {
            if (!this.zzaot || this.zzapn == -1) {
                this.zzaqn.zza(new zzju(this.zzaht));
                this.zzapj = true;
                return;
            }
            this.zzapm = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzal(int i) throws zzhi {
        zzjr zzjr;
        zzom zzom;
        zzom zzom2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.zzapi.zzaqo;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    zzkd zzkd = this.zzapi;
                    zzkd.zza(this.zzaqn, zzkd.number);
                    this.zzaos.put(this.zzapi.number, this.zzapi);
                }
                this.zzapi = null;
            } else if (i == 19899) {
                int i4 = this.zzapk;
                if (i4 != -1) {
                    long j = this.zzapl;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.zzapn = j;
                            return;
                        }
                        return;
                    }
                }
                throw new zzhi("Mandatory element SeekID or SeekPosition not found");
            } else if (i != 25152) {
                if (i != 28032) {
                    if (i == 357149030) {
                        if (this.zzapg == -9223372036854775807L) {
                            this.zzapg = 1000000;
                        }
                        long j2 = this.zzaph;
                        if (j2 != -9223372036854775807L) {
                            this.zzaht = zzea(j2);
                        }
                    } else if (i != 374648427) {
                        if (i == 475249515 && !this.zzapj) {
                            zzjo zzjo = this.zzaqn;
                            if (this.zzapf == -1 || this.zzaht == -9223372036854775807L || (zzom = this.zzapq) == null || zzom.size() == 0 || (zzom2 = this.zzapr) == null || zzom2.size() != this.zzapq.size()) {
                                this.zzapq = null;
                                this.zzapr = null;
                                zzjr = new zzju(this.zzaht);
                            } else {
                                int size = this.zzapq.size();
                                int[] iArr = new int[size];
                                long[] jArr = new long[size];
                                long[] jArr2 = new long[size];
                                long[] jArr3 = new long[size];
                                for (int i5 = 0; i5 < size; i5++) {
                                    jArr3[i5] = this.zzapq.get(i5);
                                    jArr[i5] = this.zzapf + this.zzapr.get(i5);
                                }
                                while (true) {
                                    i2 = size - 1;
                                    if (i3 >= i2) {
                                        break;
                                    }
                                    int i6 = i3 + 1;
                                    iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                                    jArr2[i3] = jArr3[i6] - jArr3[i3];
                                    i3 = i6;
                                }
                                iArr[i2] = (int) ((this.zzapf + this.zzape) - jArr[i2]);
                                jArr2[i2] = this.zzaht - jArr3[i2];
                                this.zzapq = null;
                                this.zzapr = null;
                                zzjr = new zzjk(iArr, jArr, jArr2, jArr3);
                            }
                            zzjo.zza(zzjr);
                            this.zzapj = true;
                        }
                    } else if (this.zzaos.size() != 0) {
                        this.zzaqn.zzgr();
                    } else {
                        throw new zzhi("No valid tracks were found");
                    }
                } else if (this.zzapi.zzaqq && this.zzapi.zzaqr != null) {
                    throw new zzhi("Combining encryption and compression is not supported");
                }
            } else if (!this.zzapi.zzaqq) {
            } else {
                if (this.zzapi.zzaqs != null) {
                    this.zzapi.zzagl = new zzja(new zzja.zza(zzgr.zzadl, "video/webm", this.zzapi.zzaqs.zzaol));
                    return;
                }
                throw new zzhi("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (this.zzapt == 2) {
            if (!this.zzaqm) {
                this.zzaqb |= 1;
            }
            zza(this.zzaos.get(this.zzapz), this.zzapu);
            this.zzapt = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i, long j) throws zzhi {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.zzapi.type = (int) j;
                        return;
                    case 136:
                        zzkd zzkd = this.zzapi;
                        if (j == 1) {
                            z = true;
                        }
                        zzkd.zzarq = z;
                        return;
                    case 155:
                        this.zzapv = zzea(j);
                        return;
                    case 159:
                        this.zzapi.zzags = (int) j;
                        return;
                    case 176:
                        this.zzapi.width = (int) j;
                        return;
                    case 179:
                        this.zzapq.add(zzea(j));
                        return;
                    case 186:
                        this.zzapi.height = (int) j;
                        return;
                    case 215:
                        this.zzapi.number = (int) j;
                        return;
                    case 231:
                        this.zzapp = zzea(j);
                        return;
                    case 241:
                        if (!this.zzaps) {
                            this.zzapr.add(j);
                            this.zzaps = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzaqm = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new zzhi(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new zzhi(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new zzhi(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new zzhi(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new zzhi(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.zzapl = j + this.zzapf;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.zzapi.zzagp = 0;
                            return;
                        } else if (i2 == 1) {
                            this.zzapi.zzagp = 2;
                            return;
                        } else if (i2 == 3) {
                            this.zzapi.zzagp = 1;
                            return;
                        } else if (i2 == 15) {
                            this.zzapi.zzagp = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.zzapi.zzaqu = (int) j;
                        return;
                    case 21682:
                        this.zzapi.zzaqw = (int) j;
                        return;
                    case 21690:
                        this.zzapi.zzaqv = (int) j;
                        return;
                    case 21930:
                        zzkd zzkd2 = this.zzapi;
                        if (j == 1) {
                            z = true;
                        }
                        zzkd2.zzarr = z;
                        return;
                    case 22186:
                        this.zzapi.zzaro = j;
                        return;
                    case 22203:
                        this.zzapi.zzarp = j;
                        return;
                    case 25188:
                        this.zzapi.zzarn = (int) j;
                        return;
                    case 2352003:
                        this.zzapi.zzaqp = (int) j;
                        return;
                    case 2807729:
                        this.zzapg = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.zzapi.zzara = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.zzapi.zzara = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.zzapi.zzaqz = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.zzapi.zzaqz = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.zzapi.zzaqz = 3;
                                return;
                            case 21947:
                                this.zzapi.zzaqx = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    this.zzapi.zzaqy = 1;
                                    return;
                                } else if (i5 == 9) {
                                    this.zzapi.zzaqy = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    this.zzapi.zzaqy = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.zzapi.zzarb = (int) j;
                                return;
                            case 21949:
                                this.zzapi.zzarc = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new zzhi(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new zzhi(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, double d) {
        if (i == 181) {
            this.zzapi.zzagt = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.zzapi.zzard = (float) d;
                    return;
                case 21970:
                    this.zzapi.zzare = (float) d;
                    return;
                case 21971:
                    this.zzapi.zzarf = (float) d;
                    return;
                case 21972:
                    this.zzapi.zzarg = (float) d;
                    return;
                case 21973:
                    this.zzapi.zzarh = (float) d;
                    return;
                case 21974:
                    this.zzapi.zzari = (float) d;
                    return;
                case 21975:
                    this.zzapi.zzarj = (float) d;
                    return;
                case 21976:
                    this.zzapi.zzark = (float) d;
                    return;
                case 21977:
                    this.zzapi.zzarl = (float) d;
                    return;
                case 21978:
                    this.zzapi.zzarm = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.zzaph = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, String str) throws zzhi {
        if (i == 134) {
            this.zzapi.zzaqo = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                String unused = this.zzapi.zzagz = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhi(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ff, code lost:
        throw new com.google.android.gms.internal.ads.zzhi("EBML lacing sample size out of range.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r22, int r23, com.google.android.gms.internal.ads.zzjl r24) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            if (r1 == r4) goto L_0x0097
            if (r1 == r5) goto L_0x0097
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0089
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x007a
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x005b
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x004d
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0034
            com.google.android.gms.internal.ads.zzkd r1 = r0.zzapi
            byte[] r4 = new byte[r2]
            r1.zzagq = r4
            com.google.android.gms.internal.ads.zzkd r1 = r0.zzapi
            byte[] r1 = r1.zzagq
            r3.readFully(r1, r6, r2)
            return
        L_0x0034:
            com.google.android.gms.internal.ads.zzhi r2 = new com.google.android.gms.internal.ads.zzhi
            r3 = 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected id: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x004d:
            com.google.android.gms.internal.ads.zzkd r1 = r0.zzapi
            byte[] r4 = new byte[r2]
            r1.zzaqt = r4
            com.google.android.gms.internal.ads.zzkd r1 = r0.zzapi
            byte[] r1 = r1.zzaqt
            r3.readFully(r1, r6, r2)
            return
        L_0x005b:
            com.google.android.gms.internal.ads.zzos r1 = r0.zzaoy
            byte[] r1 = r1.data
            java.util.Arrays.fill(r1, r6)
            com.google.android.gms.internal.ads.zzos r1 = r0.zzaoy
            byte[] r1 = r1.data
            int r4 = 4 - r2
            r3.readFully(r1, r4, r2)
            com.google.android.gms.internal.ads.zzos r1 = r0.zzaoy
            r1.zzbi(r6)
            com.google.android.gms.internal.ads.zzos r1 = r0.zzaoy
            long r1 = r1.zzjb()
            int r2 = (int) r1
            r0.zzapk = r2
            return
        L_0x007a:
            byte[] r1 = new byte[r2]
            r3.readFully(r1, r6, r2)
            com.google.android.gms.internal.ads.zzkd r2 = r0.zzapi
            com.google.android.gms.internal.ads.zzjw r3 = new com.google.android.gms.internal.ads.zzjw
            r3.<init>(r7, r1)
            r2.zzaqs = r3
            return
        L_0x0089:
            com.google.android.gms.internal.ads.zzkd r1 = r0.zzapi
            byte[] r4 = new byte[r2]
            r1.zzaqr = r4
            com.google.android.gms.internal.ads.zzkd r1 = r0.zzapi
            byte[] r1 = r1.zzaqr
            r3.readFully(r1, r6, r2)
            return
        L_0x0097:
            int r4 = r0.zzapt
            r8 = 8
            if (r4 != 0) goto L_0x00bc
            com.google.android.gms.internal.ads.zzkf r4 = r0.zzaof
            long r9 = r4.zza(r3, r6, r7, r8)
            int r4 = (int) r9
            r0.zzapz = r4
            com.google.android.gms.internal.ads.zzkf r4 = r0.zzaof
            int r4 = r4.zzgv()
            r0.zzaqa = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzapv = r9
            r0.zzapt = r7
            com.google.android.gms.internal.ads.zzos r4 = r0.zzaow
            r4.reset()
        L_0x00bc:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzkd> r4 = r0.zzaos
            int r9 = r0.zzapz
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.internal.ads.zzkd r4 = (com.google.android.gms.internal.ads.zzkd) r4
            if (r4 != 0) goto L_0x00d2
            int r1 = r0.zzaqa
            int r1 = r2 - r1
            r3.zzae(r1)
            r0.zzapt = r6
            return
        L_0x00d2:
            int r9 = r0.zzapt
            if (r9 != r7) goto L_0x0285
            r9 = 3
            r0.zzb(r3, r9)
            com.google.android.gms.internal.ads.zzos r10 = r0.zzaow
            byte[] r10 = r10.data
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r7
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00fa
            r0.zzapx = r7
            int[] r10 = r0.zzapy
            int[] r10 = zza((int[]) r10, (int) r7)
            r0.zzapy = r10
            int r13 = r0.zzaqa
            int r2 = r2 - r13
            int r2 = r2 - r9
            r10[r6] = r2
            goto L_0x0213
        L_0x00fa:
            if (r1 != r5) goto L_0x027d
            r13 = 4
            r0.zzb(r3, r13)
            com.google.android.gms.internal.ads.zzos r14 = r0.zzaow
            byte[] r14 = r14.data
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r7
            r0.zzapx = r14
            int[] r15 = r0.zzapy
            int[] r14 = zza((int[]) r15, (int) r14)
            r0.zzapy = r14
            if (r10 != r11) goto L_0x0120
            int r9 = r0.zzaqa
            int r2 = r2 - r9
            int r2 = r2 - r13
            int r9 = r0.zzapx
            int r2 = r2 / r9
            java.util.Arrays.fill(r14, r6, r9, r2)
            goto L_0x0213
        L_0x0120:
            if (r10 != r7) goto L_0x0157
            r9 = 0
            r10 = 0
        L_0x0124:
            int r14 = r0.zzapx
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x014b
            int[] r14 = r0.zzapy
            r14[r9] = r6
        L_0x012e:
            int r13 = r13 + r7
            r0.zzb(r3, r13)
            com.google.android.gms.internal.ads.zzos r14 = r0.zzaow
            byte[] r14 = r14.data
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.zzapy
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x012e
            r14 = r15[r9]
            int r10 = r10 + r14
            int r9 = r9 + 1
            goto L_0x0124
        L_0x014b:
            int[] r9 = r0.zzapy
            int r14 = r14 - r7
            int r15 = r0.zzaqa
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x0213
        L_0x0157:
            if (r10 != r9) goto L_0x0264
            r9 = 0
            r10 = 0
        L_0x015b:
            int r14 = r0.zzapx
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x0208
            int[] r14 = r0.zzapy
            r14[r9] = r6
            int r13 = r13 + 1
            r0.zzb(r3, r13)
            com.google.android.gms.internal.ads.zzos r14 = r0.zzaow
            byte[] r14 = r14.data
            int r15 = r13 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x0200
            r16 = 0
            r14 = 0
        L_0x0177:
            if (r14 >= r8) goto L_0x01cb
            int r18 = 7 - r14
            int r5 = r7 << r18
            com.google.android.gms.internal.ads.zzos r11 = r0.zzaow
            byte[] r11 = r11.data
            byte r11 = r11[r15]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01c1
            int r13 = r13 + r14
            r0.zzb(r3, r13)
            com.google.android.gms.internal.ads.zzos r11 = r0.zzaow
            byte[] r11 = r11.data
            int r16 = r15 + 1
            byte r11 = r11[r15]
            r11 = r11 & r12
            int r5 = ~r5
            r5 = r5 & r11
            long r6 = (long) r5
            r5 = r16
            r16 = r6
        L_0x019a:
            if (r5 >= r13) goto L_0x01b3
            long r6 = r16 << r8
            com.google.android.gms.internal.ads.zzos r15 = r0.zzaow
            byte[] r15 = r15.data
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r12
            long r11 = (long) r5
            long r5 = r6 | r11
            r12 = 255(0xff, float:3.57E-43)
            r19 = r5
            r5 = r16
            r16 = r19
            goto L_0x019a
        L_0x01b3:
            if (r9 <= 0) goto L_0x01cb
            int r14 = r14 * 7
            int r14 = r14 + 6
            r5 = 1
            long r11 = r5 << r14
            long r11 = r11 - r5
            long r16 = r16 - r11
            goto L_0x01cb
        L_0x01c1:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0177
        L_0x01cb:
            r5 = r16
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01f8
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01f8
            int r6 = (int) r5
            int[] r5 = r0.zzapy
            if (r9 != 0) goto L_0x01e1
            goto L_0x01e6
        L_0x01e1:
            int r7 = r9 + -1
            r7 = r5[r7]
            int r6 = r6 + r7
        L_0x01e6:
            r5[r9] = r6
            int[] r5 = r0.zzapy
            r5 = r5[r9]
            int r10 = r10 + r5
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x015b
        L_0x01f8:
            com.google.android.gms.internal.ads.zzhi r1 = new com.google.android.gms.internal.ads.zzhi
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x0200:
            com.google.android.gms.internal.ads.zzhi r1 = new com.google.android.gms.internal.ads.zzhi
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x0208:
            int[] r5 = r0.zzapy
            r6 = 1
            int r14 = r14 - r6
            int r6 = r0.zzaqa
            int r2 = r2 - r6
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x0213:
            com.google.android.gms.internal.ads.zzos r2 = r0.zzaow
            byte[] r2 = r2.data
            r5 = 0
            byte r2 = r2[r5]
            int r2 = r2 << r8
            com.google.android.gms.internal.ads.zzos r5 = r0.zzaow
            byte[] r5 = r5.data
            r6 = 1
            byte r5 = r5[r6]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            r2 = r2 | r5
            long r5 = r0.zzapp
            long r9 = (long) r2
            long r9 = r0.zzea(r9)
            long r5 = r5 + r9
            r0.zzapu = r5
            com.google.android.gms.internal.ads.zzos r2 = r0.zzaow
            byte[] r2 = r2.data
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r8
            if (r2 != r8) goto L_0x023c
            r2 = 1
            goto L_0x023d
        L_0x023c:
            r2 = 0
        L_0x023d:
            int r6 = r4.type
            if (r6 == r5) goto L_0x0253
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x0251
            com.google.android.gms.internal.ads.zzos r6 = r0.zzaow
            byte[] r6 = r6.data
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x0251
            goto L_0x0253
        L_0x0251:
            r5 = 0
            goto L_0x0254
        L_0x0253:
            r5 = 1
        L_0x0254:
            if (r2 == 0) goto L_0x0259
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x025a
        L_0x0259:
            r2 = 0
        L_0x025a:
            r2 = r2 | r5
            r0.zzaqb = r2
            r2 = 2
            r0.zzapt = r2
            r2 = 0
            r0.zzapw = r2
            goto L_0x0285
        L_0x0264:
            com.google.android.gms.internal.ads.zzhi r1 = new com.google.android.gms.internal.ads.zzhi
            r2 = 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected lacing value: "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x027d:
            com.google.android.gms.internal.ads.zzhi r1 = new com.google.android.gms.internal.ads.zzhi
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0285:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x02b0
        L_0x0289:
            int r1 = r0.zzapw
            int r2 = r0.zzapx
            if (r1 >= r2) goto L_0x02ac
            int[] r2 = r0.zzapy
            r1 = r2[r1]
            r0.zza((com.google.android.gms.internal.ads.zzjl) r3, (com.google.android.gms.internal.ads.zzkd) r4, (int) r1)
            long r1 = r0.zzapu
            int r5 = r0.zzapw
            int r6 = r4.zzaqp
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.zza((com.google.android.gms.internal.ads.zzkd) r4, (long) r1)
            int r1 = r0.zzapw
            r2 = 1
            int r1 = r1 + r2
            r0.zzapw = r1
            goto L_0x0289
        L_0x02ac:
            r1 = 0
            r0.zzapt = r1
            return
        L_0x02b0:
            r1 = 0
            int[] r2 = r0.zzapy
            r1 = r2[r1]
            r0.zza((com.google.android.gms.internal.ads.zzjl) r3, (com.google.android.gms.internal.ads.zzkd) r4, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkc.zza(int, int, com.google.android.gms.internal.ads.zzjl):void");
    }

    private final void zza(zzkd zzkd, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(zzkd.zzaqo)) {
            byte[] bArr2 = this.zzapa.data;
            long j2 = this.zzapv;
            if (j2 == -9223372036854775807L) {
                bArr = zzaop;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = zzov.zzbi(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (DurationKt.NANOS_IN_MILLIS * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            zzjt zzjt = zzkd.zzars;
            zzos zzos = this.zzapa;
            zzjt.zza(zzos, zzos.limit());
            this.zzaqk += this.zzapa.limit();
        }
        zzkd.zzars.zza(j, this.zzaqb, this.zzaqk, 0, zzkd.zzaqs);
        this.zzaql = true;
        zzgt();
    }

    private final void zzgt() {
        this.zzaqc = 0;
        this.zzaqk = 0;
        this.zzaqj = 0;
        this.zzaqd = false;
        this.zzaqe = false;
        this.zzaqg = false;
        this.zzaqi = 0;
        this.zzaqh = 0;
        this.zzaqf = false;
        this.zzaoz.reset();
    }

    private final void zzb(zzjl zzjl, int i) throws IOException, InterruptedException {
        if (this.zzaow.limit() < i) {
            if (this.zzaow.capacity() < i) {
                zzos zzos = this.zzaow;
                zzos.zzb(Arrays.copyOf(zzos.data, Math.max(this.zzaow.data.length << 1, i)), this.zzaow.limit());
            }
            zzjl.readFully(this.zzaow.data, this.zzaow.limit(), i - this.zzaow.limit());
            this.zzaow.zzbh(i);
        }
    }

    private final void zza(zzjl zzjl, zzkd zzkd, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzkd.zzaqo)) {
            int length = zzaoo.length + i;
            if (this.zzapa.capacity() < length) {
                this.zzapa.data = Arrays.copyOf(zzaoo, length + i);
            }
            zzjl.readFully(this.zzapa.data, zzaoo.length, i);
            this.zzapa.zzbi(0);
            this.zzapa.zzbh(length);
            return;
        }
        zzjt zzjt = zzkd.zzars;
        if (!this.zzaqd) {
            if (zzkd.zzaqq) {
                this.zzaqb &= -1073741825;
                int i3 = 128;
                if (!this.zzaqe) {
                    zzjl.readFully(this.zzaow.data, 0, 1);
                    this.zzaqc++;
                    if ((this.zzaow.data[0] & 128) != 128) {
                        this.zzaqh = this.zzaow.data[0];
                        this.zzaqe = true;
                    } else {
                        throw new zzhi("Extension bit is set in signal byte");
                    }
                }
                byte b = this.zzaqh;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.zzaqb |= 1073741824;
                    if (!this.zzaqf) {
                        zzjl.readFully(this.zzapb.data, 0, 8);
                        this.zzaqc += 8;
                        this.zzaqf = true;
                        byte[] bArr = this.zzaow.data;
                        if (!z) {
                            i3 = 0;
                        }
                        bArr[0] = (byte) (i3 | 8);
                        this.zzaow.zzbi(0);
                        zzjt.zza(this.zzaow, 1);
                        this.zzaqk++;
                        this.zzapb.zzbi(0);
                        zzjt.zza(this.zzapb, 8);
                        this.zzaqk += 8;
                    }
                    if (z) {
                        if (!this.zzaqg) {
                            zzjl.readFully(this.zzaow.data, 0, 1);
                            this.zzaqc++;
                            this.zzaow.zzbi(0);
                            this.zzaqi = this.zzaow.readUnsignedByte();
                            this.zzaqg = true;
                        }
                        int i4 = this.zzaqi << 2;
                        this.zzaow.reset(i4);
                        zzjl.readFully(this.zzaow.data, 0, i4);
                        this.zzaqc += i4;
                        short s = (short) ((this.zzaqi / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.zzapd;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.zzapd = ByteBuffer.allocate(i5);
                        }
                        this.zzapd.position(0);
                        this.zzapd.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.zzaqi;
                            if (i6 >= i2) {
                                break;
                            }
                            int zzje = this.zzaow.zzje();
                            if (i6 % 2 == 0) {
                                this.zzapd.putShort((short) (zzje - i7));
                            } else {
                                this.zzapd.putInt(zzje - i7);
                            }
                            i6++;
                            i7 = zzje;
                        }
                        int i8 = (i - this.zzaqc) - i7;
                        if (i2 % 2 == 1) {
                            this.zzapd.putInt(i8);
                        } else {
                            this.zzapd.putShort((short) i8);
                            this.zzapd.putInt(0);
                        }
                        this.zzapc.zzb(this.zzapd.array(), i5);
                        zzjt.zza(this.zzapc, i5);
                        this.zzaqk += i5;
                    }
                }
            } else if (zzkd.zzaqr != null) {
                this.zzaoz.zzb(zzkd.zzaqr, zzkd.zzaqr.length);
            }
            this.zzaqd = true;
        }
        int limit = i + this.zzaoz.limit();
        if (!"V_MPEG4/ISO/AVC".equals(zzkd.zzaqo) && !"V_MPEGH/ISO/HEVC".equals(zzkd.zzaqo)) {
            while (true) {
                int i9 = this.zzaqc;
                if (i9 >= limit) {
                    break;
                }
                zza(zzjl, zzjt, limit - i9);
            }
        } else {
            byte[] bArr2 = this.zzaov.data;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = zzkd.zzart;
            int i11 = 4 - zzkd.zzart;
            while (this.zzaqc < limit) {
                int i12 = this.zzaqj;
                if (i12 == 0) {
                    int min = Math.min(i10, this.zzaoz.zziz());
                    zzjl.readFully(bArr2, i11 + min, i10 - min);
                    if (min > 0) {
                        this.zzaoz.zze(bArr2, i11, min);
                    }
                    this.zzaqc += i10;
                    this.zzaov.zzbi(0);
                    this.zzaqj = this.zzaov.zzje();
                    this.zzaou.zzbi(0);
                    zzjt.zza(this.zzaou, 4);
                    this.zzaqk += 4;
                } else {
                    this.zzaqj = i12 - zza(zzjl, zzjt, i12);
                }
            }
        }
        if ("A_VORBIS".equals(zzkd.zzaqo)) {
            this.zzaox.zzbi(0);
            zzjt.zza(this.zzaox, 4);
            this.zzaqk += 4;
        }
    }

    private final int zza(zzjl zzjl, zzjt zzjt, int i) throws IOException, InterruptedException {
        int i2;
        int zziz = this.zzaoz.zziz();
        if (zziz > 0) {
            i2 = Math.min(i, zziz);
            zzjt.zza(this.zzaoz, i2);
        } else {
            i2 = zzjt.zza(zzjl, i, false);
        }
        this.zzaqc += i2;
        this.zzaqk += i2;
        return i2;
    }

    private final long zzea(long j) throws zzhi {
        long j2 = this.zzapg;
        if (j2 != -9223372036854775807L) {
            return zzov.zza(j, j2, 1000);
        }
        throw new zzhi("Can't scale timecode prior to timecodeScale being set.");
    }

    private static int[] zza(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i)];
    }
}
