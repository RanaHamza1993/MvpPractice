package com.example.ranahamza.mvppractice.model;

import com.example.ranahamza.mvppractice.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {
    @Override
    public String getViewData() {
        return "Hello Hamza";
    }
}
