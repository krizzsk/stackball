package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationException;
import com.smaato.sdk.core.network.exception.HttpsOnlyPolicyViolationOnRedirectException;
import com.smaato.sdk.core.network.exception.NetworkNotAvailableException;
import com.smaato.sdk.core.network.exception.TaskCancelledException;
import com.smaato.sdk.core.network.exception.TooManyRedirectsException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public interface ErrorMapper<Error> {
    public static final ErrorMapper<Exception> IDENTITY = $$Lambda$ErrorMapper$9F32x66fyM17Fk_g8unc9U1bd4.INSTANCE;
    public static final ErrorMapper<NetworkLayerException> NETWORK_LAYER_EXCEPTION = $$Lambda$ErrorMapper$cTKjTZ76IfhPB84ccInosuR1jXM.INSTANCE;
    public static final ErrorMapper<NetworkClient.Error> STANDARD = $$Lambda$ErrorMapper$tcmkWLZqlwKVrPymfv2wfOe9tS4.INSTANCE;

    Error map(Exception exc);

    /* renamed from: com.smaato.sdk.core.network.execution.ErrorMapper$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Exception lambda$static$2(Exception exc) {
            return exc;
        }

        public static /* synthetic */ NetworkClient.Error lambda$static$0(Exception exc) {
            try {
                throw exc;
            } catch (TaskCancelledException unused) {
                return NetworkClient.Error.CANCELLED;
            } catch (ProtocolException unused2) {
                return NetworkClient.Error.IO_ERROR;
            } catch (UnknownHostException unused3) {
                return NetworkClient.Error.IO_ERROR;
            } catch (SocketException unused4) {
                return NetworkClient.Error.IO_ERROR;
            } catch (NetworkNotAvailableException unused5) {
                return NetworkClient.Error.NO_NETWORK_CONNECTION;
            } catch (SocketTimeoutException unused6) {
                return NetworkClient.Error.TIMEOUT;
            } catch (IOException unused7) {
                return NetworkClient.Error.IO_ERROR;
            } catch (HttpsOnlyPolicyViolationException | HttpsOnlyPolicyViolationOnRedirectException unused8) {
                return NetworkClient.Error.GENERIC;
            } catch (TooManyRedirectsException unused9) {
                return NetworkClient.Error.IO_TOO_MANY_REDIRECTS;
            } catch (Exception unused10) {
                return NetworkClient.Error.GENERIC;
            }
        }

        public static /* synthetic */ NetworkLayerException lambda$static$1(Exception exc) {
            return new NetworkLayerException(ErrorMapper.STANDARD.map(exc), exc);
        }
    }
}
