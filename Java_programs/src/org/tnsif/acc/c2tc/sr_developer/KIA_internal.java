package org.tnsif.acc.c2tc.sr_developer;

import org.tnsif.acc.c2tc.jr_developer.*;

public class KIA_internal {

    public static void main(String[] args) {

        KIA_AirBags ob = new KIA_AirBags();
        ob.display_Air();

        KIA_SpeedLimit ob1 = new KIA_SpeedLimit();
        ob1.display_speed();
    }
}