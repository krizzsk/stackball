package com.smaato.sdk.util;

public abstract class Either<Left, Right> {
    public abstract Left left();

    public abstract Right right();

    public static <Left, Right> Either<Left, Right> left(Left left) {
        if (left != null) {
            return new AutoValue_Either(left, null);
        }
        throw new NullPointerException("'left' specified as non-null is null");
    }

    public static <Left, Right> Either<Left, Right> right(Right right) {
        if (right != null) {
            return new AutoValue_Either(null, right);
        }
        throw new NullPointerException("'right' specified as non-null is null");
    }
}
