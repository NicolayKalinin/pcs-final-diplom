import org.json.JSONObject;

public class PageEntry implements Comparable<PageEntry> {
    private final String pdfName;
    private final int page;
    private final int count;

    public PageEntry(String pdfName, int page, int count) {
        this.pdfName = pdfName;
        this.page = page;
        this.count = count;
    }

    @Override
    public int compareTo(PageEntry o) {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public PageEntry toLowerCase() {
        return null;
    }

    public String toString() {
        String map = null;
        JSONObject result = new JSONObject(map);
        return "\nPageEntry {\n " +
                "pgfName = '" + pdfName + "" +
                ",\n page = " + page +
                ",\n count = " + count +
                "\n}";
    }
}
