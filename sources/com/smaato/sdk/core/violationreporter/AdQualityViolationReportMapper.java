package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Objects;

final class AdQualityViolationReportMapper {
    final HeaderUtils headerUtils;
    final Logger logger;

    AdQualityViolationReportMapper(Logger logger2, HeaderUtils headerUtils2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.headerUtils = (HeaderUtils) Objects.requireNonNull(headerUtils2);
    }
}
