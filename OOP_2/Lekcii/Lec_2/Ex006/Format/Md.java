package OOP_2.Lekcii.Lec_2.Ex006.Format;

import Lesson_08.Ex006.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class Md extends Lesson_08.Ex006.Format.TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".md", false)) {
            writer.write("## <Md Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
