/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.FramePrincipal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Expresion {
    
    FramePrincipal framePrincipal;
    
    public Expresion(FramePrincipal framePrincipal){
     this.framePrincipal = framePrincipal;
    }
    String cadena = framePrincipal.getExpresion();
    // La cadena a analizar
 
// Obtenemos un Pattern con la expresión regular, y de él
// un Matcher, para extraer los trozos de interés.
Pattern patron = Pattern.compile("(\\d+)\\+(\\d+)=(\\d+)");
Matcher matcher = patron.matcher(cadena);
// Hace que Matcher busque los trozos.
matcher.find();
// Va devolviendo los trozos. El primer paréntesis es el 1,
// el segundo el 2 y el tercero el 3
System.out.println(matcher.group(1));
System.out.println(matcher.group(2));
System.out.println(matcher.group(3));
System.out.println(matcher.groupCount());
// La salida de este programa es

}
