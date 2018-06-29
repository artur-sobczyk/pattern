package pl.art.tutorial.pattern.factory;

import org.apache.commons.lang3.StringUtils;

public class NumberGeneratorFactory {

    public NumberGenerator create(String type) {

        if (StringUtils.endsWithIgnoreCase(type, "fibonaci")) {
            return new FibonaciNumberGenerator();
        } else {
            return new SequenceNumberGenerator();
        }
    }
}
