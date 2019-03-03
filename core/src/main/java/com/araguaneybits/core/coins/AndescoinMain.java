package com.araguaneybits.core.coins;

import com.araguaneybits.core.coins.families.PeerFamily;

/**
 * Created by jestevez
 */
public class AndescoinMain extends PeerFamily {
    private static AndescoinMain instance = new AndescoinMain();

    private AndescoinMain() {
        this.id = "andescoin.main";

        this.addressHeader = 23;
        this.p2shHeader = 5;
        this.acceptableAddressCodes = new int[]{this.addressHeader, this.p2shHeader};
        this.spendableCoinbaseDepth = 100;
        this.dumpedPrivateKeyHeader = 128 + addressHeader;
        this.name = "Andescoin";
        this.symbol = "ANDES";
        this.uriScheme = "andescoin";
        this.bip44Index = 276;
        this.unitExponent = 8;

        this.feeValue = value(100000);
        this.minNonDust = value(1000);
        this.softDustLimit = value(1000000);
        this.softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        this.signedMessageHeader = CoinType.toBytes("Andescoin Signed Message:\n");
    }

    public static synchronized AndescoinMain get() {
        AndescoinMain andescoinMain;
        synchronized (AndescoinMain.class) {
            andescoinMain = instance;
        }
        return andescoinMain;
    }
}
