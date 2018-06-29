package pl.art.tutorial.pattern.adapter;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MemoryAdapter implements TextLoader {

    private Iterator<String> words;

    MemoryAdapter(String text) {
        words = Stream.of(text.split(" \\s+"))
                .collect(Collectors.toList())
                .iterator();
    }

    @Override
    public String getNextWord() {
        return words.hasNext() ? words.next() : null;
    }
}
