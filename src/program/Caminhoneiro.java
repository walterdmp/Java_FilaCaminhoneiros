
package program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Caminhoneiro {
    
    private String nome;
    private String placa;
    private LocalDateTime horarioChegada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(LocalDateTime horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = horarioChegada.format(formatter);
        return "Caminhoneiro: " 
                + "Nome: " 
                + nome 
                + ", Placa: " 
                + placa 
                + ", Horario de Chegada: " 
                + dataFormatada 
                + '.';
    }
    
    
}
