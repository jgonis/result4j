package com.secretlyop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ResultTest {

    @Test
    public void testIsOk() {
        Result<Integer, Exception> ok = new Result.Ok<>(1);
        Result<Integer, Exception> error = new Result.Err<>(new Exception());
        assertTrue(ok.isOk());
        assertFalse(error.isOk());
    }
}