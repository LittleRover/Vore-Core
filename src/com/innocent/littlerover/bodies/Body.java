/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innocent.littlerover.bodies;

import com.innocent.littlerover.creatures.Creature;
import com.innocent.littlerover.genetics.Genome;
import com.innocent.littlerover.stats.BoundedBasicStat;

/**
 *
 * @author ajh17
 */
public class Body {
    /**
     * Creates a new body using the provided genome. Note that the genome is not
     * cloned before being used, so it must not be reused on other creatures
     * unless they are meant to modify together.
     * @param genome 
     */
    public Body(Genome genome) {
        this.genome = genome;
    }
    
    // Stats related to the body
    private final BoundedBasicStat.Integer
            STR = new BoundedBasicStat.Integer(0, 0, Integer.MAX_VALUE),
            END = new BoundedBasicStat.Integer(0, 0, Integer.MAX_VALUE),
            AGI = new BoundedBasicStat.Integer(0, 0, Integer.MAX_VALUE);
    
    
    // All to do with the genetics, immutable stuff.
    private final Genome genome;
    /**
     * Returns a modifiable version of this body's genome. Note that a clone
     * must be made if the body is not to be affected.
     * @return The genome
     */
    public Genome getGenome() { return genome; }
}
