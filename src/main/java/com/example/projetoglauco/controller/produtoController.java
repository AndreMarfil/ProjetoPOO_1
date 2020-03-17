package com.example.projetoglauco.controller;

import java.util.ArrayList;

import com.example.projetoglauco.model.Produto;
import com.example.projetoglauco.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * produtoController
 */
@Controller
public class produtoController {

    
    @Autowired 
    private ProdutoService ps;
    
    @GetMapping("")
    public ModelAndView menu()
    {
        ModelAndView menu = new ModelAndView("Menu");
        
        return menu; 
    }

    @GetMapping("/produto/{id}")
    public ModelAndView getProduto(@PathVariable("id") int codigo) //Criando uma visão
    {
        ModelAndView produtomv = new ModelAndView("Produto");
        Produto p = ps.getProduto(codigo);
        produtomv.addObject("Produto", p);
        return produtomv;
    }

    @GetMapping("/produtosEmEstoque")
    public ModelAndView getProdutosEmEstoque(){
        ModelAndView mv = new ModelAndView("ProdutosEmEstoque");

        ArrayList<Produto> ap = ps.ProdutosEmEstoque();

        mv.addObject("produtos", ap);

        return mv;
    }

    @GetMapping("/produtosValorAcima/{valor}")
    public ModelAndView ProdutosByValorAcima(@PathVariable ("valor") double valor) //TEM PARAMETRO
    {
        ModelAndView mv = new ModelAndView("ProdutosByValorAcima");

        ArrayList<Produto> ap = ps.ProdutosByValorAcima(valor);

        mv.addObject("produtos", ap);

        return mv;
    }

    @GetMapping("/produtosValorAbaixo/{valor}")
    public ModelAndView ProdutosByValorAbaixo(@PathVariable ("valor") double valor) //TEM PARAMETRO
    {
        ModelAndView mv = new ModelAndView("ProdutosByValorAbaixo");

        ArrayList<Produto> ap = ps.ProdutosByValorAbaixo(valor);

        mv.addObject("produtos", ap);

        return mv;
    }


    
    
    
}