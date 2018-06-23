/**
 * 
 */
package com.bridgelabz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class TestReflection {
	private static Field[] privateIntId;

	public static void main(String[] args) {
		Class reflectClass = ReflectionImpl.class;
		// to print Fully Qualified Class Name
		System.out.println("Fully Qualified Class Name ->" + reflectClass);
		System.out.println();
		// to print class name
		String className = reflectClass.getSimpleName();
		System.out.println("class name ->" + className);
		System.out.println();
		// to find modifiers
		int classModifier = reflectClass.getModifiers();
		System.out.println("public modifier ?" + Modifier.isPublic(classModifier));
		System.out.println("private modifier ?" + Modifier.isPrivate(classModifier));
		System.out.println("protected modifier ?" + Modifier.isProtected(classModifier));
		System.out.println("Interface ?" + Modifier.isInterface(classModifier));
		System.out.println("Abstract ?" + Modifier.isAbstract(classModifier));
		System.out.println("Final ?" + Modifier.isFinal(classModifier));
		System.out.println();
		// to get interface name
		Class[] interfaces = reflectClass.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println("interface -> " + interfaces[i].getSimpleName());
		}
		System.out.println();
		// to get super class
		Class classSuper = reflectClass.getSuperclass();
		System.out.println("super class ->" + classSuper.getSimpleName());
		System.out.println();
		// to get methods
		Method[] methods = reflectClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println("methods -> " + methods[i].getName());
			if (methods[i].getName().startsWith("set"))
				System.out.println("setter methods" + methods[i].getName());
			if (methods[i].getName().startsWith("get"))
				System.out.println("getter methods " + methods[i].getName());
			System.out.println("return type " + methods[i].getGenericReturnType());

			Class[] parameterTypes = methods[i].getParameterTypes();
			for (Class parameter : parameterTypes) {
				System.out.println("parameter types " + parameter.getName());

			}
			System.out.println();
		}
		// to get constructors and parameter count
		Constructor[] constructor = null;
		Object construct = null;
		constructor = reflectClass.getConstructors();
		for (Constructor constructor2 : constructor) {
			System.out.println(constructor2.getName());
			System.out.println(constructor2.getParameterCount());
		}
		try {
			construct = reflectClass.getConstructor(int.class, String.class).newInstance(10, "Hello");
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		System.out.println();
		// to set value of private variable
		ReflectionImpl ref = new ReflectionImpl("GOOD EVENING");
		try {
			Field privateStringField = ReflectionImpl.class.getDeclaredField("id");
			privateStringField.setAccessible(true);
			String fieldValue = (String) privateStringField.get(ref);
			System.out.println("fieldValue = " + fieldValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
