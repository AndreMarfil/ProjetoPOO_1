package com.example.projetoglauco.service;

import java.util.ArrayList;

import com.example.projetoglauco.model.Produto;
import com.example.projetoglauco.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 */
//AQUI FICAM OS SERVIÇOS (Métodos)
@Service
public class ProdutoService {
@Autowired //para não precisar inicializar o pr (pr = new pr...)
private ProductRepository pr;

    public Produto getProduto(int id) 
    {
        return pr.getProdutoById(id); //pr para buscar no repositorio e utiliza a funcao para buscar produto
    }
    public ArrayList<Produto> ProdutosEmEstoque() //retorna um array de produtos que possuem estoque
    {
        ArrayList<Produto> ProdutosAux = new ArrayList<Produto>(); //array para guardar produtos em estoque

        for(Produto i : pr.getProdutos()) 
        {
            if(i.getEstoque() > 0)
                ProdutosAux.add(i);

        }
        return ProdutosAux;
    }
    public ArrayList<Produto> ProdutosByValorAcima(double valor)
    {
        ArrayList<Produto> ProdutosAcima = new ArrayList<Produto>();

        for(Produto i : pr.getProdutos())
        {
            if(i.getValor() > valor)
                ProdutosAcima.add(i);
        }
        return ProdutosAcima;
    }
    public ArrayList<Produto> ProdutosByValorAbaixo(double valor)
    {
        ArrayList<Produto> ProdutosAbaixo = new ArrayList<Produto>();

        for(Produto i : pr.getProdutos())
        {
            if(i.getValor() < valor)
                ProdutosAbaixo.add(i);
        }
        return ProdutosAbaixo;
    }
    
}