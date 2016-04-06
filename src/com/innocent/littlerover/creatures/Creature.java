/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innocent.littlerover.creatures;

import com.innocent.littlerover.bodies.Body;
import com.innocent.littlerover.minds.Mind;
import com.innocent.littlerover.souls.Soul;

/**
 *
 * @author ajh17
 */
public class Creature {
    
    private Mind mind;
    public Mind getMind() { return mind; }
    
    private Soul soul;
    public Soul getSoul() { return soul; }
    
    private Body body;
    public Body getBody() { return body; }
}
