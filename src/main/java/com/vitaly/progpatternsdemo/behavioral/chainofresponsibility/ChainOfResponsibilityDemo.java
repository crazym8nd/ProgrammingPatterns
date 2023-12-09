package com.vitaly.progpatternsdemo.behavioral.chainofresponsibility;

/*
09-Dec-23
gh /crazym8nd
*/
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {

        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}