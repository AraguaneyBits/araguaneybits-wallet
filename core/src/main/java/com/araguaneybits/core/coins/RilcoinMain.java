package com.araguaneybits.core.coins;

import com.araguaneybits.core.coins.families.BitFamily;
import com.araguaneybits.core.coins.nxt.Constants;

public class RilcoinMain extends BitFamily {
    private static RilcoinMain instance = new RilcoinMain();

    private RilcoinMain() {
        this.id = "rilcoin.main";
        this.addressHeader = 49;
        this.p2shHeader = 5;
        this.acceptableAddressCodes = new int[]{this.addressHeader, this.p2shHeader};
        this.spendableCoinbaseDepth = 100;
        this.dumpedPrivateKeyHeader = 128 + addressHeader;
        this.name = "Rilcoin";
        this.symbol = "RIL";
        this.uriScheme = "rilcoin";
        this.bip44Index = 250; // FIXME The code 250 belongs to SOOM https://github.com/satoshilabs/slips/blob/master/slip-0044.md
        this.unitExponent = 8;
        this.feeValue = value(Constants.MIN_HUB_EFFECTIVE_BALANCE);
        this.minNonDust = value(1);
        this.softDustLimit = value(1000000);
        this.softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        // FIXME https://github.com/AraguaneyBits/rilcoin/blob/088a71d5add1f8254f8e445ad564098e94ea725b/src/main.cpp#L76
        // The Signed Message is incorrect in the Core
        this.signedMessageHeader = CoinType.toBytes("Bitcoin Signed Message:\n");
    }

    public static synchronized CoinType get() {
        CoinType coinType;
        synchronized (RilcoinMain.class) {
            coinType = instance;
        }
        return coinType;
    }
}
