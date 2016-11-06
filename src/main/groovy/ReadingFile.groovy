/**
 * Created by sjchen on 11/5/16.
 */
import java.io.File
class ReadingFile {
    static void main(String[] args) {
        File file= new File("./ReadMe.txt");
//        file.eachLine {
//            line -> println "line : $line";
//        }
        println file.text;
        println "The file ${file.absolutePath} has ${file.length()} bytes";
        println "File? ${file.isFile()}";
        println "File? "+file.isFile();

        println "Directory? ${file.isDirectory()}";
    }
}
