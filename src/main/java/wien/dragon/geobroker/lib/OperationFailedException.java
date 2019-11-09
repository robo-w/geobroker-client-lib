/*
 * Licensed under MIT license. See LICENSE for details.
 *
 * Copyright (c) 2019 Robert Wittek, https://github.com/robo-w
 */

package wien.dragon.geobroker.lib;

public class OperationFailedException extends Exception {
    private static final long serialVersionUID = 1L;

    public OperationFailedException(final String message) {
        super(message);
    }
}
