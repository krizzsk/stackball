package com.yandex.metrica;

public class ValidationException extends IllegalArgumentException {
    public ValidationException(String str) {
        super(str);
    }
}
