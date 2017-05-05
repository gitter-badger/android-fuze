package io.gmas.fuze.commons.utils;

import android.support.annotation.Nullable;

public final class BooleanUtils {

    private BooleanUtils() {}

    /**
     * Returns the input boolean negated.
     */
    public static boolean negate(final boolean bool) {
        return !bool;
    }

    /**
     * Returns `false` if the boolean is `null` or `false`, and `true` otherwise.
     */
    public static boolean isTrue(final @Nullable Boolean bool) {
        if (bool != null) {
            return bool;
        }
        return false;
    }

    /**
     * Returns `true` if the boolean is `null` or `false`, and `true` otherwise.
     */
    public static boolean isFalse(final @Nullable Boolean bool) {
        return !isTrue(bool);
    }

}
