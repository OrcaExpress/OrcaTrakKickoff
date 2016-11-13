package com.orcaexpress.orcatrak.control;

import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@RequestScoped
public class QuoteBean {

    Logger LOGGER = LoggerFactory.getLogger(QuoteBean.class);

    private String origin;
    private String zoning;
    private Date date;
    private String access;
    private List<String> service;

    public List<String> getService() {
        return service;
    }

    public void setService(List<String> service) {
        this.service = service;
    }   

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getZoning() {
        return zoning;
    }

    public void setZoning(String zoning) {
        this.zoning = zoning;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void dummyAction() {
        LOGGER.debug("---------------------------------------------------------------");
        LOGGER.debug("Origin: " + origin);
        LOGGER.debug("Zoning: " + zoning);
        LOGGER.debug("Date: " + date);
        LOGGER.debug("Access: " + access);
        LOGGER.debug("Service: " + service);
        LOGGER.debug("---------------------------------------------------------------");
    }
}
