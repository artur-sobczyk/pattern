package pl.art.tutorial.pattern.hallo.print;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.StringUtils;
import pl.art.tutorial.pattern.hallo.ProgramArgument;

import java.util.Map;

import static pl.art.tutorial.pattern.hallo.print.Printer.*;

public class PrinterFactory {

    private static final Map<String, String> map = ImmutableMap.<String, String>builder()
            .put("red", ANSI_RED)
            .put("blue", ANSI_BLUE)
            .put("yellow", ANSI_YELLOW)
            .build();

    public Printer create(ProgramArgument argument) {

        if (StringUtils.isNoneEmpty(argument.getColor())
                && map.keySet().contains(argument.getColor())) {

            return addFilePrinter(new ColorPrintDecorator(new SystemPrinter(), map.get(argument.getColor())));
        } else {
            return addFilePrinter(new SystemPrinter());
        }
    }

    private Printer addFilePrinter(Printer printer) {
        return new CompositePrinter(printer, new FilePrinter());
    }
}
