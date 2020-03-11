public class Data{
    public int dia,mes,hora,minuto,segundo;

    public void imprime(){
        System.out.println("Dia: "+this.dia +" Mês: "+this.mes +" Hora: "+this.hora +" Minuto: "+this.minuto +" Segundo: "+this.segundo);
    }
    
    public void AM_PM(){
        if (this.hora < 12){
            System.out.println("AM");
        }
        else{
            System.out.println("PM");
        }
    }


}