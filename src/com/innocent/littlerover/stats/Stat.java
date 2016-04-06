/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innocent.littlerover.stats;

import java.util.function.BiFunction;

/**
 * 
 * @author ajh17
 */
public abstract class Stat<T> {
    public Stat(BiFunction<T, T, Integer> compare) {
        this.compare = compare;
    }
    protected final BiFunction<T, T, Integer> compare;
    
    public abstract T getValue();
    
    //<editor-fold defaultstate="collapsed" desc="Comparators">
    public boolean isLessThanOrEqualTo(Stat<T> stat) {
        return isLessThanOrEqualTo(stat.getValue());
    }
    public boolean isLessThan(Stat<T> stat) {
        return isLessThan(stat.getValue());
    }
    public boolean isGreaterThanOrEqualTo(Stat<T> stat) {
        return isGreaterThanOrEqualTo(stat.getValue());
    }
    public boolean isGreaterThan(Stat<T> stat) {
        return isGreaterThan(stat.getValue());
    }
    public boolean isEqualTo(Stat<T> stat) {
        return isEqualTo(stat.getValue());
    }
    public boolean isNotEqualTo(Stat<T> stat) {
        return isNotEqualTo(stat.getValue());
    }
    
    public boolean isLessThanOrEqualTo(T t) {
        return compare.apply(getValue(), t) <= 0;
    }
    public boolean isLessThan(T t) {
        return compare.apply(getValue(), t) < 0;
    }
    public boolean isGreaterThanOrEqualTo(T t) {
        return compare.apply(getValue(), t) >= 0;
    }
    public boolean isGreaterThan(T t) {
        return compare.apply(getValue(), t) > 0;
    }
    public boolean isEqualTo(T t) {
        return compare.apply(getValue(), t) == 0;
    }
    public boolean isNotEqualTo(T t) {
        return compare.apply(getValue(), t) != 0;
    }
    //</editor-fold>
}