package pl.art.tutorial.pattern.factory;

import org.apache.commons.lang3.StringUtils;

public class NumberGeneratorFactory {

    public NumberGenerator create(String type) {

        if (StringUtils.endsWithIgnoreCase(type, "fibonaci")) {
            return new FibonaciNumberGenerator();
        } else if (StringUtils.endsWithIgnoreCase(type, "manual")) {
            return new DefinedNumberGenerator(1,0,50,2, 7, 7,7,7,7,7,77,7,7,7);
        } else {
            return new SequenceNumberGenerator();
        }
    }
}
