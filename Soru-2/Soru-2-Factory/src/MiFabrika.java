public class MiFabrika {
    public static Telefon telefonUret(String telefonModeli){
        if (telefonModeli.equalsIgnoreCase("MiNote10")){
            return new MiNote10();
        }else if(telefonModeli.equalsIgnoreCase("Mi8")){
            return new Mi8();
        }
        return null;
    }
}
