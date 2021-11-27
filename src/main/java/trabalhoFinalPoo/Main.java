/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinalPoo;

/**
 *
 * @author matheus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estoque estoque1 = new Estoque();
        /*
        Item aux;
        aux = new Item(1,"peca1","metros",2.0f,1.0f,0.7f);
        estoque1.addItem(aux);
        aux = new Item(1,"roda","metros",2.0f,1.0f,0.7f);
        estoque1.addItem(aux);
        
        
        estoque1.exportData();
        */
       
        estoque1.importData();
        estoque1.testaItens();
        
    }
    
}
