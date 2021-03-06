package com.palantir.semver;

public class SemanticVersions {

    private SemanticVersions() {
        // prevents instantiation
    }

    public static SemanticVersion parse(String versionString) {
        return DefaultSemanticVersion.createFromString(versionString);
    }

    public static boolean isValid(String versionString) {
        return DefaultSemanticVersion.isValid(versionString);
    }

    public static SemanticVersion parse(String prefix, String versionString) {
        return PrefixSemanticVersion.createFromString(prefix, versionString);
    }

    public static boolean isValid(String prefix, String versionString) {
        return PrefixSemanticVersion.isValid(prefix, versionString);
    }
}
