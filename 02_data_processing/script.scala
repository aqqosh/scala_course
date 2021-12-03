import scala.collection.immutable._
import java.io.File
import util.Try

object DataCleaner {
    def main(args: Array[String]) {
        val dirPath :String = "pix2pixHD_v0.1/source";
        
        clearDenseposeData(dirPath)
    };

    def getListOfFiles(dirPath: String): List[String] = {

        val file = new File(dirPath)

        file.listFiles.filter(_.isFile)
            .filter(_.getName.endsWith("_IUV.png"))
            .map(_.getPath).toList;
    }
    
    def clearDenseposeData(dirPath: String) = {

        val filesPath = new File(dirPath)

        for (oldName <- filesPath.listFiles) {
            if (oldName.getName.endsWith("_IUV.png")) {

                var newName: String = oldName.getName.dropRight(8)

                newName = newName + ".png"
                oldName.renameTo(new File(newName))

            } else {
                println(oldName.getName)
                oldName.delete()
            }
        }
    }


}

