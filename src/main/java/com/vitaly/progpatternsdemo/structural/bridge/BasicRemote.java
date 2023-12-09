package com.vitaly.progpatternsdemo.structural.bridge;

/*
09-Dec-23
gh /crazym8nd
*/
public class BasicRemote implements Remote {
        protected Device device;

        public BasicRemote(Device device) {
            this.device = device;
        }

        @Override
        public void volumeDown() {
            System.out.println("Remote: volume down");
            device.setVolume(device.getVolume() - 10);
        }

        @Override
        public void volumeUp() {
            System.out.println("Remote: volume up");
            device.setVolume(device.getVolume() + 10);
        }
    }