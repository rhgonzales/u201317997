/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dpew.u201317997.controllers;

import com.dpew.u201317997.entidades.Pagos;
import com.dpew.u201317997.persistence.JPAUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Query;


/**
 *
 * @author Trueno
 */
@ManagedBean
@ViewScoped
public class PagosBean implements Serializable {

    static final long serialVersionUID = -8780407253943723401L;
    private Pagos pago;
    private List<Pagos> pagos;

    @PostConstruct
    public void init() {
        pago = new Pagos();
    }

    public Pagos getPago() {
        return pago;
    }

    public void setPago(Pagos pago) {
        this.pago = pago;
    }

    public List<Pagos> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pagos> pagos) {
        this.pagos = pagos;
    }

    public void buscarPagos() {

        if (pago.getRuc() != null) {
            String jpql = "select p from Pagos p where p.ruc= :dato ";
            Query query = JPAUtil.getEntityManager().createQuery(jpql);
            query.setParameter("dato", pago.getRuc().toString());
            pagos = query.getResultList();
        } else {
            String jpql = "select p from Pagos p";
            Query query = JPAUtil.getEntityManager().createQuery(jpql);
            pagos = query.getResultList();
            System.out.println("ruc nulo");
        }

    }
}
