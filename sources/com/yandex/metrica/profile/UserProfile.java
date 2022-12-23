package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10339Hf;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UserProfile {

    /* renamed from: a */
    private final List<UserProfileUpdate<? extends C10339Hf>> f29000a;

    public static class Builder {

        /* renamed from: a */
        private final LinkedList<UserProfileUpdate<? extends C10339Hf>> f29001a = new LinkedList<>();

        Builder() {
        }

        public Builder apply(UserProfileUpdate<? extends C10339Hf> userProfileUpdate) {
            this.f29001a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f29001a);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<UserProfileUpdate<? extends C10339Hf>> getUserProfileUpdates() {
        return this.f29000a;
    }

    private UserProfile(List<UserProfileUpdate<? extends C10339Hf>> list) {
        this.f29000a = Collections.unmodifiableList(list);
    }
}
