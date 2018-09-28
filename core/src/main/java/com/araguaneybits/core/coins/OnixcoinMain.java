package com.araguaneybits.core.coins;

import com.araguaneybits.core.coins.families.BitFamily;

/**
 * Created by jestevez on 21/11/17.
 */

public class OnixcoinMain extends BitFamily {
    private OnixcoinMain() {
        id = "onixcoin.main";

        addressHeader = 75;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;

        name = "Onixcoin";
        symbol = "ONX";
        uriScheme = "onixcoin";
        bip44Index = 99; // El que se debe usar es 174, ver https://github.com/satoshilabs/slips
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1);
        softDustLimit = value(1000000);
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("ONIX Signed Message:\n");
    }

    private static OnixcoinMain instance = new OnixcoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}