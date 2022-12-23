package com.smaato.sdk.video.network;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.network.exception.TaskCancelledException;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.network.execution.TaskStepResult;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.parser.ParseResult;
import com.smaato.sdk.video.vast.parser.VastResponseParser;
import java.io.ByteArrayInputStream;

public class VastParsingConsumerFactory {
    private final ErrorMapper<NetworkClient.Error> errorMapper;
    private final Logger logger;
    private final VastResponseParser vastResponseParser;

    public VastParsingConsumerFactory(Logger logger2, VastResponseParser vastResponseParser2, ErrorMapper<NetworkClient.Error> errorMapper2) {
        this.logger = logger2;
        this.vastResponseParser = vastResponseParser2;
        this.errorMapper = errorMapper2;
    }

    /* access modifiers changed from: package-private */
    public final Consumer<TaskStepResult<BodyEncodingPair, Exception>> newVastResponseConsumer(Task task, Task.Listener<ParseResult<VastTree>, NetworkClient.Error> listener) {
        return new Consumer(listener, task) {
            public final /* synthetic */ Task.Listener f$1;
            public final /* synthetic */ Task f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                VastParsingConsumerFactory.this.lambda$newVastResponseConsumer$1$VastParsingConsumerFactory(this.f$1, this.f$2, (TaskStepResult) obj);
            }
        };
    }

    public /* synthetic */ void lambda$newVastResponseConsumer$1$VastParsingConsumerFactory(Task.Listener listener, Task task, TaskStepResult taskStepResult) {
        if (taskStepResult.success != null) {
            this.vastResponseParser.parseVastResponse(this.logger, new ByteArrayInputStream(((BodyEncodingPair) taskStepResult.success).responseBody), ((BodyEncodingPair) taskStepResult.success).encoding, new NonNullConsumer(task) {
                public final /* synthetic */ Task f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    Task.Listener.this.onSuccess(this.f$1, (ParseResult) obj);
                }
            });
        } else if (taskStepResult.isCancelled) {
            listener.onFailure(task, this.errorMapper.map(new TaskCancelledException()));
        } else if (taskStepResult.error != null) {
            listener.onFailure(task, this.errorMapper.map((Exception) taskStepResult.error));
        } else {
            this.logger.error(LogDomain.NETWORK, "Network Task finished in unexpected state: %s", taskStepResult);
            listener.onFailure(task, this.errorMapper.map(new Exception("Generic")));
        }
    }
}
