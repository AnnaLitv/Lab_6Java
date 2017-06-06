package com.company;


public class WagonSleep extends Wagon{

    public WagonSleep(){
        super();
    }

    public WagonSleep(int numberWagon,  int comfort, int people, int luggage){
        super(numberWagon,   comfort,  people,  luggage);
    }
    public boolean isSit()
    {
        return false;
    }
}
