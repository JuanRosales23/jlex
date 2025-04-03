/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lya3;

import java.io.FileReader;

/**
 *
 * @author juanm
 */
public class LyA3 {

    public static void main(String[] args) {
        FileReader mArchivo;
        Yylex mAnalizadorLexic;
        
        
       try{
        mArchivo = new FileReader( "programa.txt" );
        mAnalizadorLexic = new Yylex(mArchivo);
        mAnalizadorLexic.yylex();
       } catch (Exception ex){
           System.err.println(ex.getMessage());
       }
    }
    
}
