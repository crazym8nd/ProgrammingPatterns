package com.vitaly.progpatternsdemo.behavioral.memento;

/*
09-Dec-23
gh /crazym8nd
*/
public enum StarType {
        SUN("sun"),
        RED_GIANT("red giant"),
        WHITE_DWARF("white dwarf"),
        SUPERNOVA("supernova"),
        DEAD("dead star");

        private final String title;

        StarType(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
}