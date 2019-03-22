package com.michalkolos;

public class Main {

    public static void main(String[] args) {

        Dirichlet dirichlet = new Dirichlet(
                new DataParser("./src/com/michalkolos/Data_unsort_0001.csv"),
                new ConsolePrinter()
        );

        dirichlet.printMainSet();
    }
}
