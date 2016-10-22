package com.orcaexpress.orcatrak.helper;

import com.orcaexpress.orcatrak.entity.old.User;

@FunctionalInterface
public interface Exemptable {
    public boolean isExempt(User accountHolder);
}
