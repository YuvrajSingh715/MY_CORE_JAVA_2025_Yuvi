package collectionframework.list;

import java.util.concurrent.CopyOnWriteArrayList;

public class HCMExc {

	public static void main(String[] args) {
	
		CopyOnWriteArrayList  <String> list = new CopyOnWriteArrayList<>();
     
		list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        
        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s); 			
			}
		}
	    System.out.println(list);
	}

}
