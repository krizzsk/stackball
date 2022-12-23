package com.smaato.sdk.iahb;

import com.smaato.sdk.iahb.InAppBiddingException;
import com.smaato.sdk.log.Logger;
import com.smaato.sdk.util.Consumer;
import com.smaato.sdk.util.Either;
import com.smaato.sdk.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public final class SmaatoSdkInAppBidding {
    private SmaatoSdkInAppBidding() {
    }

    public static String saveBid(InAppBid inAppBid) throws InAppBiddingException {
        if (inAppBid != null) {
            AtomicReference atomicReference = new AtomicReference();
            Optional.m24104of(IahbModule.getComponent()).ifPresent(new Consumer(atomicReference) {
                public final /* synthetic */ AtomicReference f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((IahbComponent) obj).interactor().saveBid(InAppBid.this, new Consumer(this.f$1) {
                        public final /* synthetic */ AtomicReference f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void accept(Object obj) {
                            this.f$0.set(Either.left((String) obj));
                        }
                    }, new Consumer(this.f$1) {
                        public final /* synthetic */ AtomicReference f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void accept(Object obj) {
                            this.f$0.set(Either.right((InAppBiddingException) obj));
                        }
                    });
                }
            }).ifEmpty(new Runnable(atomicReference) {
                public final /* synthetic */ AtomicReference f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    SmaatoSdkInAppBidding.lambda$saveBid$3(this.f$0);
                }
            });
            String str = (String) ((Either) atomicReference.get()).left();
            if (str != null) {
                return str;
            }
            InAppBiddingException inAppBiddingException = (InAppBiddingException) ((Either) atomicReference.get()).right();
            if (inAppBiddingException != null) {
                throw inAppBiddingException;
            }
            throw new InAppBiddingException(InAppBiddingException.InApBiddingError.INTERNAL_ERROR);
        }
        throw new NullPointerException("'inAppBid' specified as non-null is null");
    }

    static /* synthetic */ void lambda$saveBid$3(AtomicReference atomicReference) {
        Logger.m24077e("InAppBidding module was not initialized", new Object[0]);
        atomicReference.set(Either.right(new InAppBiddingException(InAppBiddingException.InApBiddingError.NOT_INITIALISED)));
    }
}
