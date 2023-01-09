/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crece.mas.commons.utils;

/**
 *
 * @author Omar
 */
public class SQLSupport {
    private SQLSupport(){
        
    }
    
    public static String createStrIn(String str){
        return "('" + str.trim().replaceAll(" *, *", "','") + "')";
    }
    
    public static String createNumIn(String str){
        return "(" + str.trim().replaceAll(" *, *", ",") + ")";
    }
}
