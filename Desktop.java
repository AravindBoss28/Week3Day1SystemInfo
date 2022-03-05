package org.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Desktop extends Computer {

	static void getDesktopSize() {
		String command = "wmic path Win32_VideoController get CurrentHorizontalResolution,CurrentVerticalResolution";

		try {
			// command to execute in Java
			Process pro = Runtime.getRuntime().exec(command);

			// store the result
			// result will be in buffer reader format
			// so creating a object for buffer reader and storing
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Computer.getComputerModel();
		System.out.println("====================================>");
		Desktop.getDesktopSize();
		System.out.println("====================================>");
	}

}
