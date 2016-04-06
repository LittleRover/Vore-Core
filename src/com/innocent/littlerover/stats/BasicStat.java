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
public class BasicStat<T> extends Stat<T> {
    public static final BiFunction DIRECT_COPY = (old_val, new_val) -> new_val;
    
    public BasicStat(T value, BiFunction<T, T, java.lang.Integer> compare) {
        this(value, DIRECT_COPY, compare);
    } 
    public BasicStat(T value, BiFunction<T, T, T> copy, BiFunction<T, T, java.lang.Integer> compare) {
        super(compare);
        this.copy = copy;
        this.val = copy.apply(null, value);
    }
    protected final BiFunction<T, T, T> copy;
    private T val;
    
    public void setValue(T val) {
        this.val = copy.apply(this.val, val);
    }
    
    @Override
    public T getValue() {
        return copy.apply(null, val);
    }
    
    public static class Integer extends BasicStat<java.lang.Integer> {
        public static final BiFunction<java.lang.Integer, java.lang.Integer, java.lang.Integer> COMPARE
                = (a, b) -> java.lang.Integer.signum(b - a);
        public Integer(java.lang.Integer value) {
            super(value, DIRECT_COPY, COMPARE);
        }
    }
    public static class Long extends BasicStat<java.lang.Long> {
        public static final BiFunction<java.lang.Long, java.lang.Long, java.lang.Integer> COMPARE
                = (a, b) -> java.lang.Long.signum(b - a);
        public Long(java.lang.Long value) {
            super(value, DIRECT_COPY, COMPARE);
        }
    }
    public static class Float extends BasicStat<java.lang.Float> {
        public static final BiFunction<java.lang.Float, java.lang.Float, java.lang.Integer> COMPARE
                = (a, b) -> (int) Math.signum(b - a);
        public Float(java.lang.Float value) {
            super(value, DIRECT_COPY, COMPARE);
        }
    }
    public static class Double extends BasicStat<java.lang.Double> {
        public static final BiFunction<java.lang.Double, java.lang.Double, java.lang.Integer> COMPARE
                = (a, b) -> (int) Math.signum(b - a);
        public Double(java.lang.Double value) {
            super(value, DIRECT_COPY, COMPARE);
        }
    }
}