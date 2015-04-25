package cs520.module6.L2_networking;


import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

public class P04_Client {

	public static void main(String[] args) {

		int SERVER_PORT = 8080;
		String SERVER_HOST = "localhost";
		Socket s = null;
		// Connect to the Server
		try {
			s = new Socket(SERVER_HOST, SERVER_PORT);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String input = JOptionPane.showInputDialog("Enter message:");

		// Communicate with the server
		try {
			// Create a writer to the socket's output stream
			PrintWriter writer = 
				new PrintWriter(s.getOutputStream(), true);	
			// Create a reader from the socket's input stream
			InputStreamReader inputStream = 
				new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(inputStream);
		
			// Send the message to the server
			writer.println(input);
			
			// Process the response from the server
			String response = reader.readLine();
			JOptionPane.showMessageDialog(null, response);
			
			// Close the connections
			writer.close();
			reader.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
