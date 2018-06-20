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
public class CommandProxy implements CommandExecuter {
	private boolean isAdmin;
	private CommandExecuter executer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bridgelabz.StructuralDesignPattern.ProxyDesignPattern.CommandExecuter#
	 * runCommand(java.lang.String)
	 */
	@Override

	public void runCommand(String cmd) throws Exception {
		if (isAdmin)
			executer.runCommand(cmd);
		else if (cmd.trim().startsWith("rm"))
			throw new Exception("command cannot be modified");
		else
			executer.runCommand(cmd);
			
	}

	public CommandProxy(String user, String pwd) throws Exception {
		if ("chaithra".equalsIgnoreCase(user) && "Chai@123".equalsIgnoreCase(pwd)) 
			isAdmin = true;
		
			executer = new CommandExecuterImpl();
			
			
	}
}
