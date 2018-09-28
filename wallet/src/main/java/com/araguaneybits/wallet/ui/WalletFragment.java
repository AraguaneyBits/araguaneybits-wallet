package com.araguaneybits.wallet.ui;

import android.support.v4.app.Fragment;

import com.araguaneybits.core.wallet.WalletAccount;

/**
 * @author John L. Jegutanis
 */
public abstract class WalletFragment extends Fragment implements ViewUpdateble {
    abstract public WalletAccount getAccount();
}
