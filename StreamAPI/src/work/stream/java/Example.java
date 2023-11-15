package work.stream.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {

	public static void main(String[] args) throws 
	NoSuchMethodException, SecurityException, 
	InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, 
	FileNotFoundException, IOException, ClassNotFoundException,CloneNotSupportedException {
		// TODO Auto-generated method stub
		//new Samosa();
		/*
		 * Samosa samosa = Samosa.getSamosa(); System.out.println(samosa.hashCode());
		 * Samosa samosa2 = Samosa.getSamosa(); System.out.println(samosa2.hashCode());
		 * Samosa samosa3 = Samosa.getSamosa(); System.out.println(samosa3.hashCode());
		 * Samosa samosa4 = Samosa.getSamosa(); System.out.println(samosa4.hashCode());
		 * Jalebi jalebi = Jalebi.getJalebi(); System.out.println(jalebi.hashCode());
		 * Jalebi jalebi1 = Jalebi.getJalebi(); System.out.println(jalebi1.hashCode());
		 */

		/*
		 * Samosa s1 = Samosa.getSamosa(); System.out.println(s1.hashCode());
		 * Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
		 * constructor.setAccessible(true); Samosa s2 = constructor.newInstance();
		 * System.out.println(s2.hashCode());
		 */
		Samosa samosa = Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		/*
		 * ObjectOutputStream oos=new ObjectOutputStream(new
		 * FileOutputStream("abc.ob")); oos.writeObject(samosa);
		 * System.out.println("Serialization Done Here...");
		 * 
		 * ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
		 * Samosa s2=(Samosa)ois.readObject(); System.out.println(s2.hashCode());
		 */
	Samosa s2	=(Samosa)samosa.clone();
	System.out.println(s2.hashCode());
	}

}
