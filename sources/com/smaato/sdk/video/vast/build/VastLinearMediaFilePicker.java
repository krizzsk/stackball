package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.build.MediaFileResult;
import com.smaato.sdk.video.vast.build.compare.AverageBitratePicker;
import com.smaato.sdk.video.vast.build.compare.BitrateComparator;
import com.smaato.sdk.video.vast.build.compare.MediaFileComparator;
import com.smaato.sdk.video.vast.build.compare.SizeComparator;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class VastLinearMediaFilePicker {
    static MediaFileResult pickMediaFile(List<MediaFile> list, VastConfigurationSettings vastConfigurationSettings) {
        if (list.isEmpty()) {
            return new MediaFileResult.Builder().build();
        }
        HashSet hashSet = new HashSet();
        ArrayList<MediaFile> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList, new MediaFileComparator(new SizeComparator(vastConfigurationSettings), new BitrateComparator(new AverageBitratePicker(vastConfigurationSettings).getAverageBitrate(), TapjoyConstants.TJC_CONNECTION_TYPE_WIFI.equalsIgnoreCase(vastConfigurationSettings.connectionType))));
        for (MediaFile mediaFile : arrayList) {
            if (mediaFile.isVpaid()) {
                hashSet.add(Integer.valueOf(ErrorCode.GENERAL_VPAID_ERROR));
            } else {
                String substring = mediaFile.url.substring(mediaFile.url.lastIndexOf(".") + 1);
                if ((mediaFile.type != null && mediaFile.type.matches("video/.*(?i)(mp4|3gp|mp2t|webm|mkv)")) || substring.matches("(?i)^(mp4|3gp|mp2t|webm|mkv)$")) {
                    return new MediaFileResult.Builder().setMediaFile(mediaFile).build();
                }
            }
        }
        hashSet.add(Integer.valueOf(ErrorCode.COULD_NOT_FIND_SUPPORTED_MEDIA_FILE_ERROR));
        return new MediaFileResult.Builder().setErrors(hashSet).build();
    }
}
