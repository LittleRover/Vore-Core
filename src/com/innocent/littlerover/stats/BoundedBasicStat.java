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
public class BoundedBasicStat<T> extends BasicStat<T> implements Bounded<T> {
    public BoundedBasicStat(T min, T value, T max,
            BiFunction<T, T, java.lang.Integer> compare) {
        this(min, value, max, BasicStat.DIRECT_COPY, compare);
    }
    
    public BoundedBasicStat(T min, T value, T max,
            BiFunction<T, T, T> copy, BiFunction<T, T, java.lang.Integer> compare) {
        super(value, copy, compare);
        setMin(min);
        setMax(max);
    }
    private T min, max;
    
    public final void setMin(T t) {
        this.min = copy.apply(null, min);
    }
    public final void setMax(T t) {
        this.max = copy.apply(null, max);
    }
    
    @Override
    public final T getMin() {
        return copy.apply(null, min);
    }
    @Override
    public final T getMax() {
        return copy.apply(null, max);
    }

    @Override
    public final boolean getBoundsValid() {
        return this.isGreaterThanOrEqualTo(min) && this.isLessThanOrEqualTo(max);
    }
    
    public static class Integer extends BoundedBasicStat<java.lang.Integer> {
        public Integer(java.lang.Integer min, java.lang.Integer value, java.lang.Integer max) {
            super(min, value, max, BasicStat.DIRECT_COPY, BasicStat.Integer.COMPARE);
        }
    }
    public static class Long extends BoundedBasicStat<java.lang.Long> {
        public Long(java.lang.Long min, java.lang.Long value, java.lang.Long max) {
            super(min, value, max, BasicStat.DIRECT_COPY, BasicStat.Long.COMPARE);
        }
    }
    public static class Float extends BoundedBasicStat<java.lang.Float> {
        public Float(java.lang.Float min, java.lang.Float value, java.lang.Float max) {
            super(min, value, max, BasicStat.DIRECT_COPY, BasicStat.Float.COMPARE);
        }
    }
    public static class Double extends BoundedBasicStat<java.lang.Double> {
        public Double(java.lang.Double min, java.lang.Double value, java.lang.Double max) {
            super(min, value, max, BasicStat.DIRECT_COPY, BasicStat.Double.COMPARE);
        }
    }
}