package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a90 {

    /* renamed from: c */
    private static final Pattern f30474c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f30475a = -1;

    /* renamed from: b */
    public int f30476b = -1;

    /* renamed from: a */
    public boolean mo65697a(Metadata metadata) {
        for (int i = 0; i < metadata.mo64997c(); i++) {
            Metadata.Entry a = metadata.mo64994a(i);
            if (a instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) a;
                if ("iTunSMPB".equals(commentFrame.f29918d) && m33640a(commentFrame.f29919e)) {
                    return true;
                }
            } else if (a instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) a;
                if ("com.apple.iTunes".equals(internalFrame.f29925c) && "iTunSMPB".equals(internalFrame.f29926d) && m33640a(internalFrame.f29927e)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m33640a(String str) {
        Matcher matcher = f30474c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f30475a = parseInt;
            this.f30476b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
