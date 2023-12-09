package com.vitaly.progpatternsdemo.behavioral.chainofresponsibility;

/*
09-Dec-23
gh /crazym8nd
*/
public interface RequestHandler {

    boolean canHandleRequest(Request req);

    int getPriority();

    void handle(Request req);

    String name();
}