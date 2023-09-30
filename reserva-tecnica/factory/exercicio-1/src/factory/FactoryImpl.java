package factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import model.Lista;

public class FactoryImpl implements ListFactory{

	@Override
	public List<Object> getList(Lista lista) {
		if(lista.equals(Lista.ARRAY_LIST)) {
			return new ArrayList<>();
		} else if(lista.equals(Lista.LINKED_LIST)) {
			return new LinkedList<>();
		}
		else if(lista.equals(Lista.VECTOR)){
			return new Vector<>();
		}
		
		return null;
	}

}
