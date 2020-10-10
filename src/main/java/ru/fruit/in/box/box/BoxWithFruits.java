package ru.fruit.in.box.box;

import ru.fruit.in.box.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits<F extends Fruit> {

    private List<F> fruits;

    public BoxWithFruits(List<F> fruits) {
        this.fruits = fruits;
    }


    public BoxWithFruits(F... fruits) {
        this.fruits = new ArrayList<F>(Arrays.asList(fruits));
    }

    public List<F> getFruits() { return fruits; }

    public void setFruits(F fruits) {
        this.fruits.add(fruits);
    }

    public void addToBox(F fruit) { fruits.add(fruit); }


    public Double getBoxWeight(){
        Double sum = 0.0;
        for (F f : fruits){
            sum += f.getWeight();
        }
        return sum;
    }
}
