package com.michalkolos;

import java.util.ArrayList;

public class ConsolePrinter implements IDataPrinter {

    @Override
    public void printSet(ArrayList<Integer> set) {

        System.out.println(set.toString());
    }
}
