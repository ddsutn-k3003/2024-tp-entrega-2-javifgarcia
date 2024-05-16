package ar.edu.utn.dds.k3003.clientes;

import ar.edu.utn.dds.k3003.facades.FachadaHeladeras;
import ar.edu.utn.dds.k3003.facades.FachadaViandas;
import ar.edu.utn.dds.k3003.facades.dtos.HeladeraDTO;
import ar.edu.utn.dds.k3003.facades.dtos.RetiroDTO;
import ar.edu.utn.dds.k3003.facades.dtos.TemperaturaDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.*;

public class HeladerasProxy implements FachadaHeladeras {

    private final String endpoint;
    private final HeladerasRetrofitClient service;

    public HeladerasProxy(ObjectMapper objectMapper){
        var env = System.getenv();

        this.endpoint = env.getOrDefault("URL_HELADERAS", "http://localhost:8082/");

        var retrofit = new Retrofit.Builder().baseUrl(this.endpoint).addConverterFactory(JacksonConverterFactory.create(objectMapper)).build();

        this.service = retrofit.create(HeladerasRetrofitClient.class);
    }
    @Override
    public HeladeraDTO agregar(HeladeraDTO heladeraDTO){
        return null;
    }

    @Override
    public void  depositar(Integer valor, String cadena){
    }

    @Override
    public Integer cantidadViandas(Integer valor) throws NoSuchElementException{
        return null;
    }

    @Override
    public void retirar(RetiroDTO retiroDTO){
    }

    @Override
    public void temperatura(TemperaturaDTO temperaturaDTO){}

    @Override
    public List<TemperaturaDTO> obtenerTemperaturas(Integer valor){
        return null;
    }
    @Override
    public void setViandasProxy(FachadaViandas fachadaViandas){
    }



}
