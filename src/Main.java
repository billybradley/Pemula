import home.enigma.model.Mobil;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //input coordinate
        System.out.print("Masukkan Koordinat Mobil Anda : ");
        String coordinate = reader.readLine();
        String[] val = coordinate.split(",");

        Mobil kijang = new Mobil(Integer.parseInt(val[0]) ,Integer.parseInt(val[1]));

        //Fill
        System.out.print("Isi Bahan Bakar Anda : ");
        String isiBensin = reader.readLine();
        int fuel = Integer.parseInt(isiBensin);
        kijang.fillFuel(fuel);

        System.out.println("Masukkan Perintah : ");
        kijang.command(reader.readLine());

        kijang.run();




        //Print All
        System.out.println(kijang.print());
    }
}
