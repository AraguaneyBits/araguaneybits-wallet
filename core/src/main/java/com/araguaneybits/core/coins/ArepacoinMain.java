package com.araguaneybits.core.coins;

import com.araguaneybits.core.coins.families.PeerFamily;

/**
 * Created by jestevez
 */
public class ArepacoinMain extends PeerFamily {
    private static ArepacoinMain instance = new ArepacoinMain();

    private ArepacoinMain() {
        this.id = "arepacoin.main";

        this.addressHeader = 23;
        this.p2shHeader = 85;
        this.acceptableAddressCodes = new int[]{this.addressHeader, this.p2shHeader};
        this.spendableCoinbaseDepth = 100;
        this.dumpedPrivateKeyHeader = 128 + addressHeader;
        this.name = "Arepacoin";
        this.symbol = "AREPA";
        this.uriScheme = "arepacoin";
        this.bip44Index = 6; // FIXME Usa el mismo que PPC, esto es incorrecto!
        this.unitExponent = 8;

        this.feeValue = value(100000);
        this.minNonDust = value(1000);
        this.softDustLimit = value(1000000);
        this.softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        this.signedMessageHeader = CoinType.toBytes("Arepacoin Signed Message:\n");
    }

    public static synchronized ArepacoinMain get() {
        ArepacoinMain arepacoinMain;
        synchronized (ArepacoinMain.class) {
            arepacoinMain = instance;
        }
        return arepacoinMain;
    }
}
