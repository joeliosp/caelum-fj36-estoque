package br.com.caelum.estoque.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws IOException {
		try(ObjectOutputStream oos = new ObjectOutputStream(
									 new FileOutputStream("itens.bin"))){
			
			ItemEstoque item1 = new ItemEstoque("ARQ", 2);
			ItemEstoque item2 = new ItemEstoque("SOA", 3);
			ItemEstoque item3 = new ItemEstoque("SOA", 4);
			ItemEstoque item4 = new ItemEstoque("SOA", 5);
			ItemEstoque item5 = new ItemEstoque("SOA", 6);
			
			List<ItemEstoque> itens = new ArrayList<ItemEstoque>();
			itens.add(item1);
			itens.add(item2);
			itens.add(item3);
			itens.add(item4);
			itens.add(item5);
			
			
			oos.writeObject(itens);
		}
	}

}
