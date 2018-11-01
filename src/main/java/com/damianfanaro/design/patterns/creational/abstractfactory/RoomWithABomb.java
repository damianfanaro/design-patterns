package com.damianfanaro.design.patterns.creational.abstractfactory;

class RoomWithABomb extends Room {

    RoomWithABomb(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public void setSide(Orientation orientation, Side side) {
        super.setSide(orientation, side);
    }

}
