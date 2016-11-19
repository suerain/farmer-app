package edu.mum.farmer.app.domain;

public enum Category {

	VEGITABLE("Vegitable"),
    FRUIT("Fruit");
    private final String selectedValue;


    private Category(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    public String getSelectedValue() {
        return selectedValue;
    }



}	
