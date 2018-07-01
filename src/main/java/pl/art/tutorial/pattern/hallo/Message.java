package pl.art.tutorial.pattern.hallo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Message {
    private String message;
    private String color;
}
