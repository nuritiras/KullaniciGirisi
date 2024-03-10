package tr.com.nuritiras.kullanicigirisi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import tr.com.nuritiras.kullanicigirisi.databinding.ActivityAnaSayfaBinding;

public class AnaSayfa extends AppCompatActivity {
    private ActivityAnaSayfaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAnaSayfaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String kullaniciAdi= Singleton.getInstance().getKullaniciAdi();
        String parola=Singleton.getInstance().getKulaniciParola();
        binding.textViewKullaniciAdi.setText(kullaniciAdi);
        binding.textViewParola.setText(parola);
    }
}