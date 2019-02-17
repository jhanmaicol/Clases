package com.example.geoquiz;

class Question {

    private String nomre;
    private boolean response;

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public Question(String nomre, boolean response) {
        this.nomre = nomre;
        this.response = response;
    }





}
