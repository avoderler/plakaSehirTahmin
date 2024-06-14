package com.avo.tahminoyunu;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.avo.tahminoyunu.databinding.ActivityNormalOyunBinding;

import java.util.ArrayList;
import java.util.Random;

public class normalOyun extends AppCompatActivity {
    String[] iller = {"Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
    Random rastgele;
    int rastgeleSehirSira;
    String rastgeleSehir, sehirCizgileri = "", sehir;
    ArrayList<Character> sehirHarfleri ;
    private ActivityNormalOyunBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityNormalOyunBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        sehirSec();
sehirHarfleri=new ArrayList<>();
for (char harf:rastgeleSehir.toCharArray())sehirHarfleri.add(harf);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainNM), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        System.out.println(iller.length);
    }

    public void btnHarfAlNM(View view) {
        Random random;
        random = new Random();
        int deger = random.nextInt(rastgeleSehir.length());

        String[] parcalar = sehir.split("");

        binding.txtNrmlOyun.setText(binding.txtNrmlOyun.getText() + parcalar[deger]);
        System.out.println(parcalar[deger]);

        //binding.txtNrmlOyun.setText(karakterler[deger]);
        System.out.println(sehir);


    }
    public void tahminEtNM(View view) {
    }

    public void sehirSec() {
        rastgele = new Random();
        rastgeleSehirSira = rastgele.nextInt(iller.length);
        rastgeleSehir = iller[rastgeleSehirSira];

        sehir = rastgeleSehir;
        System.out.println(sehir);
        for (int i = 0; i < rastgeleSehir.length(); i++) {
            sehirCizgileri += "_ ";

        }
        binding.txtNrmlOyun.setText(sehirCizgileri);
    }

}