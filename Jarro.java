/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author levi
 */
public class Jarro {
    //atributos:
    private int tamanho;
    private int volume_agua;
    private int indice;
    
    //Métodos:
    //get's
    public int get_tamanho(){
        return this.tamanho;
    }
    public int get_volume_agua(){
        return this.volume_agua;
    }
    public int get_indice(){
        return this.indice;
    }
    //set's:
    public void set_tamanho(int tamanho_jarro){
        this.tamanho=tamanho_jarro;
    }
    public void set_volume_agua(int volume_agua_jarro){
        this.volume_agua=volume_agua_jarro;
    }
    public void set_indice(int indice_jarro){
        this.indice=indice_jarro;
    }
    //construtor:
    public Jarro(int tamanho, int volume, int indice){
        this.tamanho=tamanho;
        this.volume_agua=volume;
        this.indice=indice;
        System.out.println("Jarro "+this.indice+"construido!");
    }
    @Override
    protected void finalize(){
        System.out.println("Jarro destruido!");
    }
}
