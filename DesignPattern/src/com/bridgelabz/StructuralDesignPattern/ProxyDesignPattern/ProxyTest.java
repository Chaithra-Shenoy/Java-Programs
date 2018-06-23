/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.ProxyDesignPattern;

/**
 * purpose
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class ProxyTest {
public static void main(String[] args){
	CommandExecuter run;
	try {
		run = new CommandProxy("Chaithrhha", "Chai@123");
		run.runCommand("ls");
		run.runCommand("rm abc.pdf");
	} catch (Exception e1) {
		e1.getMessage();
	}
}


}
