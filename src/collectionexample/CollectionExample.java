/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ijhar
 */
public class CollectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection values=new ArrayList();
        values.add(1);
        values.add(5);
        values.add(3);
        values.add("11");
        for(Object o:values)
        {
            System.out.println(o);
        }
    }
    
}
