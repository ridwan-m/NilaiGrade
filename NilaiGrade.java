public class NilaiGrade{
    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        String grade;
        System.out.println("Grade");
        
        if(nilai >= 85){
            if(nilai <=100){
            System.out.println("A");
            }
        }
        else if(nilai >= 75){
            if(nilai <= 84){
                System.out.println("B");
            }
        }
        else if(nilai >= 60){
            if(nilai <= 74){
                System.out.println("C");
            }
        }
        else if(nilai >= 45){
            if(nilai <= 59){
                System.out.println("D");
            }
        }
        else if(nilai >= 0){
            if(nilai <= 44){
                System.out.println("E");
            }
        }
        else{
            System.out.println("Nilai Yg Anda Masukan Tidak Valid");
        }
    System.out.println("Remedial");
    }
}