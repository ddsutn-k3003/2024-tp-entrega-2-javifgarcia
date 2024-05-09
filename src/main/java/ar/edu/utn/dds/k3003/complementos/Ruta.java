package ar.edu.utn.dds.k3003.complementos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor

public class Ruta {

    private Long id;
    private Long colaboradorId;
    private Integer heladeraIdOrigen;
    private Integer heladeraIdDestino;

    private LocalDateTime fechaCreacion;
    private Boolean activo;

    public Ruta(Long colaboradorId, Integer heladeraIdOrigen, Integer heladeraIdDestino){
        this.colaboradorId = colaboradorId;
        this.heladeraIdOrigen = heladeraIdOrigen;
        this.heladeraIdDestino = heladeraIdDestino;
        this.fechaCreacion = LocalDateTime.now();
        this.activo = true;

    }

}
