package no.nordicsemi.android.dfu;

import androidx.annotation.IntDef;

@IntDef(value = {
            DfuServiceInitiator.SCOPE_SYSTEM_COMPONENTS,
            DfuServiceInitiator.SCOPE_APPLICATION
        },
        flag = true)
public @interface DfuScope {}
