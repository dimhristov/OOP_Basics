package com.company.p5_RandomArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    private Random rnd;

    public Object getRandomElement() {
        int index = this.rnd.nextInt(super.size());
        Object element = super.get(index);
        super.set(index, super.get(super.size() - 1));
        super.remove(super.size()-1);

        return element;
    }
}
