import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BooleanSearchEngine implements SearchEngine {

    private String pdf;
    PdfDocument doc;
    private String pdfName;

    public BooleanSearchEngine(File pdfsDir) {
        pdfsDir = new File("C://Users//Николай Калинин//IdeaProjects//psc-final-diplom//pdfs");
        if (pdfsDir.isDirectory()) {
            for (File item : pdfsDir.listFiles()) {

                if (item.isDirectory()) {

                    System.out.println(item.getName() + "  \t folder");
                } else {

                    System.out.println(item.getName() + "\t file");
                }

                try (FileReader reader = new FileReader("1. DevOps_MLops.pdf")) {
                    int c;
                    while ((c = reader.read()) != -1) {

                        System.out.print((char) c);
                    }
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }
            }
            try (FileReader reader = new FileReader("Что такое блокчейн.pdf")) {
                // читаем посимвольно
                int c;
                while ((c = reader.read()) != -1) {

                    System.out.print((char) c);
                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
        try (FileReader reader = new FileReader("Этапы оценки проекта_ понятия, методы и полезные инструменты.pdf")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("Продвижение игр.pdf")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("Как управлять рисками IT-проекта.pdf")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("SoftSkills.pdf")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("Облачные технологии, домен и кукис.pdf")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("СЦЕНА-ЭПИЗОД-АКТ.pdf")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("Технология распознавания лиц.pdf")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
            // прочтите тут все pdf и сохраните нужные данные,
        // тк во время поиска сервер не должен уже читать файлы

    private PdfPage page(int i) {
        return null;
    }

    public String getPdfName() {
        return String.valueOf(Integer.parseInt(pdfName));
    }


    @Override
    public List<PageEntry> search(String word) {
        List<PageEntry> words = new ArrayList<>();
        Map<String, Integer> freqs = new HashMap<>();
        for (var word : words) {
            if (word.isEmpty()) {
                continue;
            }
            System.out.println(Main.engine.search("бизнес"));
            word = word.toLowerCase();
            freqs.put(word.toString(), freqs.getOrDefault(word, 0) + 1);
        }
        // тут реализуйте поиск по слову
        return Collections.emptyList();
    }

}
