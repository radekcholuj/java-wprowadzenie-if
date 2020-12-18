public class Laptop {
    public static void main(String[] args) {

        double laptopAcer = 3799.00;
        double laptopMSI = 5799.99;
        double laptopToshiba = 7799;

        if (laptopAcer < laptopToshiba && laptopAcer < laptopMSI) {
            System.out.println("Jesli interesuję Cię najtańszy laptop to powinieneś wybrać laptop marki Acer");
        } else if (laptopToshiba < laptopAcer && laptopToshiba < laptopMSI){
            System.out.println("Jesli interesuję Cię najtańszy laptop to powinieneś wybrać laptop marki Toshiba");

        }else if(laptopMSI < laptopAcer && laptopMSI < laptopToshiba){
            System.out.println("Jesli interesuję Cię najtańszy laptop to powinieneś wybrać laptop marki MSI");

        }

    }


}
