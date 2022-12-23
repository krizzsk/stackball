package com.ogury.p245ed.internal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ch */
public final class C8100ch {
    /* renamed from: a */
    public static final List<Fragment> m22577a(FragmentManager fragmentManager) {
        C8467mq.m23881b(fragmentManager, "<this>");
        List<Fragment> arrayList = new ArrayList<>();
        m22578a(arrayList, fragmentManager);
        return arrayList;
    }

    /* renamed from: a */
    private static final void m22578a(List<Fragment> list, FragmentManager fragmentManager) {
        List<Fragment> fragments = fragmentManager.getFragments();
        C8467mq.m23878a((Object) fragments, "fm.fragments");
        for (Fragment fragment : fragments) {
            if (fragment.getUserVisibleHint() && fragment.isResumed() && !fragment.isHidden()) {
                C8467mq.m23878a((Object) fragment, "it");
                list.add(fragment);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                C8467mq.m23878a((Object) childFragmentManager, "it.childFragmentManager");
                m22578a(list, childFragmentManager);
            }
        }
    }
}
