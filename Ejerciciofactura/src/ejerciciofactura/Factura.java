/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofactura;

/**
 *
 * @author l11m13
 */
class Factura {
    private int codigo;
    private double subTotal;
    private double total;

    public Factura() {
    }

    public Factura(int codigo, double subTotal) {
        this.codigo = codigo;
        this.subTotal = subTotal;
     
        
    }
    public void calcularTotal(){
             this.subTotal=this.subTotal*1.18;
             System.err.println("seteando el total"+this.total);
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        System.out.println("seteando el subtotal"+subTotal);
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
