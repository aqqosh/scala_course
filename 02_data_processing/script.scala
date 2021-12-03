import scala.collection.immutable._
import java.io.File
import util.Try

object DataCleaner {
    def main(args: Array[String]) {
        val dirPath :String = "pix2pixHD_v0.1/source";
        val result = getListOfFiles(dirPath); //calling a function
        
        getNewNames(result)
    };

    def getListOfFiles(dirPath: String): List[String] = {
        // defining a function
        val file = new File(dirPath)

        file.listFiles.filter(_.isFile)
            .filter(_.getName.endsWith("_IUV.png"))
            .map(_.getPath).toList;
    }
    
    def getNewNames(FileNames: List[String]) = {

        for (oldName <- FileNames) {
            if (oldName.endsWith("_IUV.png")) {
                var newName: String = oldName.dropRight(8)
                newName = newName + ".png"
                println(newName)
                new File(oldName).renameTo(new File(newName))
            } else {
                println(oldName)
            }
        }
    }


}

