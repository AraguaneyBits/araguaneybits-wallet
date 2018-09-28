package com.araguaneybits.core.wallet.families.bitcoin;

import com.araguaneybits.core.network.AddressStatus;
import com.araguaneybits.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
