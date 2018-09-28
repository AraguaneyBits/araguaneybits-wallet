package com.araguaneybits.core.network.interfaces;

import com.araguaneybits.core.network.AddressStatus;
import com.araguaneybits.core.network.BlockHeader;
import com.araguaneybits.core.network.ServerClient.HistoryTx;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface TransactionEventListener<T> {
    void onNewBlock(BlockHeader header);

    void onBlockUpdate(BlockHeader header);

    void onAddressStatusUpdate(AddressStatus status);

    void onTransactionHistory(AddressStatus status, List<HistoryTx> historyTxes);

    void onTransactionUpdate(T transaction);

    void onTransactionBroadcast(T transaction);

    void onTransactionBroadcastError(T transaction);
}
