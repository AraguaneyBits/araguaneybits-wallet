package com.araguaneybits.core.coins;

import com.araguaneybits.core.coins.families.BitFamily;

/**
 * Created by jestevez on 21/11/17.
 */

public class OnixcoinMain extends BitFamily {
    private OnixcoinMain() {
        this.id = "onixcoin.main";

        this.addressHeader = 75;
        this.p2shHeader = 5;
        this.acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        this.spendableCoinbaseDepth = 100;
        this.dumpedPrivateKeyHeader = 128 + addressHeader;
        this.name = "Onixcoin";
        this.symbol = "ONX";
        this.uriScheme = "onixcoin";
        this.bip44Index = 174;
        this.unitExponent = 8;
        this.feeValue = value(100000);
        this.minNonDust = value(1);
        this.softDustLimit = value(1000000);
        this.softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        this.signedMessageHeader = toBytes("ONIX Signed Message:\n");
    }

    private static OnixcoinMain instance = new OnixcoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}