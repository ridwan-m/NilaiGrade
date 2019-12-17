public class NestedIf{
    public static void main(String[] args) {
        String email = "admin@techpolitan.co";
        String password = "secret";

        if(email == "ridwan@techpolitan.co"){
            if(password == "secret123"){
                System.out.println("Berhasil Login");
            }
            else{
                System.out.println("Maaf Password Anda Salah");
            }
        }
        else{
            System.out.println("gagal login, email yg anda masukan tidak terdaftar");
        }
    }
}   