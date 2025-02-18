package edu.hm.hafner.metric;

import static edu.hm.hafner.metric.MutationStatus.LineCoverage.*;

/**
 * Represents all possible outcomes for mutations.
 *
 * @author Melissa Bauer
 */
public enum MutationStatus {
    KILLED(COVERED),
    SURVIVED(COVERED),
    NO_COVERAGE(MISSED),
    NON_VIABLE(UNKNOWN),
    TIMED_OUT(UNKNOWN),
    MEMORY_ERROR(UNKNOWN),
    RUN_ERROR(UNKNOWN);

    private final LineCoverage lineCoverage;

    MutationStatus(final LineCoverage lineCoverage) {
        this.lineCoverage = lineCoverage;
    }

    public boolean isCovered() {
        return lineCoverage == COVERED;
    }

    public boolean isMissed() {
        return lineCoverage == MISSED;
    }

    enum LineCoverage {
        COVERED,
        MISSED,
        UNKNOWN
    }
}
