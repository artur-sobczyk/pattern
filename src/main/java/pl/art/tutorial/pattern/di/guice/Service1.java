package pl.art.tutorial.pattern.di.guice;

import com.google.inject.Inject;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Service1 {

    private Service2 service2;
    private Service3 service3;

    @Inject
    public Service1(Service2 service2, Service3 service3) {
        this.service2 = service2;
        this.service3 = service3;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
