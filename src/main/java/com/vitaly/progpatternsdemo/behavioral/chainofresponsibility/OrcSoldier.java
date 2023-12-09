package com.vitaly.progpatternsdemo.behavioral.chainofresponsibility;

/*
09-Dec-23
gh /crazym8nd
*/
public class OrcSoldier implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.COLLECT_TAX;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " handling request " + req.getRequestDescription());
    }

    @Override
    public String name() {
        return "Orc soldier";
    }
}