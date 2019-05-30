package kallbright.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

        public class MainActivity extends AppCompatActivity {

            int rand;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genRand();

      }

    private void genRand(){
            Random randGen = new Random();
            this.rand = randGen.nextInt(9)+1;
            System.out.println("Random Number Generated: " + this.rand);
    }

    public void checkGuess(View view){
        EditText guess= findViewById(R.id.Number);
        int Guess = Integer.parseInt(guess.getText().toString());
        System.out.println(rand);

        if(rand == Guess) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else if (rand > Guess){
            Toast.makeText(this, "Too Low", Toast.LENGTH_SHORT).show();
        } else if (rand < Guess){
            Toast.makeText(this, "Too High", Toast.LENGTH_SHORT).show();
        }
       // Toast.makeText(this, "Hi", Toast.LENGTH_LONG).show();
    }

    public void tryAgain(View view){
        genRand();
    }
}
