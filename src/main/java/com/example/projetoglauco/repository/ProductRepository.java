package com.example.projetoglauco.repository;

import java.util.Collection;
import java.util.HashMap;

import com.example.projetoglauco.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * productRepository
 */
@Repository
public class ProductRepository {

    
HashMap<Integer,Produto> Produtos = new HashMap<Integer,Produto>();

public ProductRepository(){

    Produtos.put(1,new Produto(1, "Porca", 10, 150));
    Produtos.put(2,new Produto(2, "Bobina", 100, 250));
    Produtos.put(3,new Produto(3, "Cabeçote", 759, 50));
    Produtos.put(4,new Produto(4, "Pastilha de Freio", 139, 0));
    Produtos.put(5,new Produto(5, "Vela de Ignição ", 300, 30));
    Produtos.put(6,new Produto(6, "Filtro de ar", 170, 45));
    Produtos.put(7,new Produto(7, "Sapata de freio", 320, 15));
    Produtos.put(8,new Produto(8, "Bronzina de Biela", 140, 99));
    Produtos.put(9,new Produto(9, "Carburador", 140, 23));
    Produtos.put(10,new Produto(10, "Vela", 210, 160));

}

public Produto getProdutoById(int id) // SERVIÇO
{
    Produto p = new Produto();

    for (int i=1; i <= Produtos.size(); i++)
    {
        if (Produtos.get(i).getCodigo() == id)
        {
            p = Produtos.get(i);
            return p;
            
        }
    }
    return null;
}
public Collection<Produto> getProdutos()
{
   return Produtos.values(); //retorna todos os produtos
}

}