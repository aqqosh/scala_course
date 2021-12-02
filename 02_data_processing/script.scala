import scala.collection.immutable._
import java.io.File

object DataCleaner {
    def main(args: Array[String]) {
        val dirPath :String = "pix2pixHD_v0.1/source";
        val result = getListOfFiles(dirPath); //calling a function
        //println(result);
        getNewNames(result)
    };

    def getListOfFiles(dirPath: String): List[String] = {
        // defining a function
        val file = new File(dirPath)

        file.listFiles.filter(_.isFile)
            .filter(_.getName.endsWith("_IUV.png"))
            .map(_.getPath).toList;
    }
}