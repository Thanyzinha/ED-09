/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;
import java.util.Random;
/**
 *
 * @author Nathany
 */
public class Lista {
    Bloco  primeiro , último ;
    int  tamanho ;
    void addInicio(Object elemento) {
        Bloco nova = new Bloco(primeiro, elemento);
        this.primeiro = nova;
        if (this.tamanho == 0) {
            último = primeiro;
        }
        this.tamanho++;
    }
    void addFinal(Object elemento) {
        if (this.tamanho == 0) {
            addInicio(elemento);
        } else {
            Bloco nova = new Bloco(elemento);
            this.último.setProximo(nova);
            this.último = nova;
            this.tamanho++;
        }
    }
    boolean posicaoOcupada(int pos) {  
        if ((pos >= 0) && (pos < this.tamanho)) {
            return true;
        } else {
            return false;
        }
    }
    Bloco pegarBloco(int pos) { 
        if (!this.posicaoOcupada(pos)) { 
            throw new IllegalArgumentException("Essa posicao nao existe!");
        } else { 
            Bloco atual = this.primeiro;
            for (int i = 0; i < pos; i++) { 
                atual = atual.getProximo();
            }
            return (atual);
        }
    }
    void addMeio(int pos, Object elemento) {
        if (pos == 0) {
            this.addInicio(elemento);
        } else {
            if (pos == this.tamanho) {
                this.addFinal(elemento);
            } else {
                Bloco anterior = this.pegarBloco(pos - 1);
                Bloco nova = new Bloco(anterior.getProximo(), elemento);
                anterior.setProximo(nova);
                this.tamanho++;
            }
        }
    }

    Object pega(int pos) { 
        return (this.pegarBloco(pos).getElemento());
    }
    void removerInicio() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Essa posição não existe!");
        } else {
            this.primeiro = this.primeiro.getProximo();
           
            if (this.tamanho == 0) {
                this.último = null;
            }
        }
    }
    void remover(int pos) {

        if (posicaoOcupada(pos)) {
            if (pos == 0) {
                removerInicio();
            }
            if ((pos > 0) && (pos < this.tamanho)) {

                if (pos == tamanho - 1) {
                    Bloco anterior = this.pegarBloco(pos - 1);
                    último = anterior;
                }else {
                    Bloco proximo = this.pegarBloco(pos + 1);
                    Bloco anterior = this.pegarBloco(pos - 1);
                    anterior.setProximo(proximo);
                }
            }
            this.tamanho--;

        } else {
            throw new IllegalArgumentException("Nao eh possivel remover, pois a posicao nao existe!");
        }
    }
    Boolean contem(Object elemento) {
        Bloco atual = this.primeiro;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) { 
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }
    int tamanho() {
        return this.tamanho;
    }
    Random random = new Random(); 
    int sorteado = 0;
    int x = 20;
    void sortear() {
        for (int i = 0; i <= 19; i++) {
            System.out.println(" \nrodada " + (i + 1) + "\n");
            if(x == 0){
                sorteado = 0;
            }else {
                sorteado = random.nextInt(x);
            }
            this.remover(sorteado);
            x--;
            for (int j = 0; j < x; j++) {
                Pessoas atual = (Pessoas) pega(j);
                System.out.println("O nome da pessoa eh:" + atual.nome);
                System.out.println("O seu telefone eh: " + atual.telefone);
                System.out.println("O seu endereco eh: " + atual.endereco);
                System.out.println("O seu CPF eh: " + atual.cpf + "\n");
            }
        }
    }
}
   

