import java.util.Scanner;
import java.util.TreeSet;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
	public class Driver {
		
	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("Thirukurral.txt");
		Scanner s = new Scanner(file);
		ArrayList<Thirukurral> arr = new ArrayList<>();
		while(s.hasNextInt()){
			int num = s.nextInt();
			s.nextLine();
			s.nextLine();
			String kural = s.nextLine() + "\n";
			kural += s.nextLine() + "\n";
			for(int i = 0; i < 11; i++){
				s.nextLine();
			}
			String eng_kural = s.nextLine() + "\n";
			String temp = s.nextLine();
			int count = 3;
			if(!temp.isEmpty()){
				eng_kural += temp + "\n";
			} else {
				count--;
			}
			for(int i = 0; i < count; i++){
				s.nextLine();
			}
			String def = s.nextLine() + "\n";
			for(int i = 0; i < 3; i++){
				s.nextLine();
			}
			String tanglish_kural = s.nextLine() + "\n";
			temp = s.nextLine();
			if(!temp.isEmpty()){
				tanglish_kural += "\t\t\t\t" + temp + "\n";
				s.nextLine();
			}
			
			Thirukurral t = new Thirukurral(kural, tanglish_kural, eng_kural, def, num);
			arr.add(t);
		}

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		Date date = new Date();  
		String d = formatter.format(date);
		System.out.println(d);  

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("01", 31);
        hm.put("02", (isLeapYear(d.substring(6, d.length()))) ? 29 : 28);
        hm.put("03", 31);
        hm.put("04", 30);
        hm.put("05", 31);
        hm.put("06", 30);
        hm.put("07", 31);
        hm.put("08", 30);
        hm.put("09", 31);
        hm.put("10", 30);
        hm.put("11", 31);
        hm.put("12", 30);
		String month = d.substring(0, 2);
		int day = Integer.parseInt(d.substring(3, 5));
		int num = 0;
		TreeSet<String> keys = new TreeSet<>();
		for (String m : hm.keySet()) {
			keys.add(m);
		}
		
		for (String m : keys) {
			if(m.equals(month)){
				num += day;
				break;
			} else {
				num += hm.get(m);
			}
		}
		System.out.println(arr.get(--num));
		
		s.close();
	}

	public static boolean isLeapYear(String str){
		int year = Integer.parseInt(str);
		if (year % 4 != 0) {
			return false;
		  } else if (year % 400 == 0) {
			return true;
		  } else if (year % 100 == 0) {
			return false;
		  } else {
			return true;
		}
	}
}
