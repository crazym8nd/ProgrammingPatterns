package com.vitaly.progpatternsdemo.behavioral.chainofresponsibility;

/*
09-Dec-23
gh /crazym8nd
*/
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        //запросы по сути отправляются королю,а уже он передает дальше по цепочке
        //у каждого вида орка прописан ТИП запроса,который он может выполнить
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
