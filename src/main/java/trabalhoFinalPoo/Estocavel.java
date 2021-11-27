/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinalPoo;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public interface Estocavel {
    public void addItem(Item iten);
    public void deleteItem(int id);
    public Item getItem(int id);
    public void exportData();
    public void importData();
    public ArrayList<Item> searchData(String fieldName,String FieldValue);
}
