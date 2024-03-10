package tr.com.nuritiras.kullanicigirisi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import tr.com.nuritiras.kullanicigirisi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    public void kullaniciGirisi(View view) {
        String kullaniciAdi = binding.editTextKullaniciAdi.getText().toString();
        String parola = binding.editTextParola.getText().toString();
        //Singletoon tanımlama ve değer atamaları
        Singleton singleton = Singleton.getInstance();
        singleton.setKullaniciAdi(kullaniciAdi);
        singleton.setKulaniciParola(parola);
        //Diğer Activity’ye geçiş
        Intent intent = new Intent(this, AnaSayfa.class);
        startActivity(intent);
    }
}