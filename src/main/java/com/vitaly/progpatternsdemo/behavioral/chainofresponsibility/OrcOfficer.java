package com.vitaly.progpatternsdemo.behavioral.chainofresponsibility;

/*
09-Dec-23
gh /crazym8nd
*/
public class OrcOfficer implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.TORTURE_PRISONER;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " handling request " + req.getRequestDescription());
    }

    @Override
    public String name() {
        return "Orc officer";
    }
}