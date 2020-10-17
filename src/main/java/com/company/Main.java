package com.company;

import com.company.model.Store;

public class Main {

    public static void main(String[] args) {
        Store store = Store.deserialize();
        if (store == null) store = new Store();



        store.serialize();
    }
}
