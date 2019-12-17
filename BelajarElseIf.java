public class BelajarElseIf{
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isUmbrellaAvail = false;

        if(isRaining && isUmbrellaAvail){
            System.out.println("Boleh Keluar Rumah");
        }
        else if(isRaining == false && isUmbrellaAvail){
            System.out.println("Payung Ada, Tapi Boleh Keluar Karena Gak Hujan");
        }
        else if(isRaining == false && isUmbrellaAvail == false){
            System.out.println("Payung Gak Ada, Tapi Boleh Keluar Karena Gak Hujan");
        }
        else{
            System.out.println("Tidak Boleh Keluar Rumah");
        }
    }
}