package com.vitaly.progpatternsdemo.behavioral.chainofresponsibility;

/*
09-Dec-23
gh /crazym8nd
*/
public class OrcCommander implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.DEFEND_CASTLE;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " handling request " + req.getRequestDescription());
    }

    @Override
    public String name() {
        return "Orc commander";
    }
}