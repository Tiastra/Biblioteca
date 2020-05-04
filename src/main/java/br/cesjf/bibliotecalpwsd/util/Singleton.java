/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.bibliotecalpwsd.util;

/**
 *
 * @author C.Tiago
 */
public class Singleton {
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    private static class SingletonHolder {

        private static final Singleton INSTANCE = new Singleton();
    }
}
