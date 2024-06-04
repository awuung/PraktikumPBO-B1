import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaList = new HashMap<>();
        mahasiswaList.put("123","Adi");
        mahasiswaList.put("456","Bambang");
        mahasiswaList.put("789","Cici");
        mahasiswaList.put("112","Didi");

        mahasiswaList.forEach((nim, nama)-> System.out.println(nim +" "+ nama));
    }    
}
