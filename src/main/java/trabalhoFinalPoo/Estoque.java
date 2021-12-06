/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinalPoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus
 */
public class Estoque implements Estocavel {

    private ArrayList<Item> itens;

    /**
     * @return the itens
     */
    public ArrayList<Item> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public Estoque(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public Estoque() {
        this.itens = new ArrayList<Item>();
    }

    @Override
    public void addItem(Item iten) {
        this.itens.add(iten);
    }

    @Override
    public void deleteItem(String nome) {
        Item aux;        
        for (int i = 0; i < this.itens.size(); i++) {
            System.out.println(Integer.toString(i));

            aux = this.itens.get(i);

            if (aux.getNome().equals(nome)) {
                this.itens.remove(i);
                break;
            }
            
        }
    }

    @Override
    public Item getItem(int id) {
        Item aux;
        for (int i = 0; i < this.itens.size(); i++) {
            aux = this.itens.get(i);
            if (aux.getId() == id) {
                return aux;

            }
        }
        throw new UnsupportedOperationException("Not find."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void exportData() {
        Item aux;
        try {   // this is for monitoring runtime Exception within the block 
            File file = new File("teste.txt"); // here file not created here

            // if file doesnt exists, then create it
            if (!file.exists()) {   // checks whether the file is Exist or not
                file.createNewFile();   // here if file not exist new file created 
            } else {
                file.delete();
                file.createNewFile();   // here if file not exist new file created 
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true); // creating fileWriter object with the file
            BufferedWriter bw = new BufferedWriter(fw); // creating bufferWriter which is used to write the content into the file
            for (int i = 0; i < this.itens.size(); i++) {
                aux = this.itens.get(i);
                bw.write(String.valueOf(aux.getId()) + ";" + aux.getNome() + ";" + aux.getUnidade_tamanho() + ";" + String.valueOf(aux.getTamanho()) + ";" + String.valueOf(aux.getPreco()) + ";" + String.valueOf(aux.getCusto()) + "\n"); // write method is used to write the given content into the file
            }

            bw.close(); // Closes the stream, flushing it first. Once the stream has been closed, further write() or flush() invocations will cause an IOException to be thrown. Closing a previously closed stream has no effect. 

            System.out.println("Done");

        } catch (IOException e) { // if any exception occurs it will catch
            e.printStackTrace();
        }
    }

    @Override
    public void importData() {
        this.itens = new ArrayList<Item>();
        Item aux_item;
        String aux[];
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("teste.txt"), "UTF-8"));
            String line;
            while ((line = br.readLine()) != null) {
                aux = line.split(";");
                aux_item = new Item(Integer.parseInt(aux[0]),aux[1],aux[2],Float.parseFloat(aux[3]),Float.parseFloat(aux[4]),Float.parseFloat(aux[5]));
                this.addItem(aux_item);
            }
            //closes the stream and release the resources
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @Override
    public ArrayList<Item> searchData(String field_name, String field_value) {
        ArrayList<Item> retorno = new ArrayList<Item>();
        System.out.println(field_name);
        System.out.println(field_value);

        Item aux;
        for (int i = 0; i < this.itens.size(); i++) {
            System.out.println(Integer.toString(i));

            aux = this.itens.get(i);
            switch (field_name) {
                case "nome":
                    if (aux.getNome().equals(field_value)) {
                        System.out.println("bingo!!!");

                        retorno.add(aux);
                    }
            }
        }
        return retorno;
    }
    public void testaItens(){
        Item aux;
        for (int i = 0; i < this.itens.size(); i++) {
            aux = this.itens.get(i);
            System.out.print(String.valueOf(aux.getId()) + ";" + aux.getNome() + ";" + aux.getUnidade_tamanho() + ";" + String.valueOf(aux.getTamanho()) + ";" + String.valueOf(aux.getPreco()) + ";" + String.valueOf(aux.getCusto()) + "\n");
        }
    }

}
