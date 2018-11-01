package com.damianfanaro.design.patterns.creational.abstractfactory;

class MazeFactory {

    Maze makeMaze() {
        return new Maze();
    }

    Wall makeWall() {
        return new Wall();
    }

    Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    Door makeDoor(Room firstRoom, Room secondRoom) {
        return new Door(firstRoom, secondRoom);
    }

}
