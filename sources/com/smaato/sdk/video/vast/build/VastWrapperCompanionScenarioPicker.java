package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.build.compare.SizeComparator;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VastWrapperCompanionScenarioPicker {
    public VastCompanionScenario pickWrapperCompanionScenario(UniversalAdId universalAdId, List<VastCompanionScenario> list, VastConfigurationSettings vastConfigurationSettings) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Objects.requireNonNull(universalAdId, "Parameter universalAdId should not be null for VastWrapperCompanionScenarioPicker::pickWrapperCompanionScenario");
        Objects.requireNonNull(list, "Parameter wrapperVastCompanionScenarios should not be null for VastWrapperCompanionScenarioPicker::pickWrapperCompanionScenario");
        Objects.requireNonNull(vastConfigurationSettings, "Parameter vastConfigurationSettings should not be null for VastWrapperCompanionScenarioPicker::pickWrapperCompanionScenario");
        if (list.isEmpty()) {
            return null;
        }
        if (universalAdId.equals(UniversalAdId.DEFAULT)) {
            arrayList2 = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (VastCompanionScenario next : list) {
                if (next.vastScenarioCreativeData.universalAdId.equals(universalAdId)) {
                    arrayList.add(next);
                } else if (next.vastScenarioCreativeData.universalAdId.equals(UniversalAdId.DEFAULT)) {
                    arrayList3.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList3.isEmpty() ? new ArrayList(list) : arrayList3;
            }
            Collections.sort(arrayList, new SizeComparator(vastConfigurationSettings));
            return (VastCompanionScenario) arrayList.get(0);
        }
        arrayList = arrayList2;
        Collections.sort(arrayList, new SizeComparator(vastConfigurationSettings));
        return (VastCompanionScenario) arrayList.get(0);
    }
}
