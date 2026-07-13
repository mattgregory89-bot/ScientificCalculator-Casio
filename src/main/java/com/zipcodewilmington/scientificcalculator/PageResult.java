package com.zipcodewilmington.scientificcalculator;

public class PageResult {
    private int currentPage;
    private String mode;

    public PageResult(int currentPage, String mode) {
    this.currentPage = currentPage;
    this.mode = mode;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public String getMode() {
        return this.mode;
    }

}
