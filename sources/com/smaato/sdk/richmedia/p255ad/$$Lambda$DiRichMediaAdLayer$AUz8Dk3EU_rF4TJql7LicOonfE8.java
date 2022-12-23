package com.smaato.sdk.richmedia.p255ad;

import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.util.StateMachine;
import java.util.Arrays;

/* renamed from: com.smaato.sdk.richmedia.ad.-$$Lambda$DiRichMediaAdLayer$AUz8Dk3EU_rF4TJql7LicOonfE8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiRichMediaAdLayer$AUz8Dk3EU_rF4TJql7LicOonfE8 implements ClassFactory {
    public static final /* synthetic */ $$Lambda$DiRichMediaAdLayer$AUz8Dk3EU_rF4TJql7LicOonfE8 INSTANCE = new $$Lambda$DiRichMediaAdLayer$AUz8Dk3EU_rF4TJql7LicOonfE8();

    private /* synthetic */ $$Lambda$DiRichMediaAdLayer$AUz8Dk3EU_rF4TJql7LicOonfE8() {
    }

    public final Object get(DiConstructor diConstructor) {
        return new StateMachine.Builder().setInitialState(AdStateMachine.State.INIT).addTransition(AdStateMachine.Event.INITIALISE, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.CREATED})).addTransition(AdStateMachine.Event.ADDED_ON_SCREEN, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.ON_SCREEN})).addTransition(AdStateMachine.Event.IMPRESSION, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.IMPRESSED})).addTransition(AdStateMachine.Event.CLICK, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.IMPRESSED, AdStateMachine.State.CLICKED, AdStateMachine.State.COMPLETE})).addTransition(AdStateMachine.Event.CLICK, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.IMPRESSED, AdStateMachine.State.CLICKED, AdStateMachine.State.COMPLETE})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.DESTROY, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.CREATED})).addTransition(AdStateMachine.Event.DESTROY, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.IMPRESSED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.DESTROY, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.COMPLETE, AdStateMachine.State.TO_BE_DELETED})).build();
    }
}
