package org.gunnm.java.effective;

import java.util.ArrayList;
import java.util.List;


enum CheeseType{
    GOAT,
    COW,
    SHEEP
}

public enum CheeseEnum {
    COMTE(CheeseType.COW),
    CABECOU(CheeseType.SHEEP);

    private CheeseType type;

    CheeseEnum(CheeseType t){
        this.type = t;
    }

    public boolean isSheep(){
        return this.type == CheeseType.SHEEP;
    }


    public boolean isCow(){
        return this.type == CheeseType.COW;
    }

    public boolean isGoat(){
        return this.type == CheeseType.GOAT;
    }
}
