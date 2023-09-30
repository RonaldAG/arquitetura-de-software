package main;

import java.util.List;

import factory.FactoryImpl;
import factory.ListFactory;
import model.Lista;

public class UsaFabrica {
	
	public static void main(String[] args) {
		ListFactory f = null;
	    List<Object> c;
	    
	    int opc = 1;
	    
	    if (opc == 1) {
	        f = new FactoryImpl();
	        c = f.getList(Lista.ARRAY_LIST);
	        System.out.println(c);
	    } else if (opc == 2) {
	        c = f.getList(Lista.LINKED_LIST);
	        System.out.println(c);
	    }
	}
	
}
