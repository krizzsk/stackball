package com.smaato.sdk.util;

final class AutoValue_Either<Left, Right> extends Either<Left, Right> {
    private final Left left;
    private final Right right;

    AutoValue_Either(Left left2, Right right2) {
        this.left = left2;
        this.right = right2;
    }

    public final Left left() {
        return this.left;
    }

    public final Right right() {
        return this.right;
    }

    public final String toString() {
        return "Either{left=" + this.left + ", right=" + this.right + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Either) {
            Either either = (Either) obj;
            Left left2 = this.left;
            if (left2 != null ? left2.equals(either.left()) : either.left() == null) {
                Right right2 = this.right;
                return right2 != null ? right2.equals(either.right()) : either.right() == null;
            }
        }
    }

    public final int hashCode() {
        Left left2 = this.left;
        int i = 0;
        int hashCode = ((left2 == null ? 0 : left2.hashCode()) ^ 1000003) * 1000003;
        Right right2 = this.right;
        if (right2 != null) {
            i = right2.hashCode();
        }
        return hashCode ^ i;
    }
}
