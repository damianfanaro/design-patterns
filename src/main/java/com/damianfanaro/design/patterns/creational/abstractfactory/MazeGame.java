package com.damianfanaro.design.patterns.creational.abstractfactory;

final class MazeGame {

    private static Maze createMaze(MazeFactory mazeFactory) {

        Maze maze = mazeFactory.makeMaze();
        Room firstRoom = mazeFactory.makeRoom(1);
        Room secondRoom = mazeFactory.makeRoom(2);
        Door door = mazeFactory.makeDoor(firstRoom, secondRoom);

        maze.addRoom(firstRoom);
        maze.addRoom(secondRoom);

        firstRoom.setSide(Orientation.NORTH, mazeFactory.makeWall());
        firstRoom.setSide(Orientation.EAST, door);
        firstRoom.setSide(Orientation.SOUTH, mazeFactory.makeWall());
        firstRoom.setSide(Orientation.WEST, mazeFactory.makeWall());

        secondRoom.setSide(Orientation.NORTH, mazeFactory.makeWall());
        secondRoom.setSide(Orientation.EAST, mazeFactory.makeWall());
        secondRoom.setSide(Orientation.SOUTH, mazeFactory.makeWall());
        secondRoom.setSide(Orientation.WEST, door);

        return maze;
    }

    public static void main(String[] args) {

        final Maze bombedMaze = MazeGame.createMaze(new BombedMazeFactory());
        final Maze enchantedMaze = MazeGame.createMaze(new EnchantedMazeFactory());
        final Maze defaultMaze = MazeGame.createMaze(new MazeFactory());

    }

}
