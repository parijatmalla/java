package cs520.module6.L2_networking;


import java.net.*;
import java.io.*;
import javax.swing.*;

public class P01_URLDemo {
	
	public static void main(String[] args) {

		String page = "http://finance.yahoo.com/q?s=ORCL";
		//String page = "http://ichart.finance.yahoo.com/table.csv?s=ORCL";
		
		URL urlObject = null;
		
		try {
			urlObject = new URL(page);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Protocol (%s), Host (%s)\n",
				urlObject.getProtocol(),
				urlObject.getHost());
		
		System.out.printf("Port (%s), Default Port (%s)\n",
				urlObject.getPort(),
				urlObject.getDefaultPort());
		
		System.out.printf("Path (%s) Query (%s) File (%s)\n", 
				urlObject.getPath(),
				urlObject.getQuery(),
				urlObject.getFile());
		// read the data
		StringBuffer buffer = new StringBuffer();
		String inputLine;
		try {
			InputStreamReader inputStream = 
				new InputStreamReader(urlObject.openStream());
			BufferedReader reader = new BufferedReader(inputStream);
			while ((inputLine = reader.readLine()) != null) {
				buffer.append(inputLine + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// display the data
		JFrame frame = new JFrame(page);
		JTextArea ta = new JTextArea(buffer.toString());
		ta.setVisible(true);
		JScrollPane sp = new JScrollPane(ta);
	
		frame.getContentPane().add(sp);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
