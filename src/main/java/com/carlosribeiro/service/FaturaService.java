package com.carlosribeiro.service;

import com.carlosribeiro.dao.DAOFatura;
import com.carlosribeiro.dao.LivroDAO;
import com.carlosribeiro.exception.EntidadeNaoEncontradaException;
import com.carlosribeiro.exception.ImpossivelFaturarException;
import com.carlosribeiro.exception.NaoCancelavelException;
import com.carlosribeiro.model.*;
import com.carlosribeiro.util.FabricaDeDaos;

import java.time.LocalDate;

public class FaturaService {

    private final DAOFatura faturaDAO = FabricaDeDaos.getDAO(DAOFatura.class);

    public Fatura incluir(Fatura fatura) {
        return faturaDAO.incluir(fatura);
    }

    public Fatura faturarPedido(Pedido pedido) throws ImpossivelFaturarException {


        ListaDeObjetos<ItemFaturado> itens = new ListaDeObjetos<>(pedido.getListaItemPedido().size());
        for (ItemPedido itemP : pedido.getListaItemPedido()) {

            Livro livro = itemP.getLivro();
            int lve = livro.getQtdEstoque();
            int qpe = itemP.getQtdPedida();
            int qtf = 0;
            if (lve > 0) {
                if (lve >= qpe) { // se houver mais ou igual em estoque
                    livro.setQtdEstoque(lve - qpe);
                    qtf = qpe;
                } else {
                    qtf = lve;
                    livro.setQtdEstoque(0);
                }
            }
            if (itens.isEmpty()) {
                throw new ImpossivelFaturarException("Não foi possível faturar o pedido porque todos os itens estão sem estoque");
            }

        }
        return new Fatura(LocalDate.now(), itens, pedido);
    }

    public Fatura remover(int id) {
        Fatura fatura = faturaDAO.recuperarPorId(id);
        if (fatura != null) {
            for (ItemFaturado item : fatura.getItensFaturados()) {
                Livro livro = item.getLivro();
                livro.setQtdEstoque(livro.getQtdEstoque() + item.getQtdFaturada());
            }
            fatura.getItensFaturados().clear();
            return faturaDAO.removerObj(fatura);
        }
        throw new EntidadeNaoEncontradaException("A fatura não existe.");

    }


    public Fatura cancelar(int numFatura) throws NaoCancelavelException, EntidadeNaoEncontradaException {
        Fatura c = faturaDAO.recuperarPorId(numFatura);
        if (c != null) {
            if (c.getPedido().getCliente().getListaFaturas().size() >= 3) { // faturou mais ou = 3 pedidos
                c.setDataCancelamento(LocalDate.now());
                return c;
            }
            throw new NaoCancelavelException("Não é possível cancelar caso haja menos de três pedidos faturados");
        }
        throw new EntidadeNaoEncontradaException("A fatura selecionada não existe.");
    }

    public Fatura recuperarId(int id) {
        return faturaDAO.recuperarPorId(id);
    }
}

}
