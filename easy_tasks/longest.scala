object Solution {
    def commonprefix(arr:Array[String], pref:String):String = {
        if (arr.distinct.length == 1) arr.distinct(0)
        else {
        val temp = arr.map(_.headOption match {case Some(ans) => ans
                                              case None => ""}).distinct
        if (temp.length == 1) commonprefix(arr.map(_.tail),pref+temp(0))
        else pref}
    }
    def longestCommonPrefix(strs: Array[String]): String = {
        if (strs.length == 1) strs(0)
        else if (strs.contains("")) ""
        else commonprefix(strs, "")
    }

}