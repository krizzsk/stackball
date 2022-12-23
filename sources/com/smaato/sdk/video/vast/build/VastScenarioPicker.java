package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.build.VastScenarioMapper;
import com.smaato.sdk.video.vast.build.VastScenarioResult;
import com.smaato.sdk.video.vast.build.compare.AverageBitratePicker;
import com.smaato.sdk.video.vast.build.compare.BitrateComparator;
import com.smaato.sdk.video.vast.build.compare.MediaFileComparator;
import com.smaato.sdk.video.vast.build.compare.SizeComparator;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastRawScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.smaato.sdk.video.vast.utils.VastVideoPlayerTimeConverterUtils;
import com.tapjoy.TapjoyConstants;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VastScenarioPicker {
    private final InLineAdContainerPicker inLineAdContainerPicker;
    private final VastScenarioMapper vastScenarioMapper;
    private final VastScenarioWrapperMapper vastScenarioWrapperMapper;
    private final VastScenarioWrapperMerger vastScenarioWrapperMerger;
    private final WrapperAdContainerPicker wrapperAdContainerPicker;

    public VastScenarioPicker(InLineAdContainerPicker inLineAdContainerPicker2, WrapperAdContainerPicker wrapperAdContainerPicker2, VastScenarioWrapperMerger vastScenarioWrapperMerger2, VastScenarioMapper vastScenarioMapper2, VastScenarioWrapperMapper vastScenarioWrapperMapper2) {
        this.inLineAdContainerPicker = (InLineAdContainerPicker) Objects.requireNonNull(inLineAdContainerPicker2, "Parameter inLineAdContainerPicker should be null for VastScenarioPicker::new");
        this.wrapperAdContainerPicker = (WrapperAdContainerPicker) Objects.requireNonNull(wrapperAdContainerPicker2, "Parameter wrapperAdContainerPicker should be null for VastScenarioPicker::new");
        this.vastScenarioWrapperMerger = (VastScenarioWrapperMerger) Objects.requireNonNull(vastScenarioWrapperMerger2, "Parameter vastScenarioWrapperMerger should be null for VastScenarioPicker::new");
        this.vastScenarioMapper = (VastScenarioMapper) Objects.requireNonNull(vastScenarioMapper2, "Parameter vastScenarioMapper should be null for VastScenarioPicker::new");
        this.vastScenarioWrapperMapper = (VastScenarioWrapperMapper) Objects.requireNonNull(vastScenarioWrapperMapper2, "Parameter vastScenarioWrapperMapper should be null for VastScenarioPicker::new");
    }

    public VastScenarioResult pickVastScenario(Logger logger, VastTree vastTree, VastConfigurationSettings vastConfigurationSettings) {
        VastCompanionScenario vastCompanionScenario;
        VastScenarioResult.Builder builder;
        HashSet hashSet;
        VastScenarioResult vastScenarioResult;
        Logger logger2 = logger;
        VastTree vastTree2 = vastTree;
        VastConfigurationSettings vastConfigurationSettings2 = vastConfigurationSettings;
        Objects.requireNonNull(logger2, "Parameter logger should not be null for VastScenarioPicker::pickVastScenario");
        Objects.requireNonNull(vastTree2, "Parameter vastTree should not be null for VastScenarioPicker::pickVastScenario");
        Objects.requireNonNull(vastConfigurationSettings2, "Parameter vastConfigurationSettings should not be null for VastScenarioPicker::pickVastScenario");
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet(vastTree2.errors);
        VastScenarioResult.Builder errorUrls = new VastScenarioResult.Builder().setErrors(hashSet2).setErrorUrls(hashSet3);
        if (vastTree2.ads.isEmpty()) {
            return errorUrls.build();
        }
        AdContainer<InLine> pickInLineContainer = InLineAdContainerPicker.pickInLineContainer(vastTree2.ads);
        if (pickInLineContainer != null) {
            VastScenarioMapper vastScenarioMapper2 = this.vastScenarioMapper;
            InLine inLine = (InLine) pickInLineContainer.model;
            Objects.requireNonNull(logger);
            Objects.requireNonNull(vastConfigurationSettings);
            HashSet hashSet4 = new HashSet();
            VastScenarioResult.Builder errorUrls2 = new VastScenarioResult.Builder().setErrors(hashSet4).setErrorUrls(new HashSet(inLine.errors));
            TreeMap treeMap = new TreeMap(new MediaFileComparator(new SizeComparator(vastConfigurationSettings2), new BitrateComparator(new AverageBitratePicker(vastConfigurationSettings2).getAverageBitrate(), TapjoyConstants.TJC_CONNECTION_TYPE_WIFI.equalsIgnoreCase(vastConfigurationSettings2.connectionType))));
            Set<Integer> pickMediaFile = VastScenarioMapper.pickMediaFile(inLine, vastConfigurationSettings2, treeMap);
            if (treeMap.isEmpty()) {
                if (pickMediaFile.isEmpty()) {
                    hashSet4.add(Integer.valueOf(ErrorCode.GENERAL_LINEAR_ERROR));
                } else {
                    hashSet4.addAll(pickMediaFile);
                }
                vastScenarioResult = errorUrls2.build();
                hashSet = hashSet3;
                builder = errorUrls;
            } else {
                Map.Entry firstEntry = treeMap.firstEntry();
                Creative creative = ((VastScenarioMapper.CreativeLinearContainer) firstEntry.getValue()).creative;
                Linear linear = ((VastScenarioMapper.CreativeLinearContainer) firstEntry.getValue()).linear;
                MediaFile mediaFile = (MediaFile) firstEntry.getKey();
                VastScenarioCreativeData mapVastScenarioCreativeData = vastScenarioMapper2.vastScenarioCreativeDataMapper.mapVastScenarioCreativeData(creative);
                VastMediaFileScenarioMapper vastMediaFileScenarioMapper = vastScenarioMapper2.vastMediaFileScenarioMapper;
                Objects.requireNonNull(linear);
                Objects.requireNonNull(mediaFile);
                Objects.requireNonNull(linear);
                Objects.requireNonNull(mapVastScenarioCreativeData);
                VastIconScenario pickIconScenario = vastMediaFileScenarioMapper.vastIconScenarioPicker.pickIconScenario(logger2, linear.icons);
                hashSet = hashSet3;
                builder = errorUrls;
                long convertDurationStringToMilliseconds = VastVideoPlayerTimeConverterUtils.convertDurationStringToMilliseconds(linear.duration, logger2);
                HashSet hashSet5 = hashSet4;
                VastScenarioResult.Builder builder2 = errorUrls2;
                VastMediaFileScenario build = new VastMediaFileScenario.Builder().setVastScenarioCreativeData(mapVastScenarioCreativeData).setTrackingEvents(linear.trackingEvents).setMediaFile(mediaFile).setVastIconScenario(pickIconScenario).setVideoClicks(linear.videoClicks).setAdParameters(linear.adParameters).setSkipOffset(VastVideoPlayerTimeConverterUtils.convertOffsetStringToMilliseconds(linear.skipOffset, convertDurationStringToMilliseconds, logger2)).setDuration(convertDurationStringToMilliseconds).build();
                VastCompanionScenario vastCompanionScenario2 = null;
                Companion pickCompanion = creative.companionAds != null ? vastScenarioMapper2.vastCompanionPicker.pickCompanion(creative.companionAds, vastConfigurationSettings2) : null;
                if (pickCompanion == null) {
                    pickCompanion = vastScenarioMapper2.vastCompanionPicker.pickCompanion(inLine.creatives, vastConfigurationSettings2);
                }
                if (pickCompanion != null) {
                    vastCompanionScenario2 = vastScenarioMapper2.vastCompanionScenarioMapper.mapVastCompanionScenario(logger2, pickCompanion, mapVastScenarioCreativeData);
                } else if (creative.hasCompanions()) {
                    hashSet5.add(600);
                }
                vastScenarioResult = builder2.setVastScenario(new VastScenario.Builder().setAdSystem(inLine.adSystem).setAdTitle(inLine.adTitle).setAdVerifications(inLine.adVerifications).setAdvertiser(inLine.advertiser).setCategories(inLine.categories).setDescription(inLine.description).setErrors(inLine.errors).setImpressions(inLine.impressions).setViewableImpression(inLine.viewableImpression).setVastMediaFileScenario(build).setVastCompanionScenario(vastCompanionScenario2).setAdServingId(inLine.adServingId).build()).build();
            }
            hashSet2.addAll(vastScenarioResult.errors);
            hashSet.addAll(vastScenarioResult.errorUrls);
            return builder.setVastScenario(vastScenarioResult.vastScenario).build();
        }
        AdContainer<Wrapper> pickWrapperContainer = WrapperAdContainerPicker.pickWrapperContainer(vastTree2.ads);
        if (pickWrapperContainer != null) {
            Wrapper wrapper = (Wrapper) pickWrapperContainer.model;
            hashSet3.addAll(wrapper.errors);
            if (wrapper.vastTree != null) {
                VastRawScenario mapVastScenarioForWrapper = this.vastScenarioWrapperMapper.mapVastScenarioForWrapper(logger2, wrapper, vastConfigurationSettings2);
                hashSet3.addAll(mapVastScenarioForWrapper.errors);
                VastScenarioResult pickVastScenario = pickVastScenario(logger2, wrapper.vastTree, vastConfigurationSettings2);
                hashSet2.addAll(pickVastScenario.errors);
                hashSet3.addAll(pickVastScenario.errorUrls);
                if (pickVastScenario.vastScenario != null) {
                    VastScenarioWrapperMerger vastScenarioWrapperMerger2 = this.vastScenarioWrapperMerger;
                    VastScenario vastScenario = pickVastScenario.vastScenario;
                    VastScenario.Builder blockedAdCategories = vastScenario.newBuilder().setImpressions(VastScenarioMergeUtils.merge(vastScenario.impressions, mapVastScenarioForWrapper.impressions)).setAdVerifications(VastScenarioMergeUtils.merge(vastScenario.adVerifications, mapVastScenarioForWrapper.adVerifications)).setCategories(VastScenarioMergeUtils.merge(vastScenario.categories, mapVastScenarioForWrapper.categories)).setErrors(VastScenarioMergeUtils.merge(vastScenario.errors, mapVastScenarioForWrapper.errors)).setViewableImpression(vastScenarioWrapperMerger2.viewableImpressionMerger.merge(vastScenario.viewableImpression, mapVastScenarioForWrapper.viewableImpression)).setBlockedAdCategories(VastScenarioMergeUtils.merge(vastScenario.blockedAdCategories, mapVastScenarioForWrapper.blockedAdCategories));
                    VastMediaFileScenario vastMediaFileScenario = vastScenario.vastMediaFileScenario;
                    blockedAdCategories.setVastMediaFileScenario(vastScenarioWrapperMerger2.vastMediaFileScenarioMerger.merge(vastMediaFileScenario, mapVastScenarioForWrapper.vastRawMediaFileScenarios));
                    UniversalAdId universalAdId = vastMediaFileScenario.vastScenarioCreativeData.universalAdId;
                    VastCompanionScenario vastCompanionScenario3 = vastScenario.vastCompanionScenario;
                    if (vastCompanionScenario3 == null) {
                        vastCompanionScenario = vastScenarioWrapperMerger2.wrapperCompanionScenarioPicker.pickWrapperCompanionScenario(universalAdId, mapVastScenarioForWrapper.vastCompanionScenarios, vastConfigurationSettings2);
                    } else {
                        vastCompanionScenario = vastScenarioWrapperMerger2.vastCompanionScenarioMerger.merge(vastCompanionScenario3, mapVastScenarioForWrapper.vastCompanionScenarios);
                    }
                    if (vastCompanionScenario != null) {
                        blockedAdCategories.setVastCompanionScenario(vastCompanionScenario);
                    }
                    errorUrls.setVastScenario(blockedAdCategories.build());
                }
                return errorUrls.build();
            }
        }
        return errorUrls.build();
    }
}
