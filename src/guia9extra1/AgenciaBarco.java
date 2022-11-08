/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia9extra1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AgenciaBarco {
    ArrayList<Barco>listaBarcos=new ArrayList();
   public void agregarBarco(){
     listaBarcos.add(new Velero(2,105,4,new Date(2012,8,20)));
     listaBarcos.add(new BarcoMotor(6,189,12,new Date(2015,2,11)));
     listaBarcos.add(new Yate(6,24,155,30, new Date(2021,4,24)));
   }

public Barco buscarBarco (){
Scanner sc=new Scanner(System.in);
    Integer opcion=0;
    
        int i =1;
        for (Barco b1 : listaBarcos) {
            System.out.println(i+" "+b1.getClass());
            i++;
        }
        opcion=sc.nextInt();
        return listaBarcos.get(opcion-1);
    }




}
