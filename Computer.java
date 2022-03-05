package org.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Computer {

	static void getComputerModel() {

		// command to get computer manufacturer info
		String command = "wmic computersystem get manufacturer /value";
		try {

			// command to execute in Java
			Process pro = Runtime.getRuntime().exec(command);

			// store the result
			BufferedReader reader = new BufferedReader(new InputStreamReader(pro.getInputStream()));

			// loop the result
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
