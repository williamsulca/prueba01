/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofactura;

public class Ejerciciofactura {
   
    public static void main(String[] args) {
       //Factura ofactura = new Factura(1,100);
       
       Factura ofact1 =new Factura();
       ofact1.setCodigo(2);
       ofact1.setCodigo(159);
       ofact1.calcularTotal();
       ofact1.getSubTotal();
       double total =ofact1.getTotal();
        System.out.println("TOTAL:"+total);
        
    }
    
}
