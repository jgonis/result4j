package org.example;

public sealed interface Result<T, E> {
    record Err<E, T>(E errorValue) implements Result<T, E>{}
    record Ok<T, E>(T successValue) implements Result<T, E>{}
    default boolean isOk() {
        return switch(this) {
            case Err ignoredError -> false;
            case Ok ignoredResult -> true;
        };
    }
}
