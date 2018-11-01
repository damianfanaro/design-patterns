package com.damianfanaro.design.patterns.creational.abstractfactory;

class Door implements Side {

    private final Room firstRoom;
    private final Room secondRoom;

    Door(Room firstRoom, Room secondRoom) {
        this.firstRoom = firstRoom;
        this.secondRoom = secondRoom;
    }

    @Override
    public void setSide(Orientation orientation, Side side) throws IllegalAccessException {
        throw new IllegalAccessException("A door cannot have an associated side!");
    }

}
