package com.company;

public class WagonSit extends Wagon {

    public WagonSit(){
        super();
    }

    public WagonSit(int numberWagon,  int comfort, int people, int luggage){
        super( numberWagon,   comfort,  people,  luggage);
    }
    public boolean isSit()
    {
        return true;
    }
}
