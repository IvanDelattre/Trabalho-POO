package com.carlosribeiro.exception;

public class NaoCancelavelException extends Exception {
    public NaoCancelavelException(String message) {
        super(message);
    }
}
