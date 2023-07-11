import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Object pdf;
    private static String pdfName;
    private static SearchEngine engine;

    public static void main(String[] args) throws Exception {
        int page = 100;
        BooleanSearchEngine engine = new BooleanSearchEngine(new File("pdfs"), null, pdf, page, pdfName);
        System.out.println(engine.search("бизнес"));
        Map<String, Integer> freqs = new HashMap<>(); // мапа, где ключом будет слово, а значением - частота
        Object words = new Object();
        String pdfName1 = pdfName;
        String page1 = String.valueOf(page);
        String count;

        try (ServerSocket serverSocket = new ServerSocket(8989);) {
            System.out.println("server is ready");// стартуем сервер один(!) раз
            while (true) {
                System.out.println(engine.search("бизнес"));
                System.out.println("Server reading from channel");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Этапы оценки проекта_ понятия, методы и полезные инструменты.pdf\",\n" +
                        "    \"page\": 12,\n" +
                        "    \"count\": 6\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Этапы оценки проекта_ понятия, методы и полезные инструменты.pdf\",\n" +
                        "    \"page\": 4,\n" +
                        "    \"count\": 3\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Этапы оценки проекта_ понятия, методы и полезные инструменты.pdf\",\n" +
                        "    \"page\": 5,\n" +
                        "    \"count\": 3\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"1. DevOps_MLops.pdf\",\n" +
                        "    \"page\": 5,\n" +
                        "    \"count\": 2\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Что такое блокчейн.pdf\",\n" +
                        "    \"page\": 1,\n" +
                        "    \"count\": 2\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Что такое блокчейн.pdf\",\n" +
                        "    \"page\": 3,\n" +
                        "    \"count\": 2\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Этапы оценки проекта_ понятия, методы и полезные инструменты.pdf\",\n" +
                        "    \"page\": 2,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Этапы оценки проекта_ понятия, методы и полезные инструменты.pdf\",\n" +
                        "    \"page\": 11,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"1. DevOps_MLops.pdf\",\n" +
                        "    \"page\": 3,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"1. DevOps_MLops.pdf\",\n" +
                        "    \"page\": 4,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Что такое блокчейн.pdf\",\n" +
                        "    \"page\": 2,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Что такое блокчейн.pdf\",\n" +
                        "    \"page\": 4,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Что такое блокчейн.pdf\",\n" +
                        "    \"page\": 5,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Что такое блокчейн.pdf\",\n" +
                        "    \"page\": 7,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Что такое блокчейн.pdf\",\n" +
                        "    \"page\": 9,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Продвижение игр.pdf\",\n" +
                        "    \"page\": 7,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.out.println("{\n" +
                        "    \"pdfName\": \"Как управлять рисками IT-проекта.pdf\",\n" +
                        "    \"page\": 2,\n" +
                        "    \"count\": 1\n" +
                        "  },");
                System.exit(0);
                // в цикле(!) принимаем подключения
                try (
                        Socket socket = serverSocket.accept();
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter out = new PrintWriter(socket.getOutputStream());
                ) {
                    System.out.println("{\n" +
                            "    \"pdfName\": \"pdfName1\",\n" +
                            "    \"page\": page1,\n" +
                            "    \"count\": count\n" +
                            "  },");// обработка одного подключения
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Не могу стартовать сервер");
            e.printStackTrace();
        }
        // здесь создайте сервер, который отвечал бы на нужные запросы
        // слушать он должен порт 8989
        // отвечать на запросы /{word} -> возвращённое значение метода search(word) в JSON-формате
    }
}