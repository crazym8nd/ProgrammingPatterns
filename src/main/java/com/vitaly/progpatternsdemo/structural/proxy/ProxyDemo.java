package com.vitaly.progpatternsdemo.structural.proxy;

/*
09-Dec-23
gh /crazym8nd
*/
public class ProxyDemo {
    public static void main(String[] args) {

        //создаем заместитель и передаем в качестве параметра ориг обьект
        WizardTowerproxy proxyTower = new WizardTowerproxy(new IvoryTower());
        proxyTower.enter(new Wizard("Gandalf"));
        proxyTower.enter(new Wizard("Merlin"));
        proxyTower.enter(new Wizard("Anton"));
        proxyTower.enter(new Wizard("Megumin"));
        proxyTower.enter(new Wizard("Potato"));
    }
}
