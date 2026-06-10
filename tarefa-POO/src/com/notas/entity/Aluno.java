package com.notas.entity;

public class Aluno {

    private String alunos;
    private int[] nota;
    private double media;


    public String getAlunos() {
        return alunos;
    }

    public void setAlunos(String alunos) {
        this.alunos = alunos;
    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota){
        this.nota = nota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}