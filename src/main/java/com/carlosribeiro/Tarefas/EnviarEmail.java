package com.carlosribeiro.Tarefas;

import com.carlosribeiro.dao.ClienteDAO;
import com.carlosribeiro.model.Cliente;
import com.carlosribeiro.util.FabricaDeDaos;
import java.util.Map;

public class EnviarEmail extends Thread{
    @Override
    public void run() {
        ClienteDAO daoC = FabricaDeDaos.getDAO(ClienteDAO.class);
        Map map = daoC.getMap();
        for(int i = 0; i<map.size(); i++){
            System.out.println("Enviando email para: "+((Cliente)map.get(i)).getEmail());
        }
    }
}
