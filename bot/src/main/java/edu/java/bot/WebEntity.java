package edu.java.bot;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WebEntity {
    GITHUB("github.com"),
    STACK_OVERFLOW("stackoverflow.com");
    private final String domainName;
}
