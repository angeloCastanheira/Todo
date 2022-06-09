package todo;

import java.io.Serializable;
import java.util.Date;

public class Todo implements Serializable {

    private String notas;
    private Boolean estado;
    private Date timestamp;

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getNotas() {
        return notas;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "notas='" + notas + '\'' +
                ", estado=" + estado +
                ", timestamp=" + timestamp +
                '}';
    }
}
