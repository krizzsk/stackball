package com.google.android.exoplayer2.text.webvtt;

import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.text.webvtt.-$$Lambda$WebvttSubtitle$bdSuLW0DtIygw7Z-qAnMxtuNsPw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$WebvttSubtitle$bdSuLW0DtIygw7ZqAnMxtuNsPw implements Comparator {
    public static final /* synthetic */ $$Lambda$WebvttSubtitle$bdSuLW0DtIygw7ZqAnMxtuNsPw INSTANCE = new $$Lambda$WebvttSubtitle$bdSuLW0DtIygw7ZqAnMxtuNsPw();

    private /* synthetic */ $$Lambda$WebvttSubtitle$bdSuLW0DtIygw7ZqAnMxtuNsPw() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((WebvttCueInfo) obj).startTimeUs, ((WebvttCueInfo) obj2).startTimeUs);
    }
}
