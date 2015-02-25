package lab2_AP;

import java.io.*;
import java.util.StringTokenizer;


public class Interprator {
	String name;
	int value;

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}

	public void setName(String name2) {
		this.name = name2;		
	}
	
	public int add(int val,int value3) {
		int val1;
		val1 = val + value3;
		return val1;
		//System.out.println("final value is"+ val1);
	}
	

	public static void main(String[] args) throws IOException {
		Interprator object = new Interprator();			
		Interprator[] array = new Interprator[5];
		int i =0;
		
		try {
			FileInputStream fstream;
			fstream = new FileInputStream("E:\\test.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		
		String line = null;
		while ((line = br.readLine()) != null) {
		if (line.contains("let")) {
			if (line.contains("=")) {
				String[] r = line.split(" ");
				StringTokenizer st = new StringTokenizer(r[1], "=");
				while (st.hasMoreTokens()) {
					String name = st.nextToken();
					//System.out.println(name);
					String value = st.nextToken();
					int value2 = Integer.parseInt(value);
					object.setName(name);
					object.setValue(value2);
					array[i]=object;
					System.out.println(" " + array[i].getName()
							+ array[i].getValue());	
				}
			}
			else {
				System.out.print("ERROR!");
			}}
		
		else if (line.contains("print")) {
			System.out.println("printing..");
			String[] r = line.split(" ");
			String name = r[1];
			object.setName(name);
			
			array[i]= object;
			System.out.println("Value of y is:" + array[i].getValue());
					
		}
		
		else if (line.contains("+")) {
			System.out.println("It contains addition..");
			if (line.contains("=")) {
		
			StringTokenizer st = new StringTokenizer(line, "=");
			while (st.hasMoreTokens()) {
				String name = st.nextToken();
				//System.out.println(name);
				String value = st.nextToken();
				//System.out.println(value);
				StringTokenizer st1 = new StringTokenizer(value, "+");
				while (st1.hasMoreTokens()) {
					String name1 = st1.nextToken();
					//System.out.println(name1);
					String value1 = st1.nextToken();
					//System.out.println("value"+ value1);
					int value3 = Integer.parseInt(value1);
					//System.out.println("value is"+ value3);
					object.setName(name1);
					array[i]= object;
					int val = array[i].getValue();
					//System.out.println("Value of y is:" + array[i].getValue());
					//System.out.println("final value of y is"+ array[i].add(val,value3));
	
		
				}
				
				object.setName(name);
				//int val1 = 0;
				//object.setValue(val1);
				array[i]=object;
				System.out.println(" " + array[i].getName()
						+ array[i].getValue());	
					
				}
				
			}
			}
	
		i++;	

		}
	br.close();
} catch (FileNotFoundException ex) {
	System.out.println("Unable to open file");
} catch (IOException ex) {
	System.out.println("Error reading file");
}
}
public void Equating(){
int operators[]=new int [5];
}


}
