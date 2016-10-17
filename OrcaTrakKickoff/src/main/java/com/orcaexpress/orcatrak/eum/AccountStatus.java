package com.orcaexpress.orcatrak.eum;

/**
 * All accounts will be NET0 meaning invoices are due to be paid immediately,
 * later when the company has enough capital accounts will be switched between
 * NET15 OR NET30 depending of account's credit rating or payment history
 */
public enum AccountStatus {
    NET0,
    NET15,
    NET30,
    LOCKED
}
