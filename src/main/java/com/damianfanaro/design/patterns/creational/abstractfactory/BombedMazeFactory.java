package com.damianfanaro.design.patterns.creational.abstractfactory;

class BombedMazeFactory extends MazeFactory {

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }

}
