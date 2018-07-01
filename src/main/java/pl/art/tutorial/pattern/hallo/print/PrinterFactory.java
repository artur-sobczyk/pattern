package pl.art.tutorial.pattern.hallo.print;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.StringUtils;
import pl.art.tutorial.pattern.hallo.ProgramArgument;

import java.util.Map;

import static pl.art.tutorial.pattern.hallo.print.Printer.ANSI_BLUE;
import static pl.art.tutorial.pattern.hallo.print.Printer.ANSI_RED;
import static pl.art.tutorial.pattern.hallo.print.Printer.ANSI_YELLOW;

public class PrinterFactory {

    private static final Map<String, String> map = ImmutableMap.<String, String>builder()
            .put("red", ANSI_RED)
            .put("blue", ANSI_BLUE)
            .put("yellow", ANSI_YELLOW)
            .build();

    public Printer create(ProgramArgument argument){

        if(StringUtils.isNoneEmpty(argument.getColor())
                && map.keySet().contains(argument.getColor())){

            return new ColorPrintDecorator(new SystemPrinter(), map.get(argument.getColor()));
        } else {
            return new SystemPrinter();
        }
    }
}
