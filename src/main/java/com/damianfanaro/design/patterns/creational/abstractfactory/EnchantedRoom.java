package com.damianfanaro.design.patterns.creational.abstractfactory;

public class EnchantedRoom extends Room {

    private final Spell spell;

    EnchantedRoom(int roomNumber, Spell spell) {
        super(roomNumber);
        this.spell = spell;
    }

    @Override
    public void setSide(Orientation orientation, Side side) {
        super.setSide(orientation, side);
    }

}
