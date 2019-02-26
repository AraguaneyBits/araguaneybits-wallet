package com.araguaneybits.core.coins;

import com.araguaneybits.core.coins.families.PeerFamily;

/**
 * @author jestevez
 */
public class LkrcoinMain extends PeerFamily {
    private LkrcoinMain() {
        this.id = "lkrcoin.main";

        this.addressHeader = 48;
        this.p2shHeader = 85;
        this.acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        this.spendableCoinbaseDepth = 500;
        this.dumpedPrivateKeyHeader = 128 + addressHeader;
        this.name = "Lkrcoin";
        this.symbol = "LKR";
        this.uriScheme = "lkrcoin";
        this.bip44Index = 557;  // Agregado en https://github.com/satoshilabs/slips/blob/master/slip-0044.md
        this.unitExponent = 8;
        this.feeValue = value(10000);
        this.minNonDust = value(1);
        this.softDustLimit = value(1000000);
        this.softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        this.signedMessageHeader = toBytes("LakrassCoin Signed Message:\n");
    }

    private static LkrcoinMain instance = new LkrcoinMain();
    public static synchronized LkrcoinMain get() {
        return instance;
    }
}
