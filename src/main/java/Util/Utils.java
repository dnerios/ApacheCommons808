package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;


import org.apache.commons.io.FileUtils;

public class Utils {

    @Deprecated
    public static void imprimirQualquerCoisa() {
        System.out.println("qualquer coisa");
    }

    public static String lerArquivo() {
        File file = FileUtils.getFile(Utils.class.getClassLoader()
                .getResource("texto.txt")
                .getPath());

        File tempDir = FileUtils.getTempDirectory();
        try {
            FileUtils.copyFileToDirectory(file, tempDir);

            File newTempFile = FileUtils.getFile(tempDir, file.getName());
            String data = FileUtils.readFileToString(newTempFile, Charset.defaultCharset());

            return data;
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    //Exemplo
    public static void lerArquivoBasico() throws Exception{
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("texto.txt");
            out = new FileOutputStream("texto_copia.txt");

            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void lerArquivoBasicoUpgrade() throws Exception{

        try(FileInputStream in = new FileInputStream("texto.txt");
            FileOutputStream out = new FileOutputStream("texto_copia.txt")) {

            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        }
    }

}
