import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CumprimentoDoDia {

    public CumprimentoDoDia() {
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        return dateFormat.format(date);
    }


    private int converteStringInt(String str){
        try{
            int number = Integer.parseInt(str);
            return  number;
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        return -1;
    }
    public void cumprimento(){
        int valorAuxiliar;
        String hora = this.getDateTime();
        valorAuxiliar = converteStringInt(hora);

        //Testa as horas do dia
        if (valorAuxiliar == -1){
            System.out.println("Aldo deu errado.");
        } else if (valorAuxiliar >= 6 && valorAuxiliar <= 12) {
            System.out.println("Bom dia!");
        } else if (valorAuxiliar >12 && valorAuxiliar <= 18) {
            System.out.println("Boa Tarde");
        } else if (valorAuxiliar > 18 && valorAuxiliar <= 23) {
            System.out.println("Boa Noite!");
        } else if (valorAuxiliar >= 0 && valorAuxiliar < 6) {
            System.out.println("Boa Madrugada!");
        }
    }

}
