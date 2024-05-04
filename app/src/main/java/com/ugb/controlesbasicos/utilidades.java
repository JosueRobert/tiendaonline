package com.ugb.controlesbasicos;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Base64;

public class utilidades {
    static String urlConsulta = "http://192.168.0.6:5984/productos/_design/productos/_view/productos";
    static String urlMto = "http://192.168.0.6:5984/productos";
    static String user = "12345";
    static String passwd = "12345";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}
