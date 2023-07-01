package com.tictactoe.code;

class CellAlreadyMarkedException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CellAlreadyMarkedException(String message) {
        super(message);
    }
}