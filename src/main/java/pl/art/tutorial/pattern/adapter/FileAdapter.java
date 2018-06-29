package pl.art.tutorial.pattern.adapter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

@Slf4j
public class FileAdapter implements TextLoader {

    private Iterator<String> words;

    FileAdapter() {
        try {
            String text = IOUtils.resourceToString("/FileAdapter.txt", UTF_8);
            words = Stream.of(text.split(" \\s+"))
                    .collect(Collectors.toList())
                    .iterator();
        } catch (IOException e) {
            throw new IllegalStateException("can not locate FileAdapter.txt", e);
        }
    }

    @Override
    public String getNextWord() {
        return words.hasNext() ? words.next() : null;
    }
}
