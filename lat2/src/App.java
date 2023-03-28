import java.util.ArrayList;

public class App{
    public static void main(String[] args) {
        // Buat objek Hewan dan DeleteHewan
        ArrayList<Hewan> hewanList = new ArrayList<>();
        hewanList.add(new Hewan("Kucing"));
        hewanList.add(new Hewan("Anjing"));
        hewanList.add(new Hewan("Burung"));
        hewanList.add(new Hewan("Kuda"));
        hewanList.add(new Hewan("Ikan"));

        ArrayList<DeleteHewan> deleteHewanList = new ArrayList<>();
        deleteHewanList.add(new DeleteHewan("Kucing"));
        deleteHewanList.add(new DeleteHewan("Burung"));
        deleteHewanList.add(new DeleteHewan("Ikan"));

        // Cek data sebelum dihapus
        System.out.println("Data sebelum dihapus:");
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.toString());
        }

        // Lakukan penghapusan data
        for (DeleteHewan deleteHewan : deleteHewanList) {
            String jenis = deleteHewan.getJenis();
            hewanList.removeIf(hewan -> hewan.getJenis().equals(jenis));
        }

        // Cek data setelah dihapus
        System.out.println("\nData setelah dihapus:");
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.toString());
        }
    }
}

class Hewan {
    private String jenis;

    public Hewan(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }


    @Override
    public String toString() {
        return "Hewan{" +
                "jenis='" + jenis + '\'' +
                '}';
    }
}

class DeleteHewan {
    private String jenis;

    public DeleteHewan(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }
}