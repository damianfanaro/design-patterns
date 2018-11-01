package com.damianfanaro.design.patterns.creational.abstractfactory;

class Wall implements Side {

    @Override
    public void setSide(Orientation orientation, Side side) throws IllegalAccessException {
        throw new IllegalAccessException("A wall cannot have an associated side!");
    }

}
