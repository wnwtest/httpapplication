package com.partner.customizations.lib_common.callback.loadsir;

import com.kingja.loadsir.callback.Callback;
import com.partner.customizations.lib_common.R;


public class EmptyCallback extends Callback{
    @Override
    protected int onCreateView() {
        return R.layout.loadsir_empty;
    }
}
