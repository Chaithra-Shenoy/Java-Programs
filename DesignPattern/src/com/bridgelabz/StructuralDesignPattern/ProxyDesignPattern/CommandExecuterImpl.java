/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.ProxyDesignPattern;

import java.io.IOException;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class CommandExecuterImpl implements CommandExecuter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bridgelabz.StructuralDesignPattern.ProxyDesignPattern.CommandExecuter#
	 * runCommand(java.lang.String)
	 */
	@Override
	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println(cmd + " command executed ");
	}

}
