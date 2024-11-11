package com.flower.flowerсontinue.diagramUser;

public class Sender implements User {
    @Override
    public void update(String status) {
        System.out.println("Sender received update: " + status);
    }
}
