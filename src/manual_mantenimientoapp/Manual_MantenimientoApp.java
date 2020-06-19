/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manual_mantenimientoapp;

/**
 *
 * @author Lenin Alexander Carrillo Imbaquingo
 */
class Manual_Mantenimiento{
    /*Atributos*/
    private int codigo;
    private String servicio;
    private String mantenimiento;
    private int numMantenimiento;

    /*Constructor*/

    public Manual_Mantenimiento(int pCodigo,String pServicio,String pMantenimiento,int pNumMantenimiento){

        codigo=pCodigo;
        servicio=pServicio;
        mantenimiento=pMantenimiento;
        numMantenimiento=pNumMantenimiento;
    }

    /*Metodos*/

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public String getServicio(){
        return servicio;
    }

    public void setServicio(String servicio){
        this.servicio=servicio;
    }

    public String getMantenimiento(){
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento){
        this.mantenimiento=mantenimiento;
    }

    public int getNumMantenimiento(){
        return numMantenimiento;
    }

    public void setNumMantenimiento(int numMantenimiento){
        this.numMantenimiento=numMantenimiento;
    }

       @Override
    public String toString(){
        return "El Manual de Mantenimiento"+servicio+" con CODIGO: "+codigo+"--"
                + "Inspeccionado por el Supervisor de "+mantenimiento+
                 "tiene regustrados: "+numMantenimiento+ " mantenimientos";
    }
}
public class Manual_MantenimientoApp {


    public static void main(String[] args) {
        // Creamos los objetos
        Manual_Mantenimiento manual1=new Manual_Mantenimiento(111,"Servicio1","Mantenimiento1", 30);
        Manual_Mantenimiento manual2=new Manual_Mantenimiento(112,"Servicio2","Mantenimiento2", 60);

        //Mostramos su estado
        System.out.println(manual1.toString());
        System.out.println(manual2.toString());

        //Modificamos el Atributo NumMantenimiento del manual 11
        manual1.setNumMantenimiento(70);

        //Comparamos quien tiene mas mantenimiento

       if(manual1.getNumMantenimiento()<manual2.getNumMantenimiento()){
            System.out.println(manual1.getMantenimiento()+"tiene mas mantenimiento");
            }else{
              System.out.println(manual2.getMantenimiento()+"tiene mas mantenimiento");
          }
        }
    }
