/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ijhar
 */
public class Example3 {
     public static void main(String[] args) {
        // TODO code application logic here
        List values=new ArrayList();
        values.add(1);
        values.add(5);
        values.add(3);
        values.add(1,"11");//Intedex suport in List
     Iterator it=  values.iterator();
         while (it.hasNext()) {
             System.out.println(it.next());
             
         }
       
       
}
}