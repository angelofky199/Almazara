package pojos;
// Generated 15-sep-2016 21:42:28 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Molturacion generated by hbm2java
 */
@Entity
@Table(name = "molturacion", catalog = "almazaradb"
)
public class Molturacion implements java.io.Serializable {

    public static float RENDIMIENTO_ORUJO_KG = (float) 0.3;
    public static float RENDIMIENTO_MAQUILA_KG = (float) 0.04;
    public static float RENDIMIENTO_MULTURACION_ECONOMICO = (float) 0.15; //€
    private Integer idMolturacion;
    private Cliente cliente;
    private Usuario usuario;
    private float kgOliva;
    private float litrosAceiteProd;
    private float rendimiento;
    private float kgOrujo;
    private float ingresoMolturacion;
    private Date fecha;
    private boolean pagada;
    private boolean declara;
    private float kgReflejadosDeclaracion;
    private float maquila;
    private String observaciones;

    public Molturacion() {
    }

    public Molturacion(Cliente cliente, Usuario usuario, float kgOliva, float litrosAceiteProd, float kgOrujo, float ingresoMolturacion, Date fecha, boolean pagada, boolean declara, float kgReflejadosDeclaracion, float maquila) {
        this.cliente = cliente;
        this.usuario = usuario;
        this.kgOliva = kgOliva;
        this.litrosAceiteProd = litrosAceiteProd;
        this.kgOrujo = kgOrujo;
        this.ingresoMolturacion = ingresoMolturacion;
        this.fecha = fecha;
        this.pagada = pagada;
        this.declara = declara;
        this.kgReflejadosDeclaracion = kgReflejadosDeclaracion;
        this.maquila = maquila;
    }

    public Molturacion(Cliente cliente, Usuario usuario, float kgOliva, float litrosAceiteProd,float rendimiento, float kgOrujo, float ingresoMolturacion, Date fecha, boolean pagada, boolean declara, float kgReflejadosDeclaracion, float maquila, String observaciones) {
        this.cliente = cliente;
        this.usuario = usuario;
        this.kgOliva = kgOliva;
        this.litrosAceiteProd = litrosAceiteProd;
        this.rendimiento = rendimiento;
        this.kgOrujo = kgOrujo;
        this.ingresoMolturacion = ingresoMolturacion;
        this.fecha = fecha;
        this.pagada = pagada;
        this.declara = declara;
        this.kgReflejadosDeclaracion = kgReflejadosDeclaracion;
        this.maquila = maquila;
        this.observaciones = observaciones;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idMolturacion", unique = true, nullable = false)
    public Integer getIdMolturacion() {
        return this.idMolturacion;
    }

    public void setIdMolturacion(Integer idMolturacion) {
        this.idMolturacion = idMolturacion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Cliente_idCliente", nullable = false)
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Usuario_idUsuario", nullable = false)
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Column(name = "kgOliva", nullable = false, precision = 12, scale = 0)
    public float getKgOliva() {
        return this.kgOliva;
    }

    public void setKgOliva(float kgOliva) {
        this.kgOliva = kgOliva;
    }

    @Column(name = "litrosAceiteProd", nullable = false, precision = 12, scale = 0)
    public float getLitrosAceiteProd() {
        return this.litrosAceiteProd;
    }

    public void setLitrosAceiteProd(float litrosAceiteProd) {
        this.litrosAceiteProd = litrosAceiteProd;
    }
    
    @Column(name = "rendimiento", nullable = true, precision = 12, scale = 0)
    public float getRendimiento() {
        return this.rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    @Column(name = "kgOrujo", nullable = false, precision = 12, scale = 0)
    public float getKgOrujo() {
        return this.kgOrujo;
    }

    public void setKgOrujo(float kgOrujo) {
        this.kgOrujo = kgOrujo;
    }

    @Column(name = "ingresoMolturacion", nullable = false, precision = 12, scale = 0)
    public float getIngresoMolturacion() {
        return this.ingresoMolturacion;
    }

    public void setIngresoMolturacion(float ingresoMolturacion) {
        this.ingresoMolturacion = ingresoMolturacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha", nullable = false, length = 19)
    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Column(name = "Pagada", nullable = false)
    public boolean isPagada() {
        return this.pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    @Column(name = "declara", nullable = false)
    public boolean isDeclara() {
        return this.declara;
    }

    public void setDeclara(boolean declara) {
        this.declara = declara;
    }

    @Column(name = "kgReflejadosDeclaracion", nullable = false, precision = 12, scale = 0)
    public float getKgReflejadosDeclaracion() {
        return this.kgReflejadosDeclaracion;
    }

    public void setKgReflejadosDeclaracion(float kgReflejadosDeclaracion) {
        this.kgReflejadosDeclaracion = kgReflejadosDeclaracion;
    }

    @Column(name = "maquila", nullable = false, precision = 12, scale = 0)
    public float getMaquila() {
        return this.maquila;
    }

    public void setMaquila(float maquila) {
        this.maquila = maquila;
    }

    @Column(name = "Observaciones", length = 100)
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public float CalcularIngresoObtenidoMulturacion() {
        if (pagada) {
            return CalcularPrecioMulturacion();
        } else {
            return 0;
        }
    }

    public float CalcularPrecioMulturacion() {
        float total;
        total = kgOliva * RENDIMIENTO_MULTURACION_ECONOMICO;

        return total;
    }

    public void CalcularOrujo() {
        this.kgOrujo = this.kgOliva * RENDIMIENTO_ORUJO_KG;
    }

    public void CalcularMaquila() {
        this.maquila = this.kgOliva * RENDIMIENTO_MAQUILA_KG;
    }
    
    public void CalcularRendimientoAceite() {
        if(this.kgOliva > 0)
            this.rendimiento = this.litrosAceiteProd / this.kgOliva;
    }
}
