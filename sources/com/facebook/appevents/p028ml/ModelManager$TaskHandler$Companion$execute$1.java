package com.facebook.appevents.p028ml;

import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.p028ml.ModelManager;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "onComplete"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.ml.ModelManager$TaskHandler$Companion$execute$1 */
/* compiled from: ModelManager.kt */
final class ModelManager$TaskHandler$Companion$execute$1 implements FileDownloadTask.Callback {
    final /* synthetic */ List $slaves;

    ModelManager$TaskHandler$Companion$execute$1(List list) {
        this.$slaves = list;
    }

    public final void onComplete(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        final C2085Model build = C2085Model.Companion.build(file);
        if (build != null) {
            for (final ModelManager.TaskHandler taskHandler : this.$slaves) {
                ModelManager.TaskHandler.Companion.download(taskHandler.getRuleUri(), taskHandler.getUseCase() + "_" + taskHandler.getVersionId() + "_rule", new FileDownloadTask.Callback() {
                    public final void onComplete(File file) {
                        Intrinsics.checkNotNullParameter(file, "file");
                        taskHandler.setModel(build);
                        taskHandler.setRuleFile(file);
                        Runnable access$getOnPostExecute$p = taskHandler.onPostExecute;
                        if (access$getOnPostExecute$p != null) {
                            access$getOnPostExecute$p.run();
                        }
                    }
                });
            }
        }
    }
}
