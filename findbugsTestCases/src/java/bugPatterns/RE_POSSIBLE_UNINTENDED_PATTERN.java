package bugPatterns;

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

public class RE_POSSIBLE_UNINTENDED_PATTERN {

    @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
    String [] bug1(String any) {
        return any.split(".");
    }

    @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
    String bug2(String any, String any2) {
        return any.replaceAll(".", any2);
    }

    @ExpectWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
    String bug3(String any, String any2) {
        return any.replaceFirst(".", any2);
    }

    @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
    String notBug1(String any) {
        return any.replaceAll(".", "*");
    }

    @NoWarning("RE_POSSIBLE_UNINTENDED_PATTERN")
    int notBug2(String any) {
        return any.indexOf(".");
    }
}
