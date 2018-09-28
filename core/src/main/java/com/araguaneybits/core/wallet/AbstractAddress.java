package com.araguaneybits.core.wallet;

import com.araguaneybits.core.coins.CoinType;

import java.io.Serializable;

/**
 * @author John L. Jegutanis
 */
public interface AbstractAddress extends Serializable {
    CoinType getType();
    String toString();
    long getId();
}
