package com.apple.excep;

/**
 * @Author Double_apple
 * @Date 2022/1/20 16:15
 * @Version 1.0
 */
public class NotEnoughException extends RuntimeException {


    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
