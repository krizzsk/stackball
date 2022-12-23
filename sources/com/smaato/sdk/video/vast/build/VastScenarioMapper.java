package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class VastScenarioMapper {
    final VastCompanionPicker vastCompanionPicker;
    final VastCompanionScenarioMapper vastCompanionScenarioMapper;
    final VastMediaFileScenarioMapper vastMediaFileScenarioMapper;
    private final VastLinearMediaFilePicker vastMediaFileScenarioPicker;
    final VastScenarioCreativeDataMapper vastScenarioCreativeDataMapper;

    public VastScenarioMapper(VastLinearMediaFilePicker vastLinearMediaFilePicker, VastCompanionPicker vastCompanionPicker2, VastCompanionScenarioMapper vastCompanionScenarioMapper2, VastMediaFileScenarioMapper vastMediaFileScenarioMapper2, VastScenarioCreativeDataMapper vastScenarioCreativeDataMapper2) {
        this.vastMediaFileScenarioPicker = (VastLinearMediaFilePicker) Objects.requireNonNull(vastLinearMediaFilePicker, "Parameter vastLinearMediaFilePicker should be null for VastScenarioPicker::new");
        this.vastCompanionPicker = (VastCompanionPicker) Objects.requireNonNull(vastCompanionPicker2, "Parameter vastCompanionPicker should be null for VastScenarioPicker::new");
        this.vastCompanionScenarioMapper = (VastCompanionScenarioMapper) Objects.requireNonNull(vastCompanionScenarioMapper2, "Parameter vastCompanionScenarioMapper should be null for VastScenarioPicker::new");
        this.vastMediaFileScenarioMapper = (VastMediaFileScenarioMapper) Objects.requireNonNull(vastMediaFileScenarioMapper2, "Parameter vastMediaFileScenarioMapper should be null for VastScenarioPicker::new");
        this.vastScenarioCreativeDataMapper = (VastScenarioCreativeDataMapper) Objects.requireNonNull(vastScenarioCreativeDataMapper2, "Parameter vastScenarioCreativeDataMapper should be null for VastScenarioPicker::new");
    }

    static Set<Integer> pickMediaFile(InLine inLine, VastConfigurationSettings vastConfigurationSettings, TreeMap<MediaFile, CreativeLinearContainer> treeMap) {
        HashSet hashSet = new HashSet();
        Iterator<Creative> it = inLine.creatives.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Creative next = it.next();
            Linear linear = next.linear;
            if (linear != null && !linear.mediaFiles.isEmpty()) {
                MediaFileResult pickMediaFile = VastLinearMediaFilePicker.pickMediaFile(linear.mediaFiles, vastConfigurationSettings);
                if (pickMediaFile.mediaFile != null) {
                    treeMap.put(pickMediaFile.mediaFile, new CreativeLinearContainer(next, linear, (byte) 0));
                    break;
                }
                hashSet.addAll(pickMediaFile.errors);
            }
        }
        return hashSet;
    }

    static final class CreativeLinearContainer {
        public final Creative creative;
        public final Linear linear;

        /* synthetic */ CreativeLinearContainer(Creative creative2, Linear linear2, byte b) {
            this(creative2, linear2);
        }

        private CreativeLinearContainer(Creative creative2, Linear linear2) {
            this.creative = (Creative) Objects.requireNonNull(creative2);
            this.linear = (Linear) Objects.requireNonNull(linear2);
        }
    }
}
