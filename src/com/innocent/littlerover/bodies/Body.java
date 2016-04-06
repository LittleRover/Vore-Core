/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innocent.littlerover.bodies;

import com.innocent.littlerover.genetics.Genome;

/**
 *
 * @author ajh17
 */
public class Body {
    public Body(Genome genome) {
        this.genome = genome;
    }
    
    private final Genome genome;
    public Genome getGenome() { return genome; }
}
