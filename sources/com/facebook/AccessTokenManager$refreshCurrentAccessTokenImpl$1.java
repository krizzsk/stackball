package com.facebook;

import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.GraphRequestBatch;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "it", "Lcom/facebook/GraphRequestBatch;", "onBatchCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: AccessTokenManager.kt */
final class AccessTokenManager$refreshCurrentAccessTokenImpl$1 implements GraphRequestBatch.Callback {
    final /* synthetic */ AccessToken $accessToken;
    final /* synthetic */ AccessToken.AccessTokenRefreshCallback $callback;
    final /* synthetic */ Set $declinedPermissions;
    final /* synthetic */ Set $expiredPermissions;
    final /* synthetic */ Set $permissions;
    final /* synthetic */ AtomicBoolean $permissionsCallSucceeded;
    final /* synthetic */ AccessTokenManager.RefreshResult $refreshResult;
    final /* synthetic */ AccessTokenManager this$0;

    AccessTokenManager$refreshCurrentAccessTokenImpl$1(AccessTokenManager accessTokenManager, AccessTokenManager.RefreshResult refreshResult, AccessToken accessToken, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
        this.this$0 = accessTokenManager;
        this.$refreshResult = refreshResult;
        this.$accessToken = accessToken;
        this.$callback = accessTokenRefreshCallback;
        this.$permissionsCallSucceeded = atomicBoolean;
        this.$permissions = set;
        this.$declinedPermissions = set2;
        this.$expiredPermissions = set3;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0070=Splitter:B:19:0x0070, B:58:0x0157=Splitter:B:58:0x0157} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBatchCompleted(com.facebook.GraphRequestBatch r27) {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r0 = "it"
            r2 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r2 = r0
            com.facebook.AccessToken r2 = (com.facebook.AccessToken) r2
            com.facebook.AccessTokenManager$RefreshResult r3 = r1.$refreshResult
            java.lang.String r3 = r3.getAccessToken()
            com.facebook.AccessTokenManager$RefreshResult r4 = r1.$refreshResult
            int r4 = r4.getExpiresAt()
            com.facebook.AccessTokenManager$RefreshResult r5 = r1.$refreshResult
            java.lang.Long r5 = r5.getDataAccessExpirationTime()
            com.facebook.AccessTokenManager$RefreshResult r6 = r1.$refreshResult
            java.lang.String r6 = r6.getGraphDomain()
            r7 = 0
            com.facebook.AccessTokenManager$Companion r8 = com.facebook.AccessTokenManager.Companion     // Catch:{ all -> 0x016f }
            com.facebook.AccessTokenManager r8 = r8.getInstance()     // Catch:{ all -> 0x016f }
            com.facebook.AccessToken r8 = r8.getCurrentAccessToken()     // Catch:{ all -> 0x016f }
            if (r8 == 0) goto L_0x0157
            com.facebook.AccessTokenManager$Companion r8 = com.facebook.AccessTokenManager.Companion     // Catch:{ all -> 0x016f }
            com.facebook.AccessTokenManager r8 = r8.getInstance()     // Catch:{ all -> 0x016f }
            com.facebook.AccessToken r8 = r8.getCurrentAccessToken()     // Catch:{ all -> 0x016f }
            if (r8 == 0) goto L_0x0042
            java.lang.String r0 = r8.getUserId()     // Catch:{ all -> 0x016f }
        L_0x0042:
            com.facebook.AccessToken r8 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.lang.String r8 = r8.getUserId()     // Catch:{ all -> 0x016f }
            if (r0 == r8) goto L_0x004c
            goto L_0x0157
        L_0x004c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.$permissionsCallSucceeded     // Catch:{ all -> 0x016f }
            boolean r0 = r0.get()     // Catch:{ all -> 0x016f }
            if (r0 != 0) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            if (r4 != 0) goto L_0x0070
            com.facebook.AccessToken$AccessTokenRefreshCallback r0 = r1.$callback     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0066
            com.facebook.FacebookException r3 = new com.facebook.FacebookException     // Catch:{ all -> 0x016f }
            java.lang.String r4 = "Failed to refresh access token"
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x016f }
            r0.OnTokenRefreshFailed(r3)     // Catch:{ all -> 0x016f }
        L_0x0066:
            com.facebook.AccessTokenManager r0 = r1.this$0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.tokenRefreshInProgress
            r0.set(r7)
            return
        L_0x0070:
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.util.Date r0 = r0.getExpires()     // Catch:{ all -> 0x016f }
            com.facebook.AccessTokenManager$RefreshResult r4 = r1.$refreshResult     // Catch:{ all -> 0x016f }
            int r4 = r4.getExpiresAt()     // Catch:{ all -> 0x016f }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x008f
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x016f }
            com.facebook.AccessTokenManager$RefreshResult r4 = r1.$refreshResult     // Catch:{ all -> 0x016f }
            int r4 = r4.getExpiresAt()     // Catch:{ all -> 0x016f }
            long r10 = (long) r4     // Catch:{ all -> 0x016f }
            long r10 = r10 * r8
            r0.<init>(r10)     // Catch:{ all -> 0x016f }
            goto L_0x00af
        L_0x008f:
            com.facebook.AccessTokenManager$RefreshResult r4 = r1.$refreshResult     // Catch:{ all -> 0x016f }
            int r4 = r4.getExpiresIn()     // Catch:{ all -> 0x016f }
            if (r4 == 0) goto L_0x00af
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x016f }
            r0.<init>()     // Catch:{ all -> 0x016f }
            long r10 = r0.getTime()     // Catch:{ all -> 0x016f }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x016f }
            com.facebook.AccessTokenManager$RefreshResult r4 = r1.$refreshResult     // Catch:{ all -> 0x016f }
            int r4 = r4.getExpiresIn()     // Catch:{ all -> 0x016f }
            long r12 = (long) r4     // Catch:{ all -> 0x016f }
            long r12 = r12 * r8
            long r12 = r12 + r10
            r0.<init>(r12)     // Catch:{ all -> 0x016f }
        L_0x00af:
            r22 = r0
            com.facebook.AccessToken r4 = new com.facebook.AccessToken     // Catch:{ all -> 0x016f }
            if (r3 == 0) goto L_0x00b7
        L_0x00b5:
            r15 = r3
            goto L_0x00be
        L_0x00b7:
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.lang.String r3 = r0.getToken()     // Catch:{ all -> 0x016f }
            goto L_0x00b5
        L_0x00be:
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.lang.String r16 = r0.getApplicationId()     // Catch:{ all -> 0x016f }
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.lang.String r17 = r0.getUserId()     // Catch:{ all -> 0x016f }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.$permissionsCallSucceeded     // Catch:{ all -> 0x016f }
            boolean r0 = r0.get()     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x00d5
            java.util.Set r0 = r1.$permissions     // Catch:{ all -> 0x016f }
            goto L_0x00db
        L_0x00d5:
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.util.Set r0 = r0.getPermissions()     // Catch:{ all -> 0x016f }
        L_0x00db:
            r18 = r0
            java.util.Collection r18 = (java.util.Collection) r18     // Catch:{ all -> 0x016f }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.$permissionsCallSucceeded     // Catch:{ all -> 0x016f }
            boolean r0 = r0.get()     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x00ea
            java.util.Set r0 = r1.$declinedPermissions     // Catch:{ all -> 0x016f }
            goto L_0x00f0
        L_0x00ea:
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.util.Set r0 = r0.getDeclinedPermissions()     // Catch:{ all -> 0x016f }
        L_0x00f0:
            r19 = r0
            java.util.Collection r19 = (java.util.Collection) r19     // Catch:{ all -> 0x016f }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.$permissionsCallSucceeded     // Catch:{ all -> 0x016f }
            boolean r0 = r0.get()     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x00ff
            java.util.Set r0 = r1.$expiredPermissions     // Catch:{ all -> 0x016f }
            goto L_0x0105
        L_0x00ff:
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.util.Set r0 = r0.getExpiredPermissions()     // Catch:{ all -> 0x016f }
        L_0x0105:
            r20 = r0
            java.util.Collection r20 = (java.util.Collection) r20     // Catch:{ all -> 0x016f }
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            com.facebook.AccessTokenSource r21 = r0.getSource()     // Catch:{ all -> 0x016f }
            java.util.Date r23 = new java.util.Date     // Catch:{ all -> 0x016f }
            r23.<init>()     // Catch:{ all -> 0x016f }
            if (r5 == 0) goto L_0x0122
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x016f }
            long r10 = r5.longValue()     // Catch:{ all -> 0x016f }
            long r10 = r10 * r8
            r0.<init>(r10)     // Catch:{ all -> 0x016f }
            goto L_0x0128
        L_0x0122:
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.util.Date r0 = r0.getDataAccessExpirationTime()     // Catch:{ all -> 0x016f }
        L_0x0128:
            r24 = r0
            if (r6 == 0) goto L_0x012f
        L_0x012c:
            r25 = r6
            goto L_0x0136
        L_0x012f:
            com.facebook.AccessToken r0 = r1.$accessToken     // Catch:{ all -> 0x016f }
            java.lang.String r6 = r0.getGraphDomain()     // Catch:{ all -> 0x016f }
            goto L_0x012c
        L_0x0136:
            r14 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x016f }
            com.facebook.AccessTokenManager$Companion r0 = com.facebook.AccessTokenManager.Companion     // Catch:{ all -> 0x0154 }
            com.facebook.AccessTokenManager r0 = r0.getInstance()     // Catch:{ all -> 0x0154 }
            r0.setCurrentAccessToken(r4)     // Catch:{ all -> 0x0154 }
            com.facebook.AccessTokenManager r0 = r1.this$0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.tokenRefreshInProgress
            r0.set(r7)
            com.facebook.AccessToken$AccessTokenRefreshCallback r0 = r1.$callback
            if (r0 == 0) goto L_0x0153
            r0.OnTokenRefreshed(r4)
        L_0x0153:
            return
        L_0x0154:
            r0 = move-exception
            r2 = r4
            goto L_0x0170
        L_0x0157:
            com.facebook.AccessToken$AccessTokenRefreshCallback r0 = r1.$callback     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0165
            com.facebook.FacebookException r3 = new com.facebook.FacebookException     // Catch:{ all -> 0x016f }
            java.lang.String r4 = "No current access token to refresh"
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x016f }
            r0.OnTokenRefreshFailed(r3)     // Catch:{ all -> 0x016f }
        L_0x0165:
            com.facebook.AccessTokenManager r0 = r1.this$0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.tokenRefreshInProgress
            r0.set(r7)
            return
        L_0x016f:
            r0 = move-exception
        L_0x0170:
            com.facebook.AccessTokenManager r3 = r1.this$0
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.tokenRefreshInProgress
            r3.set(r7)
            com.facebook.AccessToken$AccessTokenRefreshCallback r3 = r1.$callback
            if (r3 == 0) goto L_0x0182
            if (r2 == 0) goto L_0x0182
            r3.OnTokenRefreshed(r2)
        L_0x0182:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AccessTokenManager$refreshCurrentAccessTokenImpl$1.onBatchCompleted(com.facebook.GraphRequestBatch):void");
    }
}
