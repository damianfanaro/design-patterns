package com.damianfanaro.design.patterns.creational.abstractfactory;

class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(int roomNumber) {
        return new EnchantedRoom(roomNumber, new CastSpell());
    }

    @Override
    public Door makeDoor(Room firstRoom, Room secondRoom) {
        return new DoorNeedingSpell(firstRoom, secondRoom);
    }

}
