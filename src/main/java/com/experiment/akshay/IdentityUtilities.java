package com.experiment.akshay;

import java.util.UUID;

public class IdentityUtilities {
	 
    /**
     * Generates a {@link UUID}
     *
     * @return a {@code String} representation of a UUID.
     */
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
