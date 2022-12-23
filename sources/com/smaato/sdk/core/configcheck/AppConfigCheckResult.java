package com.smaato.sdk.core.configcheck;

public final class AppConfigCheckResult {
    private final boolean allActivitiesDeclared;
    private final boolean allMandatoryPermissionsDeclared;

    AppConfigCheckResult(boolean z, boolean z2) {
        this.allMandatoryPermissionsDeclared = z;
        this.allActivitiesDeclared = z2;
    }

    public final boolean isAppConfiguredProperly() {
        return this.allMandatoryPermissionsDeclared && this.allActivitiesDeclared;
    }
}
