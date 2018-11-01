package com.damianfanaro.design.patterns.creational.abstractfactory;

class Room implements Side {

    private final int roomNumber;
    private Side[] side;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        side = new Side[Orientation.values().length];
    }

    @Override
    public void setSide(Orientation orientation, Side side) {
        this.side[orientation.ordinal()] = side;
    }

}
