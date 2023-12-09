package com.vitaly.progpatternsdemo.behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
09-Dec-23
gh /crazym8nd
*/
public class OrcKing {

    private List<RequestHandler> handlers;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        handlers = Arrays.asList(new OrcCommander(), new OrcOfficer(), new OrcSoldier());
    }

    /**
     * Handle request by the chain.
     */
    public void makeRequest(Request req) {
        handlers
                .stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(handler -> handler.canHandleRequest(req))
                .findFirst()
                .ifPresent(handler -> handler.handle(req));
    }
}
