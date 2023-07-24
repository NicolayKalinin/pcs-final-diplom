import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BooleanSearchEngine implements SearchEngine {
    private static int count;
    private static int page;
    private String pdf;
    PdfDocument doc;
    private static String pdfName;

    public BooleanSearchEngine(File pdfsDir, java.io.File pdf) throws IOException {
        File dir = new File("C://Users//Николай Калинин//IdeaProjects//psc-final-diplom//pdfs");
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


    public BooleanSearchEngine(File pdfs) throws IOException {

    }

    public BooleanSearchEngine() throws IOException {

    }

    private PdfPage page(int i) {
        return null;
    }

    public BooleanSearchEngine(File pdfs, File var, Object pdf, int page, String pdfName) throws IOException {
        this.page = page;
        this.pdfName = pdfName;
    }

    private BooleanSearchEngine(
            @JsonProperty String pdfName,
            @JsonProperty int page,
            @JsonProperty int count
    ) throws IOException {
        this.pdfName = pdfName;
        this.page = page;
        this.count = count;
    }

    public String getPdfName() {
        return String.valueOf(Integer.parseInt(pdfName));
    }
    public static int getPage() {
        return page;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "\n pdfName=" + pdfName +
                "\n page=" + page +
                "\n count=" + count;
    }
    
    @Override
    public List<PageEntry> search(String word) {
        List<PageEntry> words = new ArrayList<>();
        Map<String, Integer> freqs = new HashMap<>();
        for (PageEntry s : words) {
            if (word.isEmpty()) {
                continue;
            }
            BooleanSearchEngine engine = null;
            System.out.println(engine.search("бизнес"));
            word = word.toLowerCase();
            freqs.put(word.toString(), freqs.getOrDefault(word, 0) + 1);
        }
        // тут реализуйте поиск по слову
        return Collections.emptyList();
    }

    private Object setPdfs(File pdfs) {
        return null;
    }

    public String valueOf(int page) {
        return null;
    }
}
