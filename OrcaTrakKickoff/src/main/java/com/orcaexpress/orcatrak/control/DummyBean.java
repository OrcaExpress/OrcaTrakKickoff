package com.orcaexpress.orcatrak.control;

import com.orcaexpress.orcatrak.boundary.DummyService;
import com.orcaexpress.orcatrak.entity.Dummy;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author OrcaExpress
 */
@Named
@RequestScoped
public class DummyBean {

    private Dummy dummy;

    @EJB
    private DummyService dummyService;

    @PostConstruct
    public void init() {
        dummy = new Dummy();
    }

    public void dummyAction() {
        dummyService.persist(dummy);
    }

    public List<String> allDummies() {
        return dummyService.getAllDummies();
    }

    // getters and setters
    public Dummy getDummy() {
        return dummy;
    }

    public void setDummy(Dummy dummy) {
        this.dummy = dummy;
    }
}
