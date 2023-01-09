/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crece.mas.commons.utils;

import java.io.File;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Omar
 */
@Slf4j
public class FileSupport {
    private FileSupport(){
        
    }
    
    /**
     * Crea un nombre unico, ademas de reemplazar los espacios en el nombre por _
     * @param file
     * @return 
     */
    public static String createUniqueFilename(MultipartFile file ){
        return createUniqueFilename(file.getOriginalFilename());
    }
    
    public static String createUniqueFilename(String filename ){
        String fileName = reemplazarEspaciosString(filename);
        fileName = String.valueOf(Math.abs(new Random().nextLong())).concat(fileName);
        return fileName;
    }
    
    public static File createTempFile(String fileName){
        String filePath = System.getProperty("java.io.tmpdir");
        filePath = filePath.concat(File.separator).concat(fileName);
        log.debug("Temp file path: " + filePath);
        File tmpFile = new File(filePath);
        return tmpFile;
    }
    
    //TODO: Este metodo existe en el proyecto Admin, habria que ubicarlo en commons posiblemente
    private static String reemplazarEspaciosString(String cadena) {
        cadena = cadena.trim();
        cadena = cadena.replace(" ", "_");
        return cadena;
    }
}
