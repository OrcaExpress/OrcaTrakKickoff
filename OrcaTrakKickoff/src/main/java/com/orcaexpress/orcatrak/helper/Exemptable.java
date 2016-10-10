package com.orcaexpress.orcatrak.helper;

import com.orcaexpress.orcatrak.entity.User;

@FunctionalInterface
public interface Exemptable {
    public boolean isExempt(User user);
}
