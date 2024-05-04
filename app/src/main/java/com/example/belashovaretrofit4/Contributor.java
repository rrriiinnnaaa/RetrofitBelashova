package com.example.belashovaretrofit4;

class Contributor {

    private String login;
    private int id;
    private int contributions;

    // И другие поля
    //String html_url;

    @Override
    public String toString() {
        return "     " + login + ";" + + id + "" + contributions;
    }
}