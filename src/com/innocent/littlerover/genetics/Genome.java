/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innocent.littlerover.genetics;

/**
 *
 * @author ajh17
 */
public final class Genome implements Cloneable {
    public Genome(Genome g) {
        // Creates a copy
    }
    public Genome(Genome m, Genome f) {
        this(m, f, 0.5f);
    }
    public Genome(Genome m, Genome f, float m_to_f) {
        // Creates a child of the male and female using the male to female ratio.
    }
    public Genome(Genome m, Genome f, Genome s, float mf_to_s) {
        this(m, f, s, 0.5f, mf_to_s);
    }
    public Genome(Genome m, Genome f, Genome s, float m_to_f, float mf_to_s) {
        // Creates a child using the surrogate, s, as a base, and a combination
        // of the male and female using the male to female ratio, and the
        // parent to surrogate ratio.
    }
    
    @Override
    public Genome clone() { return new Genome(this); }
}
