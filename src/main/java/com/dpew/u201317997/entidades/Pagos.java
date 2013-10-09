/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dpew.u201317997.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Trueno
 */
@Entity
@Table(catalog = "sunat", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagos.findAll", query = "SELECT p FROM Pagos p"),
    @NamedQuery(name = "Pagos.findByIdpagos", query = "SELECT p FROM Pagos p WHERE p.idpagos = :idpagos"),
    @NamedQuery(name = "Pagos.findByRuc", query = "SELECT p FROM Pagos p WHERE p.ruc = :ruc"),
    @NamedQuery(name = "Pagos.findByDescripcion", query = "SELECT p FROM Pagos p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Pagos.findByPeriodoTributario", query = "SELECT p FROM Pagos p WHERE p.periodoTributario = :periodoTributario"),
    @NamedQuery(name = "Pagos.findByCodigoTributario", query = "SELECT p FROM Pagos p WHERE p.codigoTributario = :codigoTributario"),
    @NamedQuery(name = "Pagos.findByResolucion", query = "SELECT p FROM Pagos p WHERE p.resolucion = :resolucion"),
    @NamedQuery(name = "Pagos.findByImporte", query = "SELECT p FROM Pagos p WHERE p.importe = :importe")})
public class Pagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idpagos;
    @Size(max = 20)
    @Column(length = 20)
    private String ruc;
    @Size(max = 45)
    @Column(length = 45)
    private String descripcion;
    @Size(max = 10)
    @Column(length = 10)
    private String periodoTributario;
    private Integer codigoTributario;
    @Size(max = 15)
    @Column(length = 15)
    private String resolucion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double importe;

    public Pagos() {
    }

    public Pagos(Integer idpagos) {
        this.idpagos = idpagos;
    }

    public Integer getIdpagos() {
        return idpagos;
    }

    public void setIdpagos(Integer idpagos) {
        this.idpagos = idpagos;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPeriodoTributario() {
        return periodoTributario;
    }

    public void setPeriodoTributario(String periodoTributario) {
        this.periodoTributario = periodoTributario;
    }

    public Integer getCodigoTributario() {
        return codigoTributario;
    }

    public void setCodigoTributario(Integer codigoTributario) {
        this.codigoTributario = codigoTributario;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpagos != null ? idpagos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagos)) {
            return false;
        }
        Pagos other = (Pagos) object;
        if ((this.idpagos == null && other.idpagos != null) || (this.idpagos != null && !this.idpagos.equals(other.idpagos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dpew.u201317997.entidades.Pagos[ idpagos=" + idpagos + " ]";
    }
    
}
