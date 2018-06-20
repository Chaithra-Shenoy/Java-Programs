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
public interface CommandExecuter {
	/**
	 * @param cmd
	 * @throws IOException
	 * @throws Exception 
	 */
	public void runCommand(String cmd) throws IOException, Exception;
}
