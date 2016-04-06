/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innocent.littlerover.stats;

/**
 *
 * @author ajh17
 */
public interface Bounded<T> {
    public T getMin();
    public T getMax();
    
    public boolean getBoundsValid();
}
