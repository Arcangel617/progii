package com.company;

/**
 * Juan tiene n actividades que realizar y sabe cuándo empieza y cuándo termina cada una.
 * Lamentablemente algunas se superponen y por lo tanto no puede realizarlas todas. El problema
 * pide la máxima cantidad de actividades que Juan puede realizar sin que se le superponen
 * dos de ellas.
 * Teniendo en cuenta que cada franja de tiempo representa una hora del dia distinta. Por ejemplo:
 * La actividad ​ B ​ empieza una hora luego de la actividad ​ A ​ y tiene una duración de 3 horas,
 * y la actividad ​ C ​ empieza 3 horas luego de la ​ A ​  y tiene un duración de 2 horas.
 *
 * Aclaraciones: Puede establecer horarios a las franjas de tiempo del gráfico a modo de poder
 * determinar la hora de inicio y fin de cada actividad. Por ejemplo: La actividad ​A inicia a las
 * 9:00 am, la actividad ​B ​a las 10 am, la actividad ​C ​inicia a las 12 pm, etc.
 *
 * @author Arcangel Andres Artigue
 * @version 300916
 */
public class Ejercicio02 {
    public static void main(String [] args){

        Actividad[] actividades = new Actividad[8];
        int tiempo;

        actividades[0] = new Actividad("A",9,6);
        actividades[1] = new Actividad("B",10,3);
        actividades[2] = new Actividad("C",12,2);
        actividades[3] = new Actividad("D",12,5);
        actividades[4] = new Actividad("E",13,3);
        actividades[5] = new Actividad("F",14,4);
        actividades[6] = new Actividad("G",15,4);
        actividades[7] = new Actividad("H",17,3);

        for (int i = 0; i < actividades.length; i++) {

            System.out.println(actividades[i].toString());
            tiempo = actividades[i].getFinalizacion();

            for (int j = 0; j < actividades.length; j++) {
                if (tiempo <= actividades[j].getHoraInicio()){
                    System.out.println(actividades[j].toString());
                    tiempo = tiempo + actividades[j].getDuracion();
                }
            }

            System.out.println("====================================================");
        }


    }
}

class Actividad{
    private int horaInicio;
    private int duracion;
    private int finalizacion;
    private String desc;

    public Actividad(String desc, int horaInicio, int duracion){
        this.desc = desc;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.finalizacion = horaInicio + duracion;
    }

    public int getHoraInicio(){
        return this.horaInicio;
    }

    public int getDuracion(){
        return this.duracion;
    }

    public int getFinalizacion(){
        return this.finalizacion;
    }

    @Override
    public String toString(){
        return "Actividad "+this.desc+";Hora de inicio: "+this.horaInicio+";Duracion: "+this.duracion+";Finalizacion: "+this.finalizacion;
    }
}
