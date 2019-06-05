package com.example.pap_desta_vai;

public class Prato {

    String prato_id;
    String prato_nome;
    String prato_dis;

    public Prato() {

    }

    public Prato(String prato_id, String prato_nome, String prato_dis) {
        this.prato_id = prato_id;
        this.prato_nome = prato_nome;
        this.prato_dis = prato_dis;
    }

    public String getPrato_id() {
        return prato_id;
    }

    public String getPrato_nome() {
        return prato_nome;
    }

    public String getPrato_dis() {
        return prato_dis;
    }
}
