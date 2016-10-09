package com.orcaexpress.orcatrak.entity;

@FunctionalInterface
public interface Exemptable {
    public boolean isExempt(User user);
}
