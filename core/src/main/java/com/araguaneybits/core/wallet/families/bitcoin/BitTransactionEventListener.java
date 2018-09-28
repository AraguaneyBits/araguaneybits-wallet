package com.araguaneybits.core.wallet.families.bitcoin;

import com.araguaneybits.core.network.AddressStatus;
import com.araguaneybits.core.network.ServerClient.UnspentTx;
import com.araguaneybits.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
