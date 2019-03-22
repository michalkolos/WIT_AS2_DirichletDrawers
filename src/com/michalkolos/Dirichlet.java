package com.michalkolos;

import java.util.ArrayList;

public class Dirichlet {
    private ArrayList<Integer> mainSet;
    private IDataParser dataSource;
    private IDataPrinter dataPrinter;


    public Dirichlet(IDataParser dataSource, IDataPrinter dataPrinter) {
        this.dataSource = dataSource;
        this.mainSet = dataSource.serveData();
        this.dataPrinter = dataPrinter;
    }

    public void printMainSet(){
        dataPrinter.printSet(mainSet);
    }

    public boolean isSubsetDivisible(){
        int mainSetCount = mainSet.size();

        return true;
    }
}
