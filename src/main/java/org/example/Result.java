package org.example;

public sealed interface Result<T> {
    record Err<T>(T errorValue) implements Result<T>{}
    record Ok<T>(T successValue) implements Result<T>{}
    default boolean isOk() {
        return switch(this) {
            case Err ignoredError -> false;
            case Ok ignoredResult -> true;
        };
    }
}
