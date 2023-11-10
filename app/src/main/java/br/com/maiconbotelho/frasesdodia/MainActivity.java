package br.com.maiconbotelho.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Nem todas as tempestades vêm para atrapalhar a sua vida. Algumas vêm para limpar seu caminho",
                "A persistência realiza o impossível",
                "Não se desespere quando a caminhada estiver difícil, é sinal de que você está no caminho certo",
                "Seus sonhos não precisam de plateia, eles só precisam de você",
                "A persistência é o caminho do êxito",
                "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente",
                "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer",
                "No meio da dificuldade encontra-se a oportunidade",
                "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado",
                "Quando você quer alguma coisa, todo o universo conspira para que você realize o seu desejo"

        };

        //--GERA DE FORMA ALEATORIA UM NUMERO, QUE SERA USADO PARA ESCOLHER O INDEX DA FRASE----
        int numero = new Random().nextInt(11);

        TextView texto = findViewById(R.id.textViewFrase);
        texto.setText(frases[numero]);

    }
}