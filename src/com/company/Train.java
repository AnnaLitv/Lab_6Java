package com.company;

import java.util.ArrayList;


public class Train {
    int numberTrain;
    private ArrayList<Wagon> wagons;

    public Train() {
        wagons = new ArrayList<>();
    }

    public Train(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }

    public ArrayList<Wagon> getWagons(){
        return wagons;
    }
    public int SumPeople(){
        int sum = 0;
        System.out.println(wagons);
        try {

            for (Wagon st : wagons) {
                sum += st.people;
                System.out.println(st.people);
            }
        }catch(NullPointerException e){
            System.out.println("Collection of stones is set to null!");
        }
        finally {
            return sum;
        }
    }


}

