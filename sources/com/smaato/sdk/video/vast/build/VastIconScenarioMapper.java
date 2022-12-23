package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Icon;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;
import com.smaato.sdk.video.vast.utils.VastVideoPlayerTimeConverterUtils;

public class VastIconScenarioMapper {
    static VastIconScenario mapVastIconScenario(Logger logger, Icon icon) {
        Objects.requireNonNull(logger);
        try {
            VastScenarioResourceData build = new VastScenarioResourceData.Builder().setStaticResource(icon.staticResources.isEmpty() ? null : icon.staticResources.get(0)).setHtmlResources(icon.htmlResources.isEmpty() ? null : icon.htmlResources.get(0)).setIFrameResources(icon.iFrameResources.isEmpty() ? null : icon.iFrameResources.get(0)).build();
            long convertDurationStringToMilliseconds = VastVideoPlayerTimeConverterUtils.convertDurationStringToMilliseconds(icon.duration, logger);
            return new VastIconScenario.Builder().setVastScenarioResourceData(build).setIconClicks(icon.iconClicks).setIconViewTrackings(icon.iconViewTrackings).setWidth(icon.width).setHeight(icon.height).setXPosition(icon.xPosition).setYPosition(icon.yPosition).setPxRatio(icon.pxRatio).setOffset(VastVideoPlayerTimeConverterUtils.convertOffsetStringToMilliseconds(icon.offset, convertDurationStringToMilliseconds, logger)).setProgram(icon.program).setApiFramework(icon.apiFramework).setDuration(convertDurationStringToMilliseconds).build();
        } catch (VastElementMissingException e) {
            logger.error(LogDomain.VAST, e, "Cannot build VastIconScenario", new Object[0]);
            return null;
        }
    }
}
