package stages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;


import java.util.TreeMap;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderAdapter;


public abstract class Stage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mainTitle;
	private int stageID;
	private TreeMap<String, String> listove = new TreeMap<>();// Shte go vzima ot fail; // Subtitle, text
	
	public Stage(String mainTitle,	String filePlace) {
		this.mainTitle = mainTitle;
		File inputFile = new File(filePlace);
		if (inputFile.exists()) {
			System.out.println("Yeeeeee");
		}else {
			try {
				inputFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputFile));
	
		} catch (FileNotFoundException e) {
			System.out.println("The file is not found!");
		}
		try {
			if (reader.readLine().startsWith("Title")) {
				String currentTitle = reader.readLine();
				String currentText = "";
				while (!reader.readLine().startsWith("Title")) {
					reader.mark(0);
					currentText += reader.readLine()+"\n";
					reader.reset();
				}
				this.listove.put(currentTitle, currentText);
			}
		} catch (IOException e) {
			System.out.println("Something went Wrong !!!");
			e.printStackTrace();
		}
	}
	
	public void printMap() {
		for (Iterator<Entry<String, String>> it = listove.entrySet().iterator(); it.hasNext();) {
			Entry<String, String> ent = it.next();
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}
	}
	public void addInfo(String title, String text) {
		listove.put(title, text);
	}
}
