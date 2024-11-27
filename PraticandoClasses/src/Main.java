
import br.eu.com.Veiculo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        Veiculo veiculo = new Veiculo();

        veiculo.setMarca("poggers");
        veiculo.setModelo("moggers");
        veiculo.setAnoFabricacao(2003);
        veiculo.setPreco(10.99);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(veiculo);
        System.out.println(json);


    }
}