package com.smaato.sdk.video.network;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.network.NetworkHttpRequest;
import com.smaato.sdk.core.network.NetworkRequest;
import com.smaato.sdk.core.network.execution.Executioner;
import com.smaato.sdk.core.network.execution.NetworkActions;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.concurrent.ExecutorService;

public class StaticWrapperLoaderExecutioner implements Executioner<String, ParseResult<VastTree>, NetworkClient.Error> {
    private final ExecutorService executorService;
    private final NetworkActions networkActions;
    private final VastParsingConsumerFactory vastParsingConsumerFactory;

    public StaticWrapperLoaderExecutioner(NetworkActions networkActions2, VastParsingConsumerFactory vastParsingConsumerFactory2, ExecutorService executorService2) {
        this.networkActions = (NetworkActions) Objects.requireNonNull(networkActions2, "Parameter networkActions cannot be null for StaticWrapperLoaderExecutioner::new");
        this.executorService = (ExecutorService) Objects.requireNonNull(executorService2, "Parameter executorService cannot be null for StaticWrapperLoaderExecutioner::new");
        this.vastParsingConsumerFactory = (VastParsingConsumerFactory) Objects.requireNonNull(vastParsingConsumerFactory2, "Parameter vastParsingConsumerFactory cannot be null for StaticWrapperLoaderExecutioner::new");
    }

    public Task submitRequest(String str, SomaApiContext somaApiContext, Task.Listener<ParseResult<VastTree>, NetworkClient.Error> listener) {
        Objects.requireNonNull(somaApiContext, "Cannot load Vast Wrapper without SomaApiContext");
        return new WrapperLoadTask(this.networkActions, new NetworkHttpRequest.Builder().setMethod(NetworkRequest.Method.GET).setUrl(str).build(), this.vastParsingConsumerFactory, this.executorService, somaApiContext, listener);
    }
}
